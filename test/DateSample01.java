package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateSample01 {

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime nextWeek = dateTime.plusWeeks(1);
        System.out.println(nextWeek);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String str = dateTime.format(formatter);
        System.out.println(str);
    }
}