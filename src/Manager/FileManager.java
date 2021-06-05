package Manager;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class FileManager {
    public File file;
    public Scanner fileReader;
    public Writer fileWriter;

    public FileManager(File file, Writer fileWriter, Scanner fileReader) {
        this.file = file;
        this.fileWriter = fileWriter;
        this.fileReader = fileReader;
    }

    public Scanner readFile(String fileName) {
        file = new File(fileName);

        try {
            fileReader = new Scanner(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return fileReader;
    }

    public void writeFile(String fileName, String result) {
        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write(result);
            fileWriter.flush(); // You don't have to use Flush
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
