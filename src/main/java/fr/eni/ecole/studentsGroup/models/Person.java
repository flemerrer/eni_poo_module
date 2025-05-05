package fr.eni.ecole.studentsGroup.models;

import java.time.LocalDate;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected String address;
    protected LocalDate dateOfBirth;

    public Person() {
    }

    public Person(String firstName, String lastName, String address, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName.toUpperCase();
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public String getAddress() {
        return address;
    }

    public String getDateOfBirth() {
        return dateOfBirth.getMonth() + " " + dateOfBirth.getDayOfMonth() + " of " + dateOfBirth.getYear();
    }

    @Override
    public String toString() {
        return getFullName() + ", born the " + getDateOfBirth() + " " + "residing at " + getAddress();
    }
}
