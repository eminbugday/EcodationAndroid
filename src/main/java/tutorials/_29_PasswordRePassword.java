package tutorials;

import java.util.Scanner;

public class _29_PasswordRePassword {

    public static void main(String[] args) {


        //Kullanici tarafindan sifre ve (scanner)
        // sifre tekrari alicak ikisi karsilastiracak esit diyecek yoksa degildir


        Scanner klavye= new Scanner(System.in);
        String password,rePassword;

        System.out.println("sifre giriniz");
        password=klavye.nextLine();

        System.out.println("sifre tekrarini giriniz");
        rePassword=klavye.nextLine();

        if (password.equals(rePassword))
            System.out.println("sifre aynidir");

        else {
            System.out.println("sifre farklidir");
        }
    }
}
