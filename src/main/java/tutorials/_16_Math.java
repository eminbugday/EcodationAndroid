package tutorials;

public class _16_Math {

    public static void main(String[] args) {
        //Mathematic: static

        System.out.println(Math.PI);  //pi sayisi
        System.out.println(Math.E);   // e sayisi

        System.out.println("Karakok: "+Math.sqrt(16)); // karakok
        System.out.println("Mutlak Deger: "+Math.abs(-87));
        System.out.println("En kucuk sayi "+Math.min(-50,-287));
        System.out.println("En buyuk sayi "+Math.max(-21,89));
        System.out.println("Uslu sayilar "+Math.pow(2,7));
        System.out.println("Rastgele sayi "+Math.random()*4+1);

        System.out.println("Asagi yuvarlamak sayi: "+Math.floor(2.9)); // dipten geliyor animsa zemin assa yuvarliyor
        System.out.println("Asagi: "+Math.ceil(2.1)); // hepyukari yuvarliyor ceil
        System.out.println("Round: "+Math.round(6.4)); //4 ten assasini assa yuvarliyor
        System.out.println("Round: "+Math.round(6.5)); //5 ten yukarsini yukari yuvarliyor





    }
}
