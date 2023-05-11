import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Assignment_3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ahmad", 24));
        students.add(new Student("Mohammed", 19));
        students.add(new Student("Ali", 17));
        students.add(new Student("Alia", 29));
        students.add(new Student("bashar", 20));

        // list of Age
        List<Integer> ages = students.stream()
                .map(Student::getAge)
                .toList();
        System.out.println("List of Student's Ages: " + ages);


        // age categories
        Map<Boolean, List<Student>> ageGroups = students.stream()
                .collect(Collectors.groupingBy(s -> s.getAge() >= 20));
        System.out.println("Students Grouped by Age Categories: " + ageGroups);


        //collect array of Student into List
        List<Student> studentList = reduceToList(students.toArray(new Student[0]), (s1, s2) -> s1);
        System.out.println("List of Students: " + studentList);

        // reduse used to form age catagory
        Map<Boolean, List<Student>> ageGroups2 = reduceToMap(students.toArray(new Student[0]),
                s -> s.getAge() >= 20, s -> s);
        System.out.println("Students Grouped by Age Categories: " + ageGroups2);
    }

    public static <T> List<T> reduceToList(T[] arr, BinaryOperator<T> op) {
        List<T> result = new ArrayList<>();

        if (arr.length > 0) {
            T accumulator = arr[0];
            for (int i = 1; i < arr.length; i++) {
                accumulator = op.apply(accumulator, arr[i]);
            }
            result.add(accumulator);

            for (int i = 1; i < arr.length; i++) {
                accumulator = op.apply(accumulator, arr[i]);
                result.add(accumulator);
            }
        }

        return result;
    }

    public static <T, K, V> Map<K, List<V>> reduceToMap(T[] arr, Function<T, K> keyExtractor,
                                                        Function<T, V> valueExtractor) {
        Map<K, List<V>> result = new HashMap<>();

        for (T element : arr) {
            K key = keyExtractor.apply(element);
            V value = valueExtractor.apply(element);

            if (!result.containsKey(key)) {
                result.put(key, new ArrayList<>());
            }
            result.get(key).add(value);
        }

        return result;
    }
}

class Student {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }
}

