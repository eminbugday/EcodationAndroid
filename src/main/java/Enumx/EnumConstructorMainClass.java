package Enumx;

public class EnumConstructorMainClass {

    public static void main(String[] args) {
        Olcu olcu=Olcu.BUYUK;
        System.out.println("sira: "+olcu.ordinal());
        System.out.println("sira: "+olcu.getId());


        String value=Olcu.BUYUK.toString();
        System.out.println(value);


        System.out.println("_----------");
        


    }


}
