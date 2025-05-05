package fr.eni.ecole.cycles;

import java.time.LocalDate;

public abstract class GyroEngine extends Cycle {
    protected final int autonomy;

    public GyroEngine(String brand, String model, LocalDate buyDate, double rentingPrice, int autonomy) {
        super(brand, model, buyDate, rentingPrice);
        this.autonomy = autonomy;
    }

}
