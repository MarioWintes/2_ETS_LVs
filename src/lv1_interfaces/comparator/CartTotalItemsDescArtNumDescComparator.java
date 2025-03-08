package lv1_interfaces.comparator;

import java.util.Comparator;

public class CartTotalItemsDescArtNumDescComparator implements Comparator<Cartt> {

    @Override
    public int compare(Cartt o1, Cartt o2) {
        int result = Integer.compare(o2.getTotalItems(), o1.getTotalItems());
        if (result == 0){
            return Integer.compare(o2.getNumArticles(), o1.getNumArticles());
        }
        return result;
    }
}
