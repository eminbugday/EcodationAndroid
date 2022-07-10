package tutorials;
import java.util.Scanner;
public class _40_MultiArrayExamples {
    //kullan�c�dan al�ncak 5 tane say�y� diziye atayal�m
    //1-)eleman toplamlar�
    //2-)tek say�lar�  toplamlar�
    //3-)�ift say�lar�  toplamlar�
    //4-)ortalamas�
    public static int[] resultArray() {
        Scanner klavye = new Scanner(System.in);
        int[] dizi = new int[10];
        int sum=0,oddArray=0,evenArray=0;
        int number = 0;

        for (int i = 0; i <dizi.length; i++) {
            System.out.println((i+1) + ". say�y� giriniz");
            number = klavye.nextInt();
            dizi[i] = number;
            sum+=dizi[i];
            if(dizi[i]%2==0){
                evenArray+=dizi[i];
            }else{
                oddArray+=dizi[i];
            }
        }

        for (int temp : dizi) {
            System.out.print(temp + " ");
        }
        System.out.println("\ntoplamlar�: "+sum);
        System.out.println("tek say� toplamlar�: "+oddArray);
        System.out.println("�ift say� toplamlar�: "+evenArray);
        return dizi;
    }

    public static void main(String[] args) {
        int [] arr=resultArray();
    }
}
