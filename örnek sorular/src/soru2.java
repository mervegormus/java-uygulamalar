
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author merve
 */
public class soru2 {

    static int Random() {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        int sayi1 = 2 + (int) (Math.random() * 3);//2-4 arası random sayı
        int sayi2 = 2 + (int) (Math.random() * 4);//2-5 arası random sayı
        System.out.println(sayi1 + " nin " + sayi2 + " kuvveti nedir =");
        int sonuc = kuvvetHesapla(sayi1, sayi2);
        int cevap = scn.nextInt();
        if (sonuc == cevap) {
            System.out.println("Tebrikler bildiniz!");
            System.out.println("Tekrar oynamak ister misiniz?e/E");
            char ch = scn.next().charAt(0);
            if (ch == 'e') {
                Random();
            } else if (ch == 'E') {
                Random();
            } else {
                System.out.println("Oyun bitti");
            }
        } else {
            System.out.println("Üzgünüm Bilemediniz!");
            System.out.println("Tekrar oynamak ister misiniz?e/E");
            char ch = scn.next().charAt(0);
            if (ch == 'e') {
                Random();
            } else if (ch == 'E') {
                Random();
            } else {//burada oyundan çıkmak için herhangi bir şey yazılabilir.
                System.out.println("Oyun bitti");
            }
        }
        return sonuc;
    }

    static int kuvvetHesapla(int sayi, int kuvveti) {
        int sonuc = 0;
        if (kuvveti == 0) {
            return 1;

        } else {
            sonuc = sayi * kuvvetHesapla(sayi, kuvveti - 1);
        }
        return sonuc;
    }

    public static void main(String[] args) {
        int sayi=Random();
    }
}
