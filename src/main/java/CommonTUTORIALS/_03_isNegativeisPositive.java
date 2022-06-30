package CommonTUTORIALS;

import java.util.Scanner;

// Kullan�c� taraf�ndan al�nan bir say� negatif mi pozitif mi ?
public class _03_isNegativeisPositive {

    //kullan�c�dan veri almak
    public static int dataScanner() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("++++++++++++++\nsay� giriniz");
        int data = klavye.nextInt();
        return data;
    }

    //radar method
    public static void isNumber() {
        int number = dataScanner();

        if (number >= 0) {
            System.out.println("pozitif");
            //System.exit(0);
            return;
        } else {
            System.out.println("negatif");
        }
    }

    public static void main(String[] args) {
        while (true) {
            isNumber();
        }
    }
}
