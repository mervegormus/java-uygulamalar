package prog1vize;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class soru2 {

    public static int random() {
        Random rnd = new Random();
        int sayi = rnd.nextInt(49) + 1;
        return sayi;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int dizi[][] = new int[8][6];
        int tekD[] = new int[24];
        int çiftD[] = new int[24];
        int kolonSayisi;
        int x, y, z = 0, t = 0;
        int sayi;
        int sayac = 0;
        int sayac1 = 0;
        int temp;
        System.out.println("Kolon sayisini giriniz:");
        kolonSayisi = scn.nextInt();
        if (kolonSayisi > 8) {
            System.out.println("Maksimum kolon sayisini(8) astiniz");
        } else {
            for (int i = 0; i < kolonSayisi; i++) {
                for (int j = 0; j < 6; j++) {
                    sayi = random();
                    if (sayi != dizi[i][j]) {
                        sayi = random();
                        dizi[i][j] = sayi;
                    } else if (dizi[i][j] != dizi[i][j + 1]) {
                        sayi = random();
                        dizi[i][j] = random();
                    }
                }
            }
            while (sayac <= 3) {
                for (x = 0; x < kolonSayisi; x++) {
                    for (y = 0; y < 6; y++) {
                        if (dizi[x][y] % 2 == 1) {
                            tekD[z] = dizi[x][y];
                            z++;
                            sayac++;
                        } else {
                            çiftD[t] = dizi[x][y];
                            t++;
                        }
                    }
                }
            }
            if (tekD.length == çiftD.length) {
                for (int m = 0; m < kolonSayisi; m++) {
                    for (int n = 0; n < 6; n++) {
                        while (0 < sayac1 && sayac1 >= 5) {
                            if (1 <= dizi[m][n] && dizi[m][n] >= 10) {
                                sayac1++;
                            }
                            if (11 <= dizi[m][n] && dizi[m][n] >= 20) {
                                sayac1++;
                            }
                            if (21 <= dizi[m][n] && dizi[m][n] >= 30) {
                                sayac1++;
                            }
                            if (31 <= dizi[m][n] && dizi[m][n] >= 40) {
                                sayac1++;
                            }
                            if (41 <= dizi[m][n] && dizi[m][n] >= 49) {
                                sayac1++;
                            }
                        }
                    }
                }
            }
            for (int k = 0; k < kolonSayisi; k++) {
                for (int l = 5; l > 0; l--) {
                    for (int s = 1; s <= l; s++) {
                        if (dizi[k][s - 1] == dizi[k][s]) {
                            dizi[k][s - 1] = dizi[k][s - 1] + 1;
                        } else if (dizi[k][s - 1] > dizi[k][s]) {
                            temp = dizi[k][s - 1];
                            dizi[k][s - 1] = dizi[k][s];
                            dizi[k][s] = temp;
                        }
                    }
                }
            }
            for(int q=0;q<kolonSayisi;q++){
                System.out.println(q+1+".kolon");
            for(int d=0;d<6;d++){
                System.out.print(dizi[q][d]+" ");
            }
                System.out.println();
            }
        }
    }
}
