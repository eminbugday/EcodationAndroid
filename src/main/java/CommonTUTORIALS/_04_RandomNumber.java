package CommonTUTORIALS;

import java.util.Random;

public class _04_RandomNumber {

    //1-10 arasinda rastgele sayi ureten bir algoritma ?
    //bu sayi toplamlarini hesaplayiniz ?
    // bu sayi kac tane tek veya cift hesaplayin ?
    // bu sayilarin toplamini
    //bu sayilarin ortalamasi
    //tek sayilar
    //cift sayilar
    //dizzilerde en buyuik 2. sayi bulalim

    public void randomnumber() {

        Random randomrastgele = new Random();
        String temp = "";
        for (int i = 1; i <=5; i++) ;
        int sayidegiskeni = randomrastgele.nextInt(10) + 1;
        temp += sayidegiskeni;
    }
}
