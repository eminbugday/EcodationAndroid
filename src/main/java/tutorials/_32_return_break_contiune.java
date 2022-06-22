package tutorials;

import java.util.Scanner;

public class _32_return_break_contiune {

    public static void main(String[] args) {


        // return metodu kirmak
        // break donguyu kirar
        // contiune sadece o dongude calismasin sonra devam etsin

        // kullanici tarafindan verilen bir sayiya kadar toplamlari hesaplamasin
        // eger verilen sayida 10 varsa bu toplamaya eklenmesin
        // eger kullanici secretkey adinda yani 44 vermisse sistemden hemen ciksin hic toplamasin

        Scanner klavye=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int number= klavye.nextInt();
        int sum=0;
        for (int i = 1; i <=number; i++) {
            if (number==44){
                System.out.println("secretkey verdiniz sistemden cikiliyor");
                break;
            }
            if (i==10)
                continue;
            sum=sum+i;
        }
        System.out.println("toplamlari: "+sum);

    }
}
