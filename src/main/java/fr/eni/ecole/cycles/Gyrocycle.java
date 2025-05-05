package fr.eni.ecole.cycles;

import java.time.LocalDate;

public class Gyrocycle extends GyroEngine {

    private final int minHeight;

    public Gyrocycle(String brand, String model, LocalDate buyDate, int autonomy, int minHeight) {
        super(brand, model, buyDate, 18.90, autonomy);
        this.minHeight = minHeight;
    }

    @Override
    public String toString() {
        return  "GYROCYCLE" + "\n" +
                this.getInfo() + "\n" +
                "Autonomy: " + this.autonomy + "km\n" +
                "Min Height: " + this.minHeight + "cm";
    }

}
