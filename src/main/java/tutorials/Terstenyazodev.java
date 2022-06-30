package tutorials;

import java.util.Scanner;

public class Terstenyazodev {



    //kullanicadan alinan veriyi tersten yazdiran algoritma ?
    //hamit
    //timah


    public static void reverseString() {
        Scanner kalavye=new Scanner(System.in);
        System.out.println("bir seyler yaz");
        String value= kalavye.nextLine();
        String temp = "";

        for (int i = value.length()-1; i>=0 ; i--) {
            temp+= value.charAt(i);
        }
        System.out.println(temp);

    }
}
