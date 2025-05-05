package fr.eni.ecole.studentsGroup.test;

import fr.eni.ecole.studentsGroup.exceptions.SchoolClassException;
import fr.eni.ecole.studentsGroup.models.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CarouselTest {
    Parent parent1 = new Parent("Tom", "Bombadil", "50 avenue du gen. Leclerc", LocalDate.of(1990, 10, 12));
    Parent parent2 = new Parent("Jeanne", "Lefebvre", "10 impasse Chateaubriant", LocalDate.of(1985, 4, 3));
    Parent[] parents = new Parent[]{parent1, parent2};
    Student student1 = new Student("Jeff", "Bombadil", "50 avenue du gen. Leclerc", LocalDate.of(2015, 7, 25), parent1);
    Student student2 = new Student("Katerine", "Lefebvre", "10 impasse Chateaubriant", LocalDate.of(2015, 2, 4), parent2);
    Student[] students = new Student[]{student1, student2};
    ArrayList<Student> studentsList = new ArrayList<>(Arrays.asList(students));
    private final Teacher teacher = new Teacher("Marc", "André", "15 rue de l'Epine", LocalDate.of(2002, 6, 16));;
    private SchoolClass schoolClass = new SchoolClass("Purple Leaves", studentsList);
    private final Carousel<Student> studentsCarousel = new Carousel<>("Students carousel", schoolClass.getStudents());
    private final Carousel<Parent> parentsCarousel = new Carousel<>("Parents carousel", schoolClass.getAllParents());;

    @Test
    public void addStudentToSchoolClassTest() throws SchoolClassException {
        Student student3 = new Student("Bob", "Dylan", "30 avenue des Pierres qui roulent", LocalDate.of(1965, 5, 3), parent2);
        schoolClass.addStudent(student3);
        assertEquals(3, schoolClass.getStudents().size());
    }

    @Test
    public void getStudentExceptionTest() {
        Exception exception = assertThrows(SchoolClassException.class, (Executable) () -> {
            schoolClass.getOneStudent(200);
        });
        String expectedMessage = "Class only contains 2 students.";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void setTeacherTest() throws SchoolClassException {
        schoolClass.setTeacher(teacher);
        assertEquals(teacher, schoolClass.getTeacher());
    }

    @Test
    public void studentsCarouselTest() {
        assertEquals(students[0], studentsCarousel.getPersons().getFirst());
    }

    @Test
    public void parentsCarouselTest() {
        assertEquals(parents[1], parentsCarousel.getPersons().get(1));
    }

    @Test
    public void carouselToStringTest() throws SchoolClassException {
        String expectedString = "Students carousel passengers are: \n- Jeff BOMBADIL\n- Katerine LEFEBVRE\n";
        assertEquals(expectedString, studentsCarousel.toString());
    }

}
