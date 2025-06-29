import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите абсолютный путь к директории: ");
        String rootPath = scanner.nextLine();

        File rootDir = new File(rootPath);
        if (!rootDir.exists()) {
            System.out.println("Неправильно указан путь!");
            return;
        }
        if (!rootDir.isDirectory()) {
            System.out.println("Путь не ведет к директории!");
            return;
        }

        try {
            DirectoryProcessor.processDirectory(rootDir);
            System.out.println("Файлы успешно созданы");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

}