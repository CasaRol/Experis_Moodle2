package fileActions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Actions
 */
public class Actions {

    String localDir = System.getProperty("user.dir");

    public void directoryfiles() {

        String[] result;

        //Reading titles from directory
        File directoryContent = new File(localDir + File.separator + "assets");

        result = directoryContent.list();

        //Printing directory titles
        for (String dir : result) {
            System.out.println(dir);    
        }
    }

    private double fileSize(String fileName) {

        //Setting local path for assets including requested file
        final String FILE_PATH = (localDir + File.separator + "assets/" + fileName);

        File myFile = new File(FILE_PATH);

        if (!myFile.exists()) {
            System.out.println("File not found, please try again");
            System.out.println("Make sure to trype the name correctly aswell as include the file extension");
            Scanner scan = new Scanner(System.in);
            String newFile = scan.nextLine();
            scan.close();
            fileSize(newFile);
        }

        //Returning filesize in bytes
        return (myFile.length() / 1024);
    }

    private int linereader(String fileName) {

        int lines = 0;
        //BufferedReader is part of autocloseable when used in try-with-resources
        try (BufferedReader bufRead = new BufferedReader(new FileReader(localDir + File.separator + "assets/" + fileName))) {
            
            //While line is not null, file continues
            while (bufRead.readLine() != null) {
                lines++;
            }

        } catch (FileNotFoundException fnf){
            fnf.printStackTrace();

        } catch (IOException ioe) {
            ioe.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();

        }

        return lines;
    }

    private boolean searchWord(String fileName, String word) {

        //BufferedReader is part of autocloseable when used in try-with-resources
        try (BufferedReader bufRead = new BufferedReader(new FileReader(localDir + File.separator + "assets/" + fileName))) {
            String line;
            //Setting line equal to the next line in order to not skip any lines
            while ((line = bufRead.readLine()) != null) {
                //lowercasing both line and user input to maximize result success
                if (line.toLowerCase().contains(word.toLowerCase())) {
                    return true;
                }

            }

        } catch (FileNotFoundException fnf){
            fnf.printStackTrace();

        } catch (IOException ioe) {
            ioe.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();

        }

        return false;
    }

    private int wordcount(String fileName, String word) {
        int wordCount = 0;

        //BufferedReader is part of autocloseable when used in try-with-resources
        try (BufferedReader bufRead = new BufferedReader(new FileReader(localDir + File.separator + "assets/" + fileName))) {
            
            String line;
            while ((line = bufRead.readLine()) != null) {
                //lowercasing both line and user input to maximize result success
                if (line.toLowerCase().contains(word.toLowerCase())) {
                    wordCount++;
                }

            }

        } catch (FileNotFoundException fnf){
            fnf.printStackTrace();

        } catch (IOException ioe) {
            ioe.printStackTrace();

        } catch (Exception e) {
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