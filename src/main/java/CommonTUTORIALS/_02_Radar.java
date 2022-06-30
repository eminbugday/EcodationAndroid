package CommonTUTORIALS;
import java.util.Scanner;
public class _02_Radar {


    //kullanici tarafindan alinan bir sayiya gore ceza kesilecektir
    //hizi:1 ise para cezasi:0 TL       ==>
    //hizi:80 ise para cezasi:800 TL
    //hizi:95 ise para cezasi:1200 TL
    //hizi:120 ise para cezasi:2000 TL
    //sofor kac kere trafik cezasi yerse parayi toplayarak eklesin

    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("anonim hiz girisi yapiniz");
        int gostergedekihiz = klavye.nextInt();
        System.out.println(gostergedekihiz);

        if (1<=gostergedekihiz && gostergedekihiz<=80) {
            int toplamceza = 800;
            System.out.println(toplamceza+" DOLAR CEZA YEDINIZ HAYIRLI OLSUN");
        }if (95<=gostergedekihiz && gostergedekihiz<=119) {
            int toplamceza2 = 1200;
            System.out.println(toplamceza2+" DOLAR CEZA YEDINIZ HAYIRLI OLSUN");
        }if (120<=gostergedekihiz && gostergedekihiz<= args.length) {
            int toplamceza3 = 2000;
            System.out.println(toplamceza3 + " DOLAR CEZA YEDINIZ HAYIRLI OLSUN");
        }
        else System.out.println("cezasiz gecis yapti");
    }


    //kullanicidan veri almak


    private static  int AMOUNT=0;
    private static  int HOW_MANY=0;
    public static void radar() {
            Scanner klavye = new Scanner(System.in);
            System.out.println("anonim hiz girisi yapiniz");
            int gostergedekihiz = klavye.nextInt();
            System.out.println(gostergedekihiz);

            if (80<=gostergedekihiz && gostergedekihiz<=94) {

            }
    }
}
