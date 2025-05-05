package fr.eni.ecole.schoolClass.models;

public class Person {
    protected String firstName;
    protected String lastName;
    protected String phoneNumber;

    public Person(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName.toUpperCase();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
