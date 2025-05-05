package fr.eni.ecole.cycles;

import java.time.LocalDate;

public abstract class Cycle {
    private final String brand;
    private final String model;
    private final LocalDate buyDate;
    protected final double rentingPrice;

    public Cycle(String brand, String model, LocalDate buyDate, double rentingPrice) {
        this.brand = brand;
        this.model = model;
        this.buyDate = buyDate;
        this.rentingPrice = rentingPrice;
    }

    public String getPrice() {
        int number = (int) this.rentingPrice;
        int digits = ((int) (this.rentingPrice % 1 * 100));
        return number + "€" + digits;
    }
    public String getAge() {

        int age = LocalDate.now().getYear() - this.buyDate.getYear();

        if (age > 1) {
            return String.valueOf(age) + " years old";
        }

        if (age > 0) {
            return "1 year old";
        } else {
            return "less than 1 year";
        }

    }

    public String getInfo() {
        return  "Brand: " + this.brand + "\n" +
                "Model: " + this.model + "\n" +
                "Age: " + getAge() + "\n" +
                "Renting Price: " + this.getPrice();
    }
}
