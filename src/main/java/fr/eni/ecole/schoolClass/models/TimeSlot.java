package fr.eni.ecole.schoolClass.models;

import java.time.LocalTime;

public class TimeSlot {
    private LocalTime startTime;
    private Physician physician;
    //duration is in minutes
    private int duration = 15;

    public TimeSlot() {}

    public TimeSlot(LocalTime startTime, int duration, Physician physician) {
        this.startTime = startTime;
        this.duration = duration;
        this.physician = physician;
    }

    public Physician getPhysician() {
        return physician;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return startTime.plusMinutes(duration);
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        if (physician != null) {
            return
                    getStartTime().getHour() + ":" +
                    getStartTime().getMinute() + " - " +
                    getEndTime().getHour() + ":" +
                    getEndTime().getMinute() + " (" +
                    getDuration() + " minutes)"
                    ;
        } else {
            return "";
        }
    }
}
