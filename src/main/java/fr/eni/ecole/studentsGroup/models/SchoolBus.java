package fr.eni.ecole.studentsGroup.models;

import java.util.ArrayList;
import java.util.List;

public class SchoolBus {
    int seatsNumber;
    List<Person> passengers;

    public SchoolBus(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setPassengers(List<Person> passengers) {
        this.passengers = passengers;
    }

    public void addPassenger(Person passenger) {
        this.passengers.add(passenger);
    }

    public List<Person> getPassengers() {
        return passengers;
    }

    public List<Person> getReferents() {
        ArrayList<Person> referents = new ArrayList<>();
        for (Person passenger : passengers) {
            if (passenger.getClass() == Parent.class | passenger.getClass() == Teacher.class) {
                referents.add(passenger);
            }
        }
        return referents;
    }
}
