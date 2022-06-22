package tutorials;

public class _25_Conditional_if_else {

    public static void main(String[] args) {

        //if else

        int number=5;
        if (number>=15){
            System.out.println("sayi 15 veya buyuktur");
        }else {
            System.out.println("kucuktur");
        }



        //Ternary

        String result= (number >=  15 ) ? "sayi 15 veya buyuktur":"Kucuktur" ;  //
        System.out.println(result);


    }
}
