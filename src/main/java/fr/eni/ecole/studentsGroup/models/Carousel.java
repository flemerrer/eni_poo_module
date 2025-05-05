package fr.eni.ecole.studentsGroup.models;

import fr.eni.ecole.poo.studentsGroup.exceptions.SchoolBusException;

import java.util.ArrayList;
import java.util.List;

public class Carousel<T extends Person> {
    String name;
    List<T> persons;

    public Carousel() {
    }

    public Carousel(String studentsCarousel) {
        this.name = studentsCarousel;
    }

    public Carousel(String name, List<T> persons) {
        this.name = name;
        this.persons = persons;
    }

    public void addPerson(T person) throws SchoolBusException {
        try {
            this.persons.add(person);
        } catch (Exception e) {
            throw new SchoolBusException("This passenger is not allowed on the carousel.");
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> getPersons() {
        return new ArrayList<>(persons);
    }

    public String printPersons() {
        StringBuilder sb = new StringBuilder();
        for (T person : persons) {
            sb.append("- ").append(person.getFullName()).append("\n");
        }
        return sb.toString();
    }

    public void setPersons(List<T> persons) {
        try {
            this.persons = persons;
        } catch (Exception e) {
            throw new SchoolBusException("This passenger is not allowed on the carousel.");
        }
    }

    @Override
    public String toString() {
        return name + " passengers are: \n" +
                printPersons();
    }
}
