package Enumx;

public class EnumConstructorMainClass {
    public static void main(String[] args) {
        Olcu olcu=Olcu.BUYUK;
        System.out.println("S�ra: "+olcu.ordinal());
        System.out.println("ID: "+olcu.getKey());
        System.out.println("De�er: "+olcu.getValue());

        String value=Olcu.BUYUK.toString();
        System.out.println(value);

        System.out.println("**********************");
        for(Olcu temp:Olcu.values()){
            System.out.println(temp);
        }
    }
}
