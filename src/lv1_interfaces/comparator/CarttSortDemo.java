package lv1_interfaces.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class CarttSortDemo {

    public static void main(String[] args) {

        ArrayList<Cartt> carts = new ArrayList<>();
        carts.add(new Cartt("john", 4, 9 ,135.90));
        carts.add(new Cartt("susi", 5, 9 ,50.4));
        carts.add(new Cartt("max", 1, 3 ,90.1));

        Collections.sort(carts);
        System.out.println(carts);

        // sortiere nun nach Anzahl der artikel descending
        Collections.sort(carts, new CartTotalItemsDescComparator());
        System.out.println(carts);

        carts.sort(new CartTotalItemsDescArtNumDescComparator());
        System.out.println(carts);
    }
}
