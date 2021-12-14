package test;

import java.util.ArrayList;

public class ArrayListSample {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("item1");
        al.add("item2");
        al.add("item3");
        al.add("item4");
        al.add("item5");
        al.add("item6");

        String place = al.get(2);
        System.out.println(place);

        al.remove(2);
        place = al.get(2);
        System.out.println(place);

        System.out.println("拡張for文で要素を列挙");

        for (String nation : al) {
            System.out.println(nation);
        }
    }
}