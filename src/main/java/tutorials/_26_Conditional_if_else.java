package tutorials;

public class _26_Conditional_if_else {

    public static void main(String[] args) {

        //if else


        int number = 5;

        if       (number == 1) {
            System.out.println("sayi 1");
        }else if (number == 2) {
            System.out.println("sayi 2");
        }else if (number == 3) {
            System.out.println("sayi 3");
        }else if (number == 4) {
            System.out.println("sayi 4");
        }else if (number == 5) {
            System.out.println("sayi 5");
        }else if (number == 6) {
            System.out.println("sayi 6");
        }else if (number == 7) {
            System.out.println("sayi 7");
        }else {
            System.out.println("Farkli sayilardir");
        }



        System.out.println("*********************");
        switch (number) {
            case 1:
                System.out.println("sayi 1");
                break;
            case 2:
                System.out.println("sayi 2");
                break;
            case 3:
                System.out.println("sayi 3");
                break;
            case 4:
                System.out.println("sayi 4");
                break;
            case 5:
                System.out.println("sayi 5");
                break;
            case 6:
                System.out.println("sayi 6");
                break;
        }

    }
}
