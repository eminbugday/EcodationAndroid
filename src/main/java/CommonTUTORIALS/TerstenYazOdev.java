package CommonTUTORIALS;


import java.util.Scanner;

public class TerstenYazOdev {

    // kullan�c�dan al�nan veriyi tersten yazd�ran algoritma ?
    // Hamit
    // timaH
    public static void reverseString() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir �ey yaz�n�z");
        String value = klavye.nextLine();
        String temp = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            temp += value.charAt(i);
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        reverseString();
    }
}
