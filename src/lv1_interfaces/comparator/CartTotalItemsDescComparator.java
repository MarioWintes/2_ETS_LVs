package lv1_interfaces.comparator;

import java.util.Comparator;

public class CartTotalItemsDescComparator implements Comparator<Cart> {

    @Override
    public int compare(Cart o1, Cart o2) {
        return Integer.compare(o2.getTotalItems(), o1.getTotalItems());
    }
}
