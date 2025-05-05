package fr.eni.ecole.cycles;

import java.time.LocalDate;

public class Gyropod extends GyroEngine {

    public Gyropod(String brand, String model, LocalDate buyDate, int autonomy) {
        super(brand, model, buyDate, 29.90, autonomy);
    }

    @Override
    public String toString() {
        return  "GYROPOD" + "\n" +
                this.getInfo() + "\n" +
                "Autonomy: " + this.autonomy + "km";
    }

}
