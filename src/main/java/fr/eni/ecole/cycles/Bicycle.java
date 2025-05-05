package fr.eni.ecole.cycles;

import java.time.LocalDate;

public class Bicycle extends Cycle {
    private final int gearsNumber;

    public Bicycle(String brand, String model, LocalDate buyDate, int gearsNumber) {
        super(brand, model, buyDate, 4.90);
        this.gearsNumber = gearsNumber;
    }

    @Override
    public String toString() {
        return  "BICYCLE" + "\n" +
                this.getInfo() + "\n" +
                "GearsNumber: " + this.gearsNumber + "\n";
    }
}
