package Enumx;

public class EnumMainClass {

    public static void main(String[] args) {
        //Enum java 5 ile gelmi�tir
        // t�r g�venli�i(type safe) sa�lar

        Gunler gunler = Gunler.PAZARTESI;
        System.out.println(gunler);

        //ordinal s�f�rdan ba�lar
        System.out.println("S�ra: " + gunler.ordinal());

        //name
        System.out.println("name: " + gunler.name());

         //values ==> dizi
        System.out.println(Gunler.values()[0]);

        //normal
        System.out.println(Gunler.CARSAMBA);

        //string'e cevrilmi� enum
        String data = Gunler.SALI.toString();
        System.out.println(data);

        System.out.println("******************");
        for (Gunler temp : Gunler.values()) {
            System.out.print(temp + " ");
        }
    }
}
