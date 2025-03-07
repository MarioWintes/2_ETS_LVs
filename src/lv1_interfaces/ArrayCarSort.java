package lv1_interfaces;

import java.util.ArrayList;

public class ArrayCarSort {

    public static void main(String[] args) {

        Car c1 = new Car("Tesla", 2024, 400);
        Car c2 = new Car("VW", 2009, 150000);
        Car c3 = new Car("Ford", 2006, 300000);
        Car c4 = new Car("Volvo", 2150, 100);

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(c1);
        carList.add(c2);
        carList.add(c3);
        carList.add(c4);

        System.out.println(carList);

        arrangeOrder(carList);

        System.out.println(carList);
    }

    public static void arrangeOrder(ArrayList<Car> arr) {
        boolean swapped = true;

        while(swapped){
            swapped = false;
            for (int i = 0; i < arr.size()-1; i++) {
                Car ci = arr.get(i);
                Car ci1 = arr.get(i+1);
                if (ci.getProductionYear() > ci1.getProductionYear()){
                    Car temp = ci;
                    arr.set(i, arr.get(i+1));
                    arr.set(i + 1, temp);
                    swapped = true;
                }
            }
        }
    }
}
