package test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileInput {

    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("test.txt");

            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            String str = reader.readLine();

            while (str != null) {
                System.out.println(str);
                str = reader.readLine();
            }

            reader.close();
            is.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

}
