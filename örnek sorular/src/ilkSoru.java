
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
public class ilkSoru {

    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        String fileName = "D:\\ogrenciler.txt";
        BufferedReader rd = new BufferedReader(new FileReader(fileName));
        String number = scn.nextLine();
        String line;
        String name;
        String puan;
        while ((line = rd.readLine()) != null) {
            String[] words = line.split("\\;");
            if(words[1].equals(number)){
               name=words[0];
               number=words[1];
               puan=words[3];
                System.out.println("Sözel puan:"+ puan);
            }else{
            System.out.println("Bu öğrenci bulunamadı");
        }
           
        }
        rd.close();

    }
}
