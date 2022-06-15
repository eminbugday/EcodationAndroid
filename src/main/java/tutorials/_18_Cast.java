package tutorials;

public class _18_Cast {

    public static void main(String[] args) {


        //Cast
        //1-) float,long

        float f1=44.55f;
        System.out.println(f1);

        float f2=(float)44.55;

        long l1=1145114652l;
        System.out.println(l1);

        long l2=1145114652L;
        System.out.println(l2);


        //2-) byte < short < int < long

        byte b3=120;
        int i3=b3; // veri kaybi olmaz

        int i4=45155;
        byte b4=(byte) i4; //veri kaybi olacak

        //3-) boxing  / un boxing
        // boxing: primitive olan bir  turu Wrapper class cevirmek demektir
        int primitive=4115;
        Integer wrapper=primitive;

        // unboxing: Wrapper class olan bir turu pririmitive cevirmek demektir
        Integer wrapper2=4515;
        int primitive2=wrapper2;


        //4-) String integer cevirmek
        //Arastirma :
        String str8="14";
        int i8=Integer.valueOf(str8);
        System.out.println(i8+14);






    }
}
