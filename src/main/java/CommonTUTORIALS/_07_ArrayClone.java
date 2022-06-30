package CommonTUTORIALS;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// kullan�c�dan al�nan say� kadar dizi eleman� olsun rastgele 1-10 aras�ndaki
// bu diziyi bir diziye atayal�m sonra bu diziyi ba�ka bir diziye clone edelim.
// clonelanm�� bu dizi bu say�lar� k���kten  b�y��e do�ru s�ralay�n
// en k���k say�y� ve en b�y�k say�y� bulal�m ? ( diziyele yapal�m)
// bu say�lar�n toplam�n�
// bu say�lar�n ortalamas�
// tek say�lar ka� tane ve tek say� toplamlar�
// �ift say�lar  ka� tane ve �ift say� toplamlar�
// dizilerde en b�y�k 2. say� bulal�m

public class _07_ArrayClone {

    //kullac�dan  eleman say�s�n� almak
    public static int userNumber() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Dizi eleman say�s�n� giriniz");
        int number = klavye.nextInt();
        return number;
    }

    //rastgele 1-10 aras�ndaki  5 tane say�y� bir diziye atayan method
    public static int[] returnRandomArray() {
        int[] dizi = new int[userNumber()];
        Random random = new Random();
        for (int i = 0; i < dizi.length; i++) {
            int number = random.nextInt(10) + 1;
            dizi[i] = number;
        }
        return dizi;
    }

    public static void resultArraySortingBigNumber(int[] dizi) {

        //clone al�nacak
        int[] clone = new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            clone[i] = dizi[i];
        }

        //diziyi s�ralas�n
        Arrays.sort(clone);
        for (int temp : clone) {
            System.out.print(temp + " ");
        }

        //say� toplam� ve ortalamas�
        double sum=0,average=0;
        for (int i = 0; i < clone.length; i++) {
            sum+=clone[i];
        }

        System.out.println("\nen k���k say�: " + clone[0]);
        System.out.println("en b�y�k say�: " + clone[clone.length - 1]);
        System.out.println("toplamlar�: " + sum);
        System.out.println("ortalama: " + sum/clone.length);
    }

    //PSVM
    public static void main(String[] args) {
        resultArraySortingBigNumber(returnRandomArray());
    }
}
