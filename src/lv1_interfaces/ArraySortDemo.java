package lv1_interfaces;

import java.util.Arrays;

public class ArraySortDemo {

    public static void main(String[] args) {

        int[] numbers = {4, 7, 3, 8, 9, 0, 1, 13};

        for (int number : numbers) {
            System.out.println(number);
        }

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
