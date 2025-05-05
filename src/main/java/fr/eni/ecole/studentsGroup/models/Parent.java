package fr.eni.ecole.studentsGroup.models;

import java.time.LocalDate;

public class Parent extends Person {
    public Parent() {
    }

    public Parent(String firstName, String lastName, String address, LocalDate dateOfBirth) {
        super(firstName, lastName, address, dateOfBirth);
    }
}
