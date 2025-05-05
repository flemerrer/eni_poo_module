package fr.eni.ecole.schoolClass.tests;

import fr.eni.ecole.schoolClass.models.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;


class ClassesTest {

    static Address address = new Address("ZAC du Moulin Neuf", 2, "B", "Benjamin Franklin street", "44800", "Saint Herblain");
    static Address otherAddress = new Address("", 2, "", "Tom Holland", "35000", "Rennes");
    static Generalist generalist = new Generalist("Mélanie", "Bosapin", "02.28.03.17.28", address);
    static Specialist specialist = new Specialist("Céline", "OCENSEMAINE", "0748159263", address, 52, "ORL");
    static Patient patient = new Patient("Hillary", "Perret", "0698745123", 'F', LocalDate.of(1945, 2, 10), 245021067034521L, "", otherAddress);

    @Test
    void generalistConstructorShouldReturnAnInstanceOfGeneralist() {
        assertInstanceOf(Generalist.class, generalist);
    }

    @Test
    void specialistConstructorShouldReturnAnInstanceOfSpecialist() {
        assertInstanceOf(Specialist.class, specialist);
    }

    @Test
    void patientConstructorShouldReturnAnInstanceOfPatient() {
        assertInstanceOf(Patient.class, patient);
    }

    @Test
    void addressConstructorShouldReturnAnInstanceOfAddress() {
        assertInstanceOf(Address.class, address);
    }

    @Test
    void changePhysicianClassPricesShouldChangePricesForAllInstancesOfPhysician() {
        Generalist.setPrices(23);
        assertEquals(23, generalist.getPrices());
    }

    @Test
    void getPhoneNumberShouldReturnTheNewPhysicianNumberWhenSetPhoneNumberIsUsed() {
        generalist.setPhoneNumber("07-06-05-04-03");
        assertEquals("07-06-05-04-03", generalist.getPhoneNumber());
    }

    @Test
    void toStringShouldPrintAllPhysicianInformation() {
        specialist.addTimeSlot(1, LocalTime.of(9, 0), 15);
        String expectedString =
                """
                        OCENSEMAINE Céline
                        PhoneNumber: 0748159263
                        Speciality: ORL
                        Prices: 52€
                        ZAC du Moulin Neuf
                        2B Benjamin Franklin street
                        44800 SAINT HERBLAIN
                        Créneaux :
                        9:0 - 9:15 (15 minutes)
                        """;
        assertEquals(expectedString, specialist.toString());
    }

    @Test
    void toStringShouldPrintAllPatientInformation() {
        if (generalist.getPrices() != 23) {
            Generalist.setPrices(23);
            generalist.setPhoneNumber("07-06-05-04-03");
        }
        String expectedString =
                """
                        PERRET Hillary
                        Phone number: 0698745123
                        Gender: Female
                        Social Security Number: 245021067034521
                        BirthDate: 10 FEBRUARY 1945
                        Comments: [no comments]
                        2 Tom Holland
                        35000 RENNES""";
        assertEquals(expectedString, patient.toString());
    }

    @Test
    void toStringShouldPrintAllAddressInformation() {
        String expectedString =
                """
                        ZAC du Moulin Neuf
                        2B Benjamin Franklin street
                        44800 SAINT HERBLAIN""";
        assertEquals(expectedString, address.toString());
    }


}

