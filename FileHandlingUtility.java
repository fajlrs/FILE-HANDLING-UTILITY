import java.io.*;
import java.util.Scanner;

public class FileHandlingUtility {

    private static final String FILE_NAME = "sample.txt";

    // Write content to file
    public static void writeFile(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write(content);
            System.out.println("✅ File written successfully!");
        } catch (IOException e) {
            System.out.println("❌ Error writing file: " + e.getMessage());
        }
    }

    // Read content from file
    public static void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n📄 File Content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }
    }

    // Modify file (append text)
    public static void modifyFile(String newContent) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.newLine();
            writer.write(newContent);
            System.out.println("✅ File modified successfully!");
        } catch (IOException e) {
            System.out.println("❌ Error modifying file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== FILE HANDLING UTILITY =====");
        System.out.println("1. Write to File");
        System.out.println("2. Read File");
        System.out.println("3. Modify File");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter text to write: ");
                String writeText = scanner.nextLine();
                writeFile(writeText);
                break;
            case 2:
                readFile();
                break;
            case 3:
                System.out.print("Enter text to append: ");
                String modifyText = scanner.nextLine();
                modifyFile(modifyText);
                break;
            default:
                System.out.println("❌ Invalid option!");
        }

        scanner.close();
    }
}