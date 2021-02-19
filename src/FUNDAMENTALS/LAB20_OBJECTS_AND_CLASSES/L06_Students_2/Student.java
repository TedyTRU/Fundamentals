package FUNDAMENTALS.LAB20_OBJECTS_AND_CLASSES.L06_Students_2;

import java.util.List;

public class Student {
    private String firstName;
    private String secondName;
    private int age;
    private String city;

    public Student(String firstName, String secondName, int age, String city) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

}
