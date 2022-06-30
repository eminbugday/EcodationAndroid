package Enumx;

public class EnumMainClass {

    public static void main(String[] args) {
        System.out.println(Gunler.CARSAMBA);

        Gunler gunler=Gunler.PERSEMBE;
        System.out.println(gunler);

        //ordinal sifirdan baslar
        System.out.println("sira: "+gunler.ordinal());

        System.out.println("name: "+ gunler.name);


        //values==> dizi
        System.out.println(Gunler.values()[0]);

        //normal
        System.out.println(Gunler.CARSAMBA);

        //stringe cevrilmis enum
        String data=Gunler.SALI.toString();
        System.out.println(data);

        System.out.println("#################");
        for (Gunler temp:Gunler.values()) {
            System.out.println(temp + " ");
        }
    }
}
