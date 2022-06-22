package tutorials;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _24_Date {

    public static void main(String[] args) {


        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: "+myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: "+ formatedDate);

    }
}
