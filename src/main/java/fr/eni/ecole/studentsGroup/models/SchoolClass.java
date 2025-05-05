package fr.eni.ecole.studentsGroup.models;

import fr.eni.ecole.poo.studentsGroup.exceptions.SchoolClassException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SchoolClass {
    private String name;
    private Teacher teacher;
    private List<Student> students;

    public SchoolClass() {
    }

    public SchoolClass(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
    }

    public SchoolClass(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public int getStudentCount() {
        return students.size();
    }

    public Student getOneStudent(int index) throws SchoolClassException {
        try {
            return students.get(index);
        } catch (IndexOutOfBoundsException e) {
            throw new SchoolClassException("Class only contains " + getStudentCount() + " students.");
        }
    }

    public ArrayList<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void setStudents(ArrayList<Student> students) {
        students = new ArrayList<>(students);
    }

    public void sortStudents() {
    }

    public ArrayList<Parent> getAllParents() {
        Set<Parent> parentSet = new HashSet<Parent>();
        for (Student student : students) {
            parentSet.add(student.getParent());
        }
        return new ArrayList<>(parentSet);
    }

    public String printParentsNames() {
        StringBuilder sb = new StringBuilder();
        sb.append("Parents of class ").append(getName()).append(" :\n");
        for (Parent parent : getAllParents()) {
            sb.append("- ").append(parent.getFirstName()).append(" ").append(parent.getLastName()).append("\n");
        }
        return sb.toString();
    }

    private String printStudentsNames() {
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append("  - ").append(student.getFirstName()).append(" ").append(student.getLastName()).append("\n");
        }
        return sb.toString();
    }

    public void addStudent(Student student) throws SchoolClassException {
        try {
            students.add(student);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new SchoolClassException("You can't add another student. Class is already full.");
        }
    }

    public void removeStudent(Student student) throws SchoolClassException {
        try {
            students.remove(student);
        } catch (RuntimeException e) {
            throw new SchoolClassException("This student isn't in this class.");
        }
    }

    @Override
    public String toString() {
        return "Class Name: " + getName() + '\n' +
                " Teacher: " + teacher + '\n' +
                " Students: " + '\n' +
                printStudentsNames();
    }

}
