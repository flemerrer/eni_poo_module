package fr.eni.ecole.studentsGroup.models;

import java.time.LocalDate;

public class Student extends Person {
    private Parent parent;

    public Student() {
    }

    public Student(String firstName, String lastName, String address, LocalDate dateOfBirth, Parent parent) {
        super(firstName, lastName, address, dateOfBirth);
        this.parent = parent;
    }

    public Parent getParent() {
        return parent;
    }

    public String getParentName() {
        Person parent = getParent();
        return parent.getFirstName() + " " + parent.getLastName();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName.toUpperCase() + " son / daughter of " + getParentName() + ", born the " + getDateOfBirth() + " " + "residing at " + getAddress();
    }
}
