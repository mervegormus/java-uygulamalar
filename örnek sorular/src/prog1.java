
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prog1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String sozelPuan;
        String data;
        Map<Integer,String> map=new HashMap< Integer,String>();
        try {
            File myObj = new File("D:\\ogrenciler.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
               data = myReader.nextLine();
               for (int i = 0; i < data.length(); i++) {
                     map.put(i,data);
                     System.out.println(map.get(i));
                }
            }
            
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("hata");
            e.printStackTrace();
        }

    }
}
