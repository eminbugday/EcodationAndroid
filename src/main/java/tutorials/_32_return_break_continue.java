package tutorials;

import java.util.Scanner;

public class _32_return_break_continue {
    public static void main(String[] args) {

         //return : metotu k?rmak gelir
        //break: d?ng?y? k?rar
        //continue: sadece o d?ng?de ?al??mas?n sonra devam etsin

        //Kullan?c? taraf?ndan verilen bir say?ya kadar toplamlar? hesaplanas?n
        //E?er verilen say?da 10 varsa bu toplamaya eklenmesin
        //E?er kullan?c? secretKEy ad?nda yani 44 vermi?se sistemden hemen ??ks?n(H?? toplamas?n)

        Scanner klavye=new Scanner(System.in);
        System.out.println("Bir say? giriniz");
        int number= klavye.nextInt();
        int sum=0;
        for (int i = 1; i <=number ; i++) {
            if(number==44){
                System.out.println("SecretKey verdiniz sistemden ??k?l?yor");
                break;
            }

            if(i==10)
                continue;

            sum=sum+i;
        }

        System.out.println("Toplamlar?: "+sum);

        //try catch
        //metotlar?
        //final
        //static
        //diziler
    }
}
