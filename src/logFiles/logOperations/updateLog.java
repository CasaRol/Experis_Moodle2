package logFiles.logOperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

import SystemTime.dateTime;

public class updateLog {

    String localDir = System.getProperty("user.dir");

    public boolean update(String update, double duration) {
        File file = new File(localDir + File.separator + "logFiles/logs.txt");
        try(BufferedWriter bufWrite = new BufferedWriter(new FileWriter(file, true))) {

            //Create new logfile if current doesn't exist
            if(!file.exists()) {
                file = new File(localDir + File.separator + "logFiles/logs.txt");
            }

            //Adding one line per log update NOT overriting existing file
            bufWrite.write(dateTime.getDateTime() + ": " + update + " - Computation took " + duration + "ms\n");
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
