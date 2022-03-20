
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class JavaS13_Date_time_API {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("today is " + today);
        
        int year = today.getYear();
        System.out.println("year is " + year);
        Month month = today.getMonth();
        System.out.println("month is " + month);
        int monthValue = month.getValue();
        System.out.println("month is value" + monthValue);
        
        int date = today.getDayOfMonth();
        System.out.println("date is" + date);
        
        DayOfWeek day = today.getDayOfWeek();
        System.out.println("day is" + day);
        
        
        LocalDateTime today1 = LocalDateTime.now();
        System.out.println("Today1 us: " + today1);

        LocalDate todays = LocalDate.now();
        LocalDate bday = LocalDate.of(1994, Month.MARCH, 31);
        LocalDate comingBDay = bday.withYear(todays.getYear());
        if (comingBDay.isBefore(todays) || comingBDay.isEqual(todays)) {
            comingBDay = comingBDay.plusYears(1);
        }
        Period waitA = Period.between(todays, comingBDay);
        long waitB = ChronoUnit.DAYS.between(todays, comingBDay);
        System.out.printf("Today, I need wait for %d months, and %d days to celebrate my next B'day. ('%d days in total')",waitA.getMonths(),waitA.getDays(),waitB);
    }
    
}
