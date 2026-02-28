package uk.ac.qub.example;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uk.ac.qub.service.AlbumImportService;

import java.nio.file.Paths;

@Component
@RequiredArgsConstructor
public class AlbumImport implements CommandLineRunner {

    private final AlbumImportService albumImportService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting album import from CSV...");

        // Path to your CSV file
        String csvFilePath = "/Users/geraldcraig/Repos/qub-int/RecordWebsite/src/main/resources/data/album_list_new.csv";

        try {
            albumImportService.importAlbumsFromCsv(Paths.get(csvFilePath));
            System.out.println("Album import completed successfully!");
        } catch (Exception e) {
            System.err.println("Error importing albums: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
