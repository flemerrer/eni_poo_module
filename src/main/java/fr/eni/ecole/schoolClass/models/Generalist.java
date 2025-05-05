package fr.eni.ecole.schoolClass.models;

public class Generalist extends Physician {

    static int prices = 25;

    public Generalist(String firstName, String lastName, String phoneNumber, Address address) {
        super(firstName, lastName, phoneNumber, address);
    }

    public int getPrices() {
        return prices;
    }

    public static void setPrices(int prices) {
        Generalist.prices = prices;
    }
}
