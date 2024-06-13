package ders15;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class evisi {
    public static void main(String[] args){
        //Create a `java.util.Date` object representing the current date and time.
       /* Date now = new Date();
        System.out.println(now);*/

      //Convert a `java.util.Date` object to `java.sql.Date`.
       /* java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        System.out.println(utilDate);
        System.out.println(sqlDate);*/

        // Extract the year, month, and day from a `LocalDate` object.

       /* LocalDate localDate = LocalDate.now();


        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();


        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);*/

        //Create a `LocalTime` object representing the current time.
        /*LocalTime localtime = LocalTime.now();
        System.out.println(localtime);*/

        //Convert a `LocalTime` object to a string in the format "HH:mm:ss".

       /* LocalTime localtime = LocalTime.parse("10:15:30");
        System.out.println(localtime)*/

        //Create a `LocalDateTime` object representing the current date and time.
       /* LocalDateTime time = LocalDateTime.now();
        System.out.println(time)*/

        //Convert a string in the format "yyyy-MM-dd" to a `LocalDate` object.
        /*LocalDate time = LocalDate.parse("2023-01-01");
        System.out.println(time);*/

        //Convert a string in the format "HH:mm:ss" to a `LocalTime` object.
        /*LocalTime time = LocalTime.parse("10:15:30");
        System.out.println(time);*/

        //Add 5 days to the current date using `LocalDate`
       /* LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(5);
        System.out.println(tomorrow);*/

        //Subtract 3 hours from the current time using `LocalTime`.
        LocalTime currentTime = LocalTime.now();
        LocalTime newTime = currentTime.minusHours(3) ;
        System.out.println(newTime);






    }
}
