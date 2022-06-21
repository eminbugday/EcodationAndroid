package tutorials.HomeWork_Projeler;

import java.util.Scanner;

public class _00_01_HesapMakinesi {


    public static void main(String[] args) {

        Scanner taranacaksayi = new Scanner(System.in);

        System.out.println("1. sayiyi girin");
        int sayi1 = taranacaksayi.nextInt();
        System.out.println("2. sayiyi girin");
        int sayi2 = taranacaksayi.nextInt();

        System.out.println(sayi2*sayi1);
        System.out.println(sayi2-sayi1);
        System.out.println(sayi2+sayi1);
        System.out.println(sayi2/sayi1);
    }
}
