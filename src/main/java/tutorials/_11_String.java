package tutorials;

public class _11_String {

    public static void main(String[] args) {

        //String:
        String kelime="Android java firebase java";
        String kelimeyeni="firebase android devamke";
        System.out.println(kelime);

        System.out.println("bosluklari al: "+kelime.trim());
        System.out.println("Karakter sayisi"+kelime.length());
        System.out.println("Bosluklari al"+kelime.trim().length());

        System.out.println("Baslama:"+kelime.startsWith("h"));
        System.out.println("Bitis:"+kelime.endsWith(" "));

        System.out.println("Kucuk karakter: "+kelime.toLowerCase());
        System.out.println("Buyu karakter: "+kelime.toUpperCase());

        System.out.println("ilk karakter "+kelime.charAt(0));
        System.out.println("indexof "+kelime.indexOf("java"));
        System.out.println("lastindexof "+kelime.lastIndexOf("java"));

        System.out.println("yer degistir "+kelime.replace(kelime,kelimeyeni));
        System.out.println("kelime bulma "+kelime.contains("firebase"));

        System.out.println(kelime.substring(1));
        System.out.println(kelime.substring(2,5));
        System.out.println(kelime.concat("sona ekleme"));
        System.out.println("Dolu mu bos mu: "+kelime.isEmpty());



    }
}
