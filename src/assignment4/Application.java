package assignment4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    static Student[] students = new Student[]{
            Student.of("Ahmad", 20, Gender.MALE, true, Course.MATH, Course.CHEMISTRY, Course.JAVA),
            Student.of("Mohammad", 25, Gender.MALE, true, Course.MATH, Course.JAVA),
            Student.of("ESA", 27, Gender.MALE, false, Course.MATH, Course.JAVA),
            Student.of("ESRA", 19, Gender.FEMALE, true, Course.MATH, Course.ENGLISH),
            Student.of("DANA", 40, Gender.FEMALE, true, Course.MATH, Course.ENGLISH, Course.PHYSICS),
            Student.of("RUBA", 20, Gender.FEMALE, true, Course.MATH, Course.PHYSICS)

    };
    public static void main(String[] args) {

        List<Integer> studentsAge = Stream.of(students).map(s -> s.getAge()).collect(Collectors.toList());
        System.out.println("studentsAge = " + studentsAge);

        System.out.println("-------------------------------------");
        Map<Boolean,List<Student>> ageCategories=Stream.of(students)
                .collect(Collectors.groupingBy(s->s.getAge()>=20));
        System.out.println("studentByGender = " + ageCategories);

    }
}