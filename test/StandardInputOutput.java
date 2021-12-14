package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardInputOutput {

    public static void main(String[] args) {
        try {
            BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("何か文字を入力してください =>");
            String str = key.readLine();
            
            System.out.println("入力された文字列は「" + str + "」です。");
        }catch (IOException e) {
            
        }

    }

}
