package tutorials;

import javax.swing.*;
import java.util.Scanner;

public class _12_UserData {

    public static void main(String[] args) {


        Scanner klavyedengirilensayi = new Scanner(System.in);
        System.out.println("sayi yaz ulen bos yapma");
        int sayi = klavyedengirilensayi.nextInt();
        System.out.println(sayi*sayi);


        String secondPath= JOptionPane.showInputDialog("Lutfen biseyler yazin");
        System.out.println(secondPath);


    }
}
