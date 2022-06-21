package tutorials;

public class _18_Cast {

    public static void main(String[] args) {


        //Cast
        //1-) float,long

        float f1=44.55f;            //float icin sonuna f koyduk
        System.out.println(f1);

        float f2=(float)44.55;      //parantezli tanimladik
        System.out.println(f2);

        long l1=1145114652l;        //sonuna l koyarak oluyor
        System.out.println(l1);

        long l2=1145114652L;        //parantezlide tanimlana biliyor sonuna L koyarakta
        System.out.println(l2);


        //2-) byte < short < int < long

        byte b3=120;
        int i3=b3;                   // veri kaybi olmaz
        System.out.println(i3);


        int i4=45155;
        byte b4=(byte) i4;              //veri kaybi olacak
        System.out.println(b4);


        //3-) boxing  / un boxing
        // boxing: primitive olan bir  turu Wrapper class cevirmek demektir
        int primitive=4115;
        Integer wrapper=primitive;
        System.out.println(primitive);

        // unboxing: Wrapper class olan bir turu pririmitive cevirmek demektir
        Integer wrapper2=4515;
        int primitive2=wrapper2;
        System.out.println(wrapper2);


        //4-) String integer cevirmek
        //Arastirma :  valuof ile parseint nedir aralarindaki fark nedir


        String str8="14";

        //1.yol
        int i8=Integer.valueOf(str8);
        System.out.println(i8+14);

        //2.yol
        int i9=Integer.parseInt(str8);
        System.out.println(i9+14);


        //5-) Int  string (cevirmek)
        int i10=25;

        //1.yol
        String str10=String.valueOf(i10);
        System.out.println(str10+14);

        //2.yol
        String str11= Integer.toString(i10);
        System.out.println(str11+14);










    }
}
