package SystemTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateTime {

    Date date = new Date(); // This object contains the current date value

    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    public static String getDateTime() {
        Date date = new Date(); // This object contains the current date value

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        return formatter.format(date);
    }
    
}
