package lv1_interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StudentDemo {

    public static void main(String[] args) {
        int[] intArray = {3, 5, 7, 4, 9};
        String[] stringArray = {"am", "cool", "i"};
        Student[] studentArray = {
                new Student(5223, "Herbert", "Kirschner"),
                new Student(478, "Alex", "Muster"),
                new Student(600, "Babs", "Muster"),
                new Student(90003, "Hermann", "Mann")
        };

        System.out.println(Arrays.toString(studentArray));
        Arrays.sort(studentArray);
        System.out.println(Arrays.toString(studentArray));


        // Anonyme Klasse
        Arrays.sort(studentArray, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        // lambda
        Arrays.sort(studentArray, (o1, o2) -> Integer.compare(o1.getMatNr(),  o2.getMatNr()));

        // Method reference
        Arrays.sort(studentArray, Comparator.comparing(Student::getFirstName));

/*        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(studentArray));

        Arrays.sort(intArray);
        Arrays.sort(stringArray);
        Arrays.sort(studentArray);

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(studentArray));*/

    }

}
