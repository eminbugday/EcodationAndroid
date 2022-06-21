package tutorials;

import java.util.StringTokenizer;

public class _20_StringTokenizer {

    public static void main(String[] args) {


        String data="Servlet jsp jsf primefaces spring boot";

        //1-) parcalama

        String[] dizi=data.split(" ");    //split bolmek anlamindadir  temp>dizi>data>
        for (String temp:dizi) {
            System.out.println(temp);
        }

        // 2-) parcalama
        StringTokenizer tokenizer = new StringTokenizer(data, "");
        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }

    }
}
