package fr.eni.ecole.cycles;

import src.module_6.models.Bicycle;
import src.module_6.models.Gyropod;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Ferrari", "M3", LocalDate.ofYearDay(2023, 45), 5);
        System.out.println(bicycle.toString());
        Gyropod gyropod = new Gyropod("Skynet", "T2000", LocalDate.ofYearDay(2024, 15), 150);
        System.out.println(gyropod.toString());
    }

}
