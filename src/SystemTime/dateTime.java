package SystemTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateTime {

    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    public static String getDateTime() {
        Date date = new Date(); // This object contains the current date value

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); //Formatting for the date

        return formatter.format(date);
    }
    
}
