import java.io.File;
import java.io.IOException;

public class DirectoryProcessor {
    public static void processDirectory(File directory) throws IOException {
        FileCreator.createFile(directory);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    processDirectory(file);
                }
            }
        }
    }
}
