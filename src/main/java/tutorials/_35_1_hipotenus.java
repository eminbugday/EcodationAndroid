package tutorials;

import java.util.Scanner;

public class _35_1_hipotenus {

    //bir ucgenin hipotenesunun kullanicidan alinan iki kenarina gore hipotenusunu hesaplayan method yaziniz?
    //Scanner voidsiz parametreleri  metot

    public static double hipotenus(double x1, double x2){
        return Math.sqrt(Math.pow(x1,2)+Math.pow(x2,2));
    }

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("1.sayi giriniz");
        double number1=klavye.nextDouble();


        System.out.println("2.sayi giriniz");
        double number2=klavye.nextDouble();

        double result=hipotenus(number1,number2);
        System.out.println(result);
    }
}
