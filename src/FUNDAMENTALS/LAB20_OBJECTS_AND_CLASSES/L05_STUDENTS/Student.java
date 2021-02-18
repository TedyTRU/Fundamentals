package FUNDAMENTALS.LAB20_OBJECTS_AND_CLASSES.L05_STUDENTS;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String homeTown;

    public Student(String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeTown = hometown;
    }

    public String getHomeTown() {
        return this.homeTown;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
