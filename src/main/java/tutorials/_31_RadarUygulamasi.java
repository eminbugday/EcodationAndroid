package tutorials;

import java.util.Scanner;

public class _31_RadarUygulamasi {

    public static void main(String[] args) {

        //trafikte radar uygulamasinda eger hizimiz 90 ustunde ise hizli gidiyorsunuz diye yazsin para cezasi 800 tl
        //trafikte radar uygulamasinda eger hizimiz 100 ustunde ise hizli gidiyorsunuz diye yazsin para cezasi 1200 tl

        Scanner klavye = new Scanner(System.in);
        System.out.println("hiziniz");
        int speed = klavye.nextInt();
        int total=0;



        if (90<=speed && speed<=99) {
            total=800;
            System.out.println(total);
        }if (100<=speed && speed<=180) {
            total=1200;
            System.out.println(total);

        }else System.out.println("ceza kesilmedi");

    }
}
