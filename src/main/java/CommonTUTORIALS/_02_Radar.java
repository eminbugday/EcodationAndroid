package CommonTUTORIALS;

import java.util.Scanner;

// Kullan�c� taraf�ndan al�nan bir say�ya g�re ceza kesilecektir.
// H�z�:79 kadar ise para cezas�  : 0 TL      ==>  1<=speed<=79
// H�z�:80 ise para cezas� : 800 TL h�zl�s�n�z   ==>  80<=speed<=94
// H�z�:95 ise para cezas� : 1200 TL �ok h�zl�s�n�z   ==>  95<=speed<=119
// H�z�:120 ise para cezas�: 2000 TL  tehlikeli h�zl�s�n�z ==>  speed>=120
// Sof�r ka� kere trafik cezas� yedi�ini ve toplam para cezas�n�
// ve e�er toplam ceza say�s� 5 ve �st�ne ise ehliyetine el konulsun  hesaplayan algoritma yazal�m ?
public class _02_Radar {

    private static int AMOUNT = 0;
    private static int HOW_MANY = 0;

    //kullan�c�dan veri almak
    public static int dataScanner() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("++++++++++++++\nH�z�n�z� giriniz");
        int data = klavye.nextInt();
        return data;
    }

    //radar method
    public static void radar() {
        int speed = dataScanner();

        if (HOW_MANY >= 5) {
            System.out.println("Ehliyetine el konuldu");
            //System.exit(0);
            return;
        } else {
            if (80 <= speed && speed <= 94) {
                AMOUNT = AMOUNT + 800;
                HOW_MANY++;
                System.out.println("+++++++++\nH�z�n�z: " + speed + " yava�lay�n:\npara cezas�:800TL \ntoplam para cezan�z: " + AMOUNT + "\ntoplam ceza say�s�: " + HOW_MANY);
            } else if (95 <= speed && speed <= 119) {
                AMOUNT += 1200;
                HOW_MANY++;
                System.out.println("+++++++++\nH�z�n�z: " + speed + " yava�lay�n:\npara cezas�:1200TL \ntoplam para cezan�z: " + AMOUNT + "\ntoplam ceza say�s�: " + HOW_MANY);
            } else if (speed >= 120) {
                AMOUNT += 2000;
                HOW_MANY++;
                System.out.println("+++++++++\nH�z�n�z: " + speed + " yava�lay�n:\npara cezas�:2000TL \ntoplam para cezan�z: " + AMOUNT + "\ntoplam ceza say�s�: " + HOW_MANY);
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            radar();
        }
    }
}
