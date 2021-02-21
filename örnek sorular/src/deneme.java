/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author merve
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class denemee
{

    public static String veri_girisi(){
        System.out.print("Öğrenci Numarasını Giriniz:");
        Scanner scn = new Scanner(System.in);
        String veri = scn.nextLine();
        return  veri;
    }

    public static boolean kontrol(String satir, String no){
        boolean sonuc = false;
        String[] elemanlar = satir.split(";", 4);
        if(elemanlar[1].equals(no)){
            sonuc = true;
        }
        return sonuc;
    }



    public static void main(String[] args) {
        try {
            String no = veri_girisi();
            String veriler = null;
            boolean veri = false;
            Reader reader = new FileReader("D:\\ogrenciler.txt");

            try(BufferedReader bufferedReader =
                        new BufferedReader(reader)){

                String line = bufferedReader.readLine();
                while(line != null) {
                    veri = kontrol(line, no);
                    if(veri == true){
                        veriler = line;
                        break;
                    }
                    line = bufferedReader.readLine();
                }
            }

            if(veri == true){
                String[] elemanlar = veriler.split(";", 4);
                System.out.println("Sözel Puan:"+elemanlar[3]);
            }else{
                System.out.println("Bu Öğrenci Bulunamadı");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
