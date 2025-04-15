package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Dates {

    public static void main(String[] args) {

        //Pour récupérer la date du jour
        LocalDate today  = LocalDate.now();
        System.out.println("Ajourd'hui : "+today);

        System.out.println("---------------------");

        //Pour récupérer la date et l'heure
        LocalDateTime todayDateTime  = LocalDateTime.now();
        System.out.println("Ajourd'hui : "+todayDateTime);

        System.out.println("---------------------");

        //Pour récupérer l'heure actuelle
        LocalTime hour = LocalTime.now();
        System.out.println("Heure actuelle : "+ hour);

        //Manipulalion
        LocalDate tomorrow = today.plusDays(1);
        today.plusMonths(1);

        //Comparer les dates
        LocalDate d1 = LocalDate.of(2023, 4, 10);
        LocalDate d2 = LocalDate.of(2025, 4, 15);

        boolean isBefore = d1.isBefore(d2);
        boolean isAfter = d1.isAfter(d2);


        System.out.println(today.getDayOfWeek());

    }
}
