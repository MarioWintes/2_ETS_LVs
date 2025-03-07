package lv1_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListSortDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);

        // Arrays.sort(); nicht möglich!!
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        // String funktioniert analog zu Integer
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(5223, "Herbert", "Kirschner"));
        students.add(new Student(478, "Alex", "Muster"));
        students.add(new Student(90003, "Hermann", "Mann"));

        Collections.sort(students);
        System.out.println(students);
    }
}
