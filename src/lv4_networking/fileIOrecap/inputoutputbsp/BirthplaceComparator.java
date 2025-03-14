package lv4_networking.fileIOrecap.inputoutputbsp;

import java.util.Comparator;

public class BirthplaceComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getBrithLocation().compareTo(o2.getBrithLocation());
    }
}
