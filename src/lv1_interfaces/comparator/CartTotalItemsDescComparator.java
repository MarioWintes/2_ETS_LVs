package lv1_interfaces.comparator;

import java.util.Comparator;

public class CartTotalItemsDescComparator implements Comparator<Cartt> {

    @Override
    public int compare(Cartt o1, Cartt o2) {
        return Integer.compare(o2.getTotalItems(), o1.getTotalItems());
    }
}
