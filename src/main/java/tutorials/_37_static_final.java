package tutorials;

public class _37_static_final {

    public static final int SAYI_DEGISKEN=45;


    public static void main(String[] args) {
        final int sayi=44; // sabit degiskenlerde kullanabiliyoruz.

        //class     ==> extends yapamayiz
        //metotda   ==> override yapamayiz
        System.out.println(sayi);
        System.out.println(_37_static_final.SAYI_DEGISKEN);

        //class static
    }
}
