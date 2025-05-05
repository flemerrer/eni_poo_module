package fr.eni.ecole.schoolClass.models;

public class Specialist extends Physician {

    int prices;
    String speciality;

    public Specialist(String firstName, String lastName, String phoneNumber, Address address, int prices, String speciality) {
        super(firstName, lastName, phoneNumber, address);
        this.prices = prices;
        this.speciality = speciality;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return
                getLastName() + " " +
                        getFirstName() + '\n' +
                        "PhoneNumber: " + getPhoneNumber() + '\n' +
                        "Speciality: " + getSpeciality() + '\n' +
                        "Prices: " + getPrices() + "€" + '\n' +
                        getAddress().toString() + '\n' +
                        printTimeslots()
                ;
    }


}
