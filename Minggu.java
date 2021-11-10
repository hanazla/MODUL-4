/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Hana
 */
public class Minggu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int count = 0;
    LocalDate date1 = LocalDate.of(1901, Month.JANUARY, 1);
    LocalDate endDate = LocalDate.of(2000, Month.DECEMBER, 31);
    while (date1.isBefore(endDate)) {
        date1 = date1.plusMonths(1);
        if (date1.getDayOfWeek() == DayOfWeek.SUNDAY) {
            count++;
        }
    }
    System.out.println(count);
}
    
}
