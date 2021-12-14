package test;

public class ReplaceAllSample {

    public static void main(String[] args) {
        String str = "100ドル";
        String sub = str.replaceAll("ドル", "ユーロ");
        System.out.println(sub);
    }

}