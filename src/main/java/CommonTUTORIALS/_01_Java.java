package CommonTUTORIALS;

import java.util.Random;

public class _01_Java {

    public static void main(String[] args) {
        //common  rules

        int numberValue516=44;


        int x=4,y=5,k;
        k=3*x+4*y;
        System.out.println(k);


        //String

        String kelime="ben android ogreniyorum";
        System.out.println(kelime);
        System.out.println(kelime.length());
        System.out.println(kelime.trim());
        System.out.println(kelime.trim().length());
        System.out.println(kelime.toLowerCase());
        System.out.println(kelime.toUpperCase());
        System.out.println(kelime.startsWith("b"));
        System.out.println(kelime.endsWith(" "));
        System.out.println(kelime.charAt(0));
        System.out.println(kelime.charAt(kelime.length()-1));

        System.out.println(kelime.contains("a"));
        System.out.println(kelime.replace(kelime,"deneme"));
        System.out.println(kelime.equals("ogreniyorum"));
        System.out.println("_____________________________");


        //system

        System.out.println();



        ///math


        System.out.println(Math.abs(-4));
        System.out.println(Math.pow(2,5));
        System.out.println(Math.sqrt(16));


        System.out.println("_____________________________");


        System.out.println(Math.random()*4+1);


        Random random=new Random();
        int sayi=random.nextInt(4)+1;
        System.out.println(sayi);


        System.out.println("______________________________________________");


        String str="merhabalar";
        int decimal=44;
        float virgul=34.44f;
        System.out.printf("%25s %d %5.1f",str,decimal,virgul);


        System.out.println("______________________________________________");


        //birlestirme
        String str1="malatya",str2="yesilyurt",str3="battal gazu";
        System.out.println(str1+str2+str3);
        System.out.println();




        //paracalama







    }


}
