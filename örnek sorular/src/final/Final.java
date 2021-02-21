/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalodev;

import java.util.Random;

public class FinalOdev {

    public static void dortIslemYap(String... islem) {
        String[] gelen;
        String hesaplamaOperatoru;
        int i = 0;
        while (i < islem.length) {

            if (islem[i].contains("+")) {
                gelen = islem[i].split("\\+");
                //ornekte sayılar 2 li olduğu için 2li tasarladım
                int sayi1 = Integer.parseInt(gelen[0]);
                int sayi2 = Integer.parseInt(gelen[1]);
                int sonuc1 = sayi1 + sayi2;
                System.out.println(sayi1 + "+" + sayi2 + "=" + sonuc1);
            }
            if (islem[i].contains("-")) {
                gelen = islem[i].split("-");
                int sayi1 = Integer.parseInt(gelen[0]);
                int sayi2 = Integer.parseInt(gelen[1]);
                int sonuc1 = sayi1 - sayi2;
                System.out.println(sayi1 + "-" + sayi2 + "=" + sonuc1);

            }
            if (islem[i].contains("*")) {
                gelen = islem[i].split("\\*");
                int sayi1 = Integer.parseInt(gelen[0]);
                int sayi2 = Integer.parseInt(gelen[1]);
                int sonuc1 = sayi1 * sayi2;
                System.out.println(sayi1 + "*" + sayi2 + "=" + sonuc1);

            }
            if (islem[i].contains("/")) {
                gelen = islem[i].split("/");
                int sayi1 = Integer.parseInt(gelen[0]);
                int sayi2 = Integer.parseInt(gelen[1]);
                int sonuc1 = sayi1 / sayi2;
                System.out.println(sayi1 + "/" + sayi2 + "=" + sonuc1);

            }
             i++;
        }

    }

    public static void main(String[] args) {
        dortIslemYap("10+20", "50-60", "50*9", "400/6");
        dortIslemYap("100/2", "40*8", "10+50", "80-70", "14*5", "23-4");

    }
}
