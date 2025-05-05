package fr.eni.ecole.studentsGroup.models;

import java.time.LocalDate;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String firstName, String lastName, String address, LocalDate dateOfBirth) {
        super(firstName, lastName, address, dateOfBirth);
    }
}
