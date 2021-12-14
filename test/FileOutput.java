package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class FileOutput {

    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("test.txt", true);
            OutputStreamWriter writer = new OutputStreamWriter(os);
            writer.write("ファイルへ書き込みます。\n");
            writer.close();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
