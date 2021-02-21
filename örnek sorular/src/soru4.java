/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author merve
 */
public class soru4 {
    static int kuvvetHesapla(int sayi, int kuvveti) {
        int sonuc = 0;
        if (kuvveti == 0) {
            return 1;

        } else {
            sonuc = sayi * kuvvetHesapla(sayi, kuvveti-1);
        }
        return sonuc;
    }

    public static void main(String[] args) {
        int sonuc = kuvvetHesapla(8, 8);
        System.out.println(sonuc);
    }

}
