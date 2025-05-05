package fr.eni.ecole.calendar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final LocalDate today = LocalDate.now();
    private static final String daysNames = "Lu Ma Me Je Ve Sa Di";

    private static final String options = """
            \n
            Options :
             - : mois précédent
             + : mois suivant
             d : date personnalisée
             q : quitter
            """;

    public static void main(String[] args) {
        begin();
        LocalDate selectedDate = today;
        while (true) {
            System.out.println(options);
            Scanner scanner = new Scanner(System.in);
            String selectedOption = "";
            selectedOption = scanner.nextLine();
            switch (selectedOption) {
                case "q":
                    scanner.close();
                    System.exit(0);
                case "+":
                    if (selectedDate.getMonth().getValue() == 12) {
                        selectedDate = getNextYear(selectedDate);
                    } else {
                        selectedDate = LocalDate.of(selectedDate.getYear(), selectedDate.getMonth().getValue() + 1, 1);
                    }
                    printCalendar(selectedDate);
                    break;
                case "-":
                    if (selectedDate.getMonth().getValue() == 1) {
                        selectedDate = getPreviousYear(selectedDate);
                    } else {
                        selectedDate = LocalDate.of(selectedDate.getYear(), selectedDate.getMonth().getValue() - 1, 1);
                    }
                    printCalendar(selectedDate);
                    break;
                case "d":
                    System.out.println("Entrer une année :");
                    int selectedYear = scanner.nextInt();
                    System.out.println("Entrer le numéro du mois souhaité :");
                    int selectedMonth = scanner.nextInt();
                    selectedDate = LocalDate.of(selectedYear, selectedMonth, 1);
                    printCalendar(selectedDate);
                case null, default:
                    System.out.println("Option non valide. Veuillez recommencer svp.");
                    break;
            }
        }
    }

    private static LocalDate getPreviousYear(LocalDate selectedDate) {
        selectedDate = LocalDate.of(selectedDate.getYear() - 1, 12, 1);
        return selectedDate;
    }

    private static LocalDate getNextYear(LocalDate selectedDate) {
        selectedDate = LocalDate.of(selectedDate.getYear() + 1, 1, 1);
        return selectedDate;
    }

    private static void begin() {
        printTodaysDate();
        printCalendar(today);
    }

    private static void printCalendar(LocalDate day) {
        int year = day.getYear();
        LocalDate firstOfMonth = LocalDate.of(year, day.getMonth().getValue(), 1);
        LocalDate firstOfNextMonth = getFirstOfNextMonth(day, year);
        ArrayList<LocalDate> daysOfMonth = new ArrayList<>(firstOfMonth.datesUntil(firstOfNextMonth).toList());
        String[][] month = createCalendar(firstOfMonth, daysOfMonth);
        String title = "* " + day.getMonth().toString().toLowerCase() + " " + year + " *";
        int lengthDiff = daysNames.length() - title.length();
        String spaces = " ".repeat(lengthDiff/2);
        System.out.printf("\n%s%s%s\n", spaces, title, spaces);
        System.out.println(daysNames);
        for (String[] week : month) {
            StringBuilder printWeek = new StringBuilder();
            for (String weekDay : week) {
                if (weekDay != null) {
                    printWeek.append(weekDay).append(" ");
                } else {
                    printWeek.append("   ");
                }
            }
            System.out.println(printWeek);
        }
    }

    private static String[][] createCalendar(LocalDate firstOfMonth, ArrayList<LocalDate> daysOfMonth) {
        String[][] month = new String[6][7];
        for (int week = 0; week < 5; week++) {
            for (String day : month[week]) {
                day = "  ";
            }
        }
        int weekNumber = 0;
        int daysPosition = firstOfMonth.getDayOfWeek().getValue() - 1;
        for (LocalDate localDate : daysOfMonth) {
            int dayValue = localDate.getDayOfMonth();
            if (dayValue >= 10) {
                month[weekNumber][daysPosition] = "" + dayValue;
            } else {
                month[weekNumber][daysPosition] = " " + dayValue;
            }
            if (daysPosition == 6) {
                weekNumber++;
                daysPosition = 0;
            } else {
                daysPosition++;
            }
        }
        return month;
    }

    private static LocalDate getFirstOfNextMonth(LocalDate day, int year) {
        LocalDate firstOfNextMonth;
        if (day.getMonth().getValue() == 12) {
            firstOfNextMonth = getNextYear(day);
        } else {
            firstOfNextMonth = LocalDate.of(year, day.getMonth().getValue() + 1, 1);
        }
        return firstOfNextMonth;
    }

    private static void printTodaysDate() {
        separate();
        System.out.println("WE ARE : " + today.getMonth() + " " + today.getDayOfMonth() + " " + today.getDayOfWeek());
        separate();
    }

    private static void separate() {
        System.out.println("-".repeat(daysNames.length()));
    }
}