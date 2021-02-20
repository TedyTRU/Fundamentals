package FUNDAMENTALS.EX21_OBJECTS_AND_CLASSES.E03_OpinionPoll;

public class Person {

    private String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }

}
