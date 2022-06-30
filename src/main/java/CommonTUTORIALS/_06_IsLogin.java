package CommonTUTORIALS;
import java.util.Scanner;

// Kullan�c�dan al�nan bilgilere g�re do�ru kullan�c� ad� ve �ifre girerse sisteme giri� sa�lanacak
// yoksa deneme hakk� 4"ten ba�layarak a�a��ya do�ru azalacak
// deneme hakk� e�er 0 olursa sistemden atacak ve hesab�n� bloke konulacak. Dizi ile yapmaya �al��al�m.
// defaultta
// kullan�c� ad: admin
// �ifre:root
public class _06_IsLogin {
    //static sabit de�i�kenler,counter,dedaultEmail,defaultSifre
    private static int counter = 4;
    private static String defaultEmail ="root";
    private static String defaultSifre = "123";

    // Klavye method
    public static String[] LoginDizi() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Kullan�c� emaili giriniz");
        String email = klavye.nextLine();
        System.out.println("Kullan�c� �ifre giriniz");
        String sifre = klavye.nextLine();
        String[] dizi = {email, sifre};
        return dizi;
    }

    //admin method sayfas�
    public static void adminMethod() {
        System.out.println("******************************************************************************");
        System.out.println("ADM�N SAYFASI");
        System.exit(0);
    }

    //loginMethod
    public static void loginMethod(){
        try {
            int kalanhak = 4;
            while (true) {
                if (kalanhak >= 0) {
                    String[] dizi = LoginDizi();
                    if (dizi[0].equals(defaultEmail) && dizi[1].equals(defaultSifre)) {
                        System.out.println("�ifreniz ve emailiniz do�rudur Admin sayfas�na y�nlendiriliyorsunuz...");
                        adminMethod();
                    } else {
                        kalanhak--;
                        System.out.println("Kalan Hakk�n�z: " + kalanhak);
                        if (kalanhak == 0) {
                            System.out.println(
                                    "Kart�n�z Bloke oldu L�tfen M��teri Hizmetrelini aray�n�z 0850 00000 55522 ");
                            System.exit(0);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // PSVM
    public static void main(String[] args) {
        loginMethod();
    }
}
