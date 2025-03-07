package lv1_interfaces;

import java.util.Arrays;

public class ArrayCarSort {

    public static void main(String[] args) {

        Sortable[] arr = {
                new Car("Tesla", 2024, 400),
                new Car("VW", 2009, 150000),
                new Car("Ford", 2006, 300000),
                new Car("Volvo", 2150, 100)
        };

        System.out.println(Arrays.toString(arr));

        arrangeOrder(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void arrangeOrder(Sortable[] arr) {
        boolean swapped = true;

        while(swapped){
            swapped = false;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i].sort(arr[i+1]) > 0){
                    Sortable temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    }
}
