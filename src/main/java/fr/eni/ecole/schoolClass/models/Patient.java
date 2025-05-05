package fr.eni.ecole.schoolClass.models;

import java.time.LocalDate;

public class Patient extends Person {

    private char gender;
    private LocalDate birthDate;
    private long socialSecurityNumber;
    private String comments;
    private Address address;

    public Patient() {
        super();
    }

    public Patient(String firstName, String lastName, String phoneNumber, char gender, LocalDate birthDate, long socialSecurityNumber, String comments, Address address) {
        super(firstName, lastName, phoneNumber);
        this.gender = gender;
        this.birthDate = birthDate;
        this.socialSecurityNumber = socialSecurityNumber;
        this.comments = comments;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return
                getLastName() + " " +
                getFirstName() + '\n' +
                "Phone number: " + getPhoneNumber() + '\n' +
                "Gender: " + getGender() + '\n' +
                "Social Security Number: " + getSocialSecurityNumber() + '\n' +
                "BirthDate: " + getBirthDate() + '\n' +
                "Comments: " + getComments() + '\n' +
                getAddress().toString()
                ;
    }

    public String getGender() {
        return switch (this.gender) {
            case 'M' -> "Male";
            case 'F' -> "Female";
            default -> "Unknown";
        };
    }

    public String getBirthDate() {
        return this.birthDate.getDayOfMonth() + " " + this.birthDate.getMonth() + " " + this.birthDate.getYear();
    }

    public long getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getComments() {
        if (!this.comments.isBlank()) {
            return comments;
        } else {
            return "[no comments]";
        }
    }
}

