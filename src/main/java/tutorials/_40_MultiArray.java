package tutorials;


import java.util.Scanner;

// kullanicidan alinacak 5 tane sayiyi diziye atayalim
//1-) eleman toplamlari
//2-) tek sayilar toplamlari
//3-) cift sayilar toplamalari
//4-) ortalmasi

public class _40_MultiArray {
    public static int[] resultArray() {
        Scanner klavye = new Scanner(System.in);
        int[] dizi = new int[5];
        int sum = 0, oddArray = 0, evenArray = 0;
        int number = 0;
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i + 1) + ". sayiyi giriniz");
            number = klavye.nextInt();
            dizi[i] = number;
            sum += dizi[i];

            if (dizi[i] % 2 == 0) {
                evenArray += dizi[i];
            } else {
                oddArray += dizi[i];
            }
        }
            for (int temp : dizi) {
                System.out.print(temp + " ");
            }
            System.out.println("\ntoplamlari: " +sum);
            System.out.println("\ntek sayi toplamlari: "+oddArray);
            System.out.println("\ncift sayi toplamlari: "+evenArray);
            return dizi;
        }
    public static void main(String[] args) {
        int [] arr=resultArray();
    }
}





