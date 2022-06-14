package tutorials;

public class _10_Examples {

    public static void main(String[] args) {

        //ornek-1: 1. dereceden 3 bilinmeyenli denklem
        //z=4x-9y
        //x=4
        //y=1
        //z=?

        byte x=4;
        byte y=1;
        byte z= (byte) ((4*x)-(9*1));
        System.out.println(z);

        int xx,yy,zz;
        xx=4;
        yy=1;
        zz=4*xx-9*yy;
        System.out.println(z);


        //ornek-2: dereceyi fahrenayta cevirelim
        //10 derece kac fahrenayttir
        //Dereceyi fahrenayrta cevirme formulu => (derece*9)/5+32

        float fahrenaytacevirilmishali;
        int derece;
        derece=10;

        fahrenaytacevirilmishali = (derece*9)/5+32;
        System.out.println(fahrenaytacevirilmishali);

        //-3:         (5+6*2)*(43*(-2-3)+432*21)/17

        float hesaplisayi;

        hesaplisayi=(5+6*2)*(43*(-2-3)+432*21)/17;
        System.out.println(hesaplisayi);

        //ekstra ornekler fazlada yapilanlar

        //  o=(((a+b)-((d*c*e(f/e))*(e*a*f*c/c)


        int a,b,c;
        float d,e,f;

        a=45;
        b=44;
        c=3543;
        d= (float) 78.43;
        e= (float) 434.7;
        f= (float) 455.885;


        float islemsonucu = ((a + b) - d * c * e / (f / e) * (e * a * f * c / c));
        System.out.println(islemsonucu);














    }
}
