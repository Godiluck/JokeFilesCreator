import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
    public static void createFile(File directory) throws IOException {
        String code = """
                public class joke {
                    public static void main(String[] args) {
                        System.out.println("Hello, World!");
                    }
                }
                """;
        File jokeFile = new File(directory, "joke.java");
        try (FileWriter writer = new FileWriter(jokeFile)) {
            writer.write(code);
        }
    }
}
