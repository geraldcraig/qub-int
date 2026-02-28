package uk.ac.qub.example;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uk.ac.qub.service.UsersImportService;

import java.nio.file.Paths;

/**
 * Example usage of AlbumImportService.
 * This class runs on application startup and imports albums from CSV.
 *
 * To enable this, uncomment the @Component annotation below.
 * Or you can use the REST endpoint: POST /api/import/albums
 */
@Component
@RequiredArgsConstructor
public class UsersImport implements CommandLineRunner {

    private final UsersImportService usersImportService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting user import from CSV...");

        // Path to your CSV file
        String csvFilePath = "/Users/geraldcraig/Repos/copilot-recordwebsite/src/main/resources/data/users.csv";

        try {
            usersImportService.importUsersFromCsv(Paths.get(csvFilePath));
            System.out.println("User import completed successfully!");
        } catch (Exception e) {
            System.err.println("Error importing users: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

