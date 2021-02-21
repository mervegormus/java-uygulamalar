package prog1vize;

/**
 *
 * @author merve
 */
public class soru1 {
    
    public static int kareAl(int sayi) {
        int toplam = 0;
        while (sayi != 0) {

            int a = sayi * sayi;
            toplam += a;
            sayi--;
        }
        return toplam;

    }

    public static void main(String[] args) {
        int sayi;
        System.out.println(kareAl(30));
    }
}
