package fileActions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Actions
 */
public class Actions {

    public String[] directoryfiles() {

        String[] result;

        File directoryContent = new File("src/assets");

        result = directoryContent.list();

        System.out.println(result);

        return result;
    }

    public double fileSize(String fileName) {

        final String FILE_PATH = ("src/assets/" + fileName);

        File myFile = new File(FILE_PATH);

        if (!myFile.exists()) {
            System.out.println("File not found, please try again");
            System.out.println("Make sure to trype the name correctly aswell as include the file extension");
            Scanner scan = new Scanner(System.in);
            String newFile = scan.nextLine();
            scan.close();
            fileSize(newFile);
        }
        return (myFile.length() / 1024);
    }

    public int linereader(String fileName) {

        int lines = 0;
        try (BufferedReader bufRead = new BufferedReader(new FileReader("src/assets/" + fileName))) {
            while (bufRead.readLine() != null) {
                lines++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    public boolean searchWord(String fileName, String word) {

        try (BufferedReader bufRead = new BufferedReader(new FileReader("src/assets/" + fileName))) {
            String line;
            while ((line = bufRead.readLine()) != null) {
                if (line.contentEquals(word)) {
                    return true;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
}