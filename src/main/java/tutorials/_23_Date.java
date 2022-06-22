package tutorials;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _23_Date {

    public static void main(String[] args) {


        //LocalDate: yil ay gun
        LocalDate myObj1 = LocalDate.now(); //creat a date object
        System.out.println(myObj1);         //Display the current date


        System.out.println("* **************");

        //LocalTime: saat dakika saniye
        LocalTime myObje2 = LocalTime.now();
        System.out.println(myObje2);

        System.out.println("********************");

        //LocaleDateTime: yil ay gun / saat dakika saniye
        LocalDateTime myObje3 = LocalDateTime.now();
        System.out.println(myObje3);



    }
}
