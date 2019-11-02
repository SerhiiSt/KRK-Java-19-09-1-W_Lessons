package pl.itacademy.lesson5;


import java.time.LocalDate;

public class Student extends Person {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String faculty;
    private LocalDate graduateYear;

    public Student(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);


    }

    public Student(String firstName, String lastName, LocalDate birthDate, String faculty, LocalDate graduateYear) {
        super(firstName, lastName, birthDate);
        this.faculty = faculty;
        this.graduateYear = graduateYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public LocalDate getGraduateYear() {
        return graduateYear;
    }

    public void setGraduateYear(LocalDate graduateYear) {
        this.graduateYear = graduateYear;
    }
}
