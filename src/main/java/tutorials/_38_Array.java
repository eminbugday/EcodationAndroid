package tutorials;

import java.util.Arrays;
import java.util.Random;

public class _38_Array {

    // 5 tane random sayiyi diziye atayan algoritma yazalim ekranda bu sayilari gosterecek
    // method ile yapmak
    //dizilerle yapmak

    public static int[] randomArray(){
        int []  dizi=new int[5];
        for (int i = 0; i <5; i++) {
            Random random=new Random();
            dizi[i]=random.nextInt(5)+1;
        }
        for (int temp:dizi) {
            System.out.println(temp+" ");
        }
        return dizi;
    }




    public static void main(String[] args) {
        int[] arr=new int[8];

        //diziler sifirinci indiste baslar
        //5 elemanli dedik 4 tane eleman sigar diziye
        // dizilerde indiste arada birane eleman yoksa otomatik
        // sifir 0 veriyo o na mesela 16 sayisi verdigimiz dizi yoksa orasi sifir
        //dizideki eleman sayisi kadar dememiz icin arr.length kullaniyoruz
        // her seferinde dizi sayisiniz degistirmeye gerek kalmasin diye
        arr[0]=4;
        arr[1]=8;
        arr[2]=16;
        arr[6]=32;
        arr[7]=64;

        Arrays.sort(arr);

        //int[] arr= {4,8,16,32,64};    // dizileri bu yapidada kullana biliriz

        //System.out.println(arr[3]);

        //iterative for
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\n####################");

        //forEach
        for ( int temp : arr){
            System.out.print(temp+" ");
        }

        System.out.println("\n####################");

        //Arrays.asList(arr).forEach(System.out::println);
    }
}
