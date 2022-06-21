package tutorials;

public class _19_StringBuilder {

    public static void main(String[] args) {


        //builder birlestirme
        //String birlestirme


        String adi="Hamit", soyadi="Mizrak";



        //1-)birlestirme

        String birlestirme1 = adi+soyadi;       // + Birlestirmeye yariyor
        System.out.println(birlestirme1);

        String birlestirm11 = adi+soyadi;
        System.out.println(birlestirm11);

        //2-)birlestirme                        // adi.concat(soyadi)
        String birlestirme2=adi.concat(soyadi);
        System.out.println(birlestirme2);





        //3-)birlestirme

        StringBuilder birlestirme3 = new StringBuilder();       //yukarida hamit ve mizrak kelimelerini string olarak atadik
        birlestirme3.append(adi).append(soyadi);                //birlestime3 olarak tanimladigimiz stringi
        String stringTo=birlestirme3.toString();                //.append(adi)hemen arkasindan tekrar.append(soyadi)
        System.out.println(stringTo);                           //ekleyerek kelimeleri birlestirdik append ile

        //4-)
        StringBuffer birlestirme4=new StringBuffer();
        birlestirme4.append(adi).append(soyadi);
        String stringTo2 = birlestirme4.toString();
        System.out.println(birlestirme4);




    }
}
