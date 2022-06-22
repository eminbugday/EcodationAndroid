package tutorials;

import java.util.Random;

public class _33_ExamplesOddEven {

    public static void main(String[] args) {


        //rastgele olusturulan 10 tane sayinin
        //1.adim: toplamlari
        //2.adim: cift sayilar toplami
        //3.adim: tek sayilar toplami


        int sum=0, evenSum=0, oddSum=0;
        Random random=new Random();
        for (int i = 1; i < 10; i++) {
            int number = random.nextInt(10)+1;   // nextint yapisi baslangiz degeri +1 sonuna yaziyoruz
            System.out.print(number+" ");              // bitis degeri bound 10 icine yaziyoruz
            sum=sum+number;

            if (number%2==0) {//cift sayilar
                evenSum += number;
            }else {
                oddSum=oddSum+number;
            }
        }

            System.out.println("toplamlari "+sum);
            System.out.println("cift sayilar toplami "+evenSum);
            System.out.println("tek sayilar toplami "+oddSum);
    }
}
