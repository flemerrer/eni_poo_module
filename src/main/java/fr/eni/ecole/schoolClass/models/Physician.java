package fr.eni.ecole.schoolClass.models;

import java.time.LocalTime;

public class Physician extends Person {

    private int prices = 25;
    private final Address address;
    private final TimeSlot[] timeSlotsList;

    public Physician(String firstName, String lastName, String phoneNumber, Address address) {
        super(firstName, lastName, phoneNumber);
        this.address = address;
        this.timeSlotsList = new TimeSlot[15];
    }

    public void addTimeSlot(int position, LocalTime start, int duration) {
        TimeSlot newTimeSlot = new TimeSlot(start, duration, this);
        timeSlotsList[position - 1] = newTimeSlot;
    }

    public TimeSlot[] getTimeslots() {
        return this.timeSlotsList.clone();
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return
                getLastName() + " " +
                        getFirstName() + '\n' +
                        "PhoneNumber: " + getPhoneNumber() + '\n' +
                        "Prices: " + getPrices() + "€" + '\n' +
                        getAddress().toString() + '\n' +
                        printTimeslots()
                ;
    }

    public String printTimeslots() {
        StringBuilder string = new StringBuilder();
        string.append("Créneaux :\n");
        for (TimeSlot timeSlot : getTimeslots()) {
            if (timeSlot != null) {
                string.append(timeSlot).append('\n');
            }
        }
        return string.toString();
    }

    public int getPrices() {
        return prices;
    }

}
