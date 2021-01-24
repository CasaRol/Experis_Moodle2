package logFiles.logOperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

import SystemTime.dateTime;

public class updateLog {

    String localDir = System.getProperty("user.dir");

    public boolean update(String update) {
        File file = new File(localDir + File.separator + "logFiles/logs.txt");
        try(BufferedWriter bufWrite = new BufferedWriter(new FileWriter(file, true))) {

            if(!file.exists()) {
                file = new File(localDir + File.separator + "logFiles/logs.txt");
            }

            bufWrite.write(dateTime.getDateTime() + ": " + update + "\n");
            bufWrite.flush();

        } catch(FileNotFoundException fnf) {
            fnf.printStackTrace();

            return false;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
    
}
