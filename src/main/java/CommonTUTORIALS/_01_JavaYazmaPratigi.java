package CommonTUTORIALS;

public class _01_JavaYazmaPratigi {



    public static void main(String[] args) {
        //commmon rules


        int x=4, y=5, k;
        k=3*x+4*y;
        System.out.println(k);

        //string

        String kelime = "    android pratik yapiyorum";
        System.out.println(kelime);
        System.out.println(kelime.length());
        System.out.println(kelime.trim());
        System.out.println(kelime.trim().toUpperCase());
        System.out.println(kelime.trim().startsWith("a"));
        System.out.println(kelime.replace(kelime,"android pratik yappmak yerini html pratik yapiyioru"));
        System.out.println(kelime.equals("ben android ogreniyorum"));




    }
}
