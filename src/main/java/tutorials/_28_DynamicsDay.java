package tutorials;

import java.util.Date;

public class _28_DynamicsDay {

    public static void main(String[] args) {

        //Sistem tarihinde (Date) gunlerden bugun Pazartesi ise
        //Switch case
        //0=pazar 1=pazartesi


        int day= new Date().getDay();
        System.out.println(day);

        switch (day) {
            case 0:
                System.out.println("pazar");
                break;
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            default:
                System.out.println("cumartesi");
                break;
        }
    }
}
