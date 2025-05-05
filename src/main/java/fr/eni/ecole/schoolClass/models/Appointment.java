package fr.eni.ecole.schoolClass.models;

import java.time.LocalDate;

public class Appointment {
    private TimeSlot timeSlot;
    private Patient patient;
    private LocalDate appointmentDate;

    public Appointment() {}

    public Appointment(TimeSlot timeSlot, Patient patient, LocalDate appointmentDate) {
        this.timeSlot = timeSlot;
        this.patient = patient;
        this.appointmentDate = appointmentDate;
    }

    public String getTimeSlot() {
        return timeSlot.toString();
    }

    public String getPatient() {
        return patient.toString();
    }

    public String getPhysicianName() {
        return timeSlot.getPhysician().getLastName();
    }

    public String getAppointmentDate() {
        return
                appointmentDate.getDayOfMonth() + " " +
                appointmentDate.getMonth() + " " +
                appointmentDate.getYear() + " " +
                getTimeSlot()
                ;
    }

    @Override
    public String toString() {
        return
                "Rendez-vous du " + getAppointmentDate() +
                "avec le Dr " + getPhysicianName() +
                "pour " + getPatient()
                ;
    }
}
