package assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student implements Comparable<Student> {
    private final String name;
    private final int age;
    private final Gender gender;
    private final boolean active;


    private final List<Course> course;


    public static Student of(String name, int age, Gender gender, boolean active, Course ... courses){
        return  new Student(name,age,gender,active, Arrays.asList(courses));
    }

    public Student(String name, int age, Gender gender, boolean active, List<Course> course) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.active = active;
        this.course = course;
    }


    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public boolean isActive() {
        return active;
    }
    public List<Course> getCourse() {
        return new ArrayList<>(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", active=" + active +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(age,o.getAge());
    }
}
