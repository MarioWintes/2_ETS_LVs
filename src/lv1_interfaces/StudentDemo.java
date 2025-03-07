package lv1_interfaces;

import java.util.Arrays;

public class StudentDemo {

    public static void main(String[] args) {
        int[] intArray = {3, 5, 7, 4, 9};
        String[] stringArray = {"am", "cool", "i"};
        Student[] studentArray = {
                new Student(5223, "Herbert", "Kirschner"),
                new Student(478, "Alex", "Muster"),
                new Student(90003, "Hermann", "Mann")
        };

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(studentArray));

        Arrays.sort(intArray);
        Arrays.sort(stringArray);
        Arrays.sort(studentArray);

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(studentArray));
    }

}
