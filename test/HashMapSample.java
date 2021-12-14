package test;
import java.util.HashMap;

public class HashMapSample {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("Shepherd1", "ginoza");
        hm.put("Shepherd2", "tsunemori");
        hm.put("Hound1", "masaoka");
        hm.put("Hound2", "kunizuka");
        hm.put("Hound3", "kougami");
        hm.put("Hound4", "kagari");
        hm.put("Analyst", "karanomori");

        String member = hm.get("Hound3");
        System.out.println(member);

        int size = hm.size();
        System.out.println(size);

        for (String key : hm.keySet()) {
            System.out.println(key + ":" + hm.get(key));
        }

    }

}