package lv1_interfaces;

import java.util.Arrays;

public class ArrayBubbleSort {

    public static void main(String[] args) {

    int[] arr = {5, 4, 3, 2, 1};
    int[] arr2 = {1,2,45,2,5,63,3,8,667,2};

    arrangeOrder(arr);
    arrangeOrder(arr2);

    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arr2));

    }

    public static void arrangeOrder(int[] arr) {
        boolean swapped = true;

        while(swapped){
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    }
}



