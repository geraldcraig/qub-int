package uk.ac.qub.service;

import com.opencsv.CSVReader;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uk.ac.qub.model.Users;
import uk.ac.qub.repository.UsersRepository;

import java.io.FileReader;
import java.nio.file.Path;

@Service
@RequiredArgsConstructor
@Slf4j
public class UsersImportService {

    private final UsersRepository usersRepository;

    @Transactional
    public void importUsersFromCsv(Path csvFilePath) throws Exception{
        int recordsInserted = 0;

        try (CSVReader reader = new CSVReader(new FileReader(csvFilePath.toFile()))) {
            String[] line;

            reader.readNext();

            while ((line = reader.readNext()) != null) {
                try {
                    if (line.length < 6) {
                        log.warn("Skipping invalid row: insufficient columns");
                        continue;
                    }
                    String firstName = line[1];
                    String lastName = line[2];
                    String userName = line[3];
                    String userPassword = line[4];
                    Integer admin = Integer.parseInt(line[5]);

                    Users user = new Users();
                    user.setFirstName(firstName);
                    user.setLastName(lastName);
                    user.setUserName(userName);
                    user.setUserPassword(userPassword);
                    user.setAdmin(admin);

                    usersRepository.save(user);
                    recordsInserted++;

                } catch (Exception e) {
                    log.error("Error processing row: " + String.join(",", line), e);
                    continue;
                }
            }
            log.info(recordsInserted + " user imported successfully from.");
        }
    }
}
