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

    public void directoryfiles() {

        String[] result;

        File directoryContent = new File("src/assets");

        result = directoryContent.list();

        for (String dir : result) {
            System.out.println(dir);    
        }
    }

    private double fileSize(String fileName) {

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

    private int linereader(String fileName) {

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

    private boolean searchWord(String fileName, String word) {

        try (BufferedReader bufRead = new BufferedReader(new FileReader("src/assets/" + fileName))) {
            String line;
            while ((line = bufRead.readLine()) != null) {
                if (line.toLowerCase().contains(word)) {
                    return true;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    private int wordcount(String fileName, String word) {
        int wordCount = 0;

        try (BufferedReader bufRead = new BufferedReader(new FileReader("src/assets/" + fileName))) {
            
            String line;
            while ((line = bufRead.readLine()) != null) {
                if (line.toLowerCase().contains(word)) {
                    wordCount++;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordCount;
        
    }

    public double getFileSize(String fileName) {
        return fileSize(fileName);
    }

    public int getLinereader(String fileName) {
        return linereader(fileName);
    }

    public boolean getSearchWord(String fileName, String word) {
        return searchWord(fileName, word);
    }

    public int getWordcount(String fileName, String word) {
        return wordcount(fileName, word);
    }
}