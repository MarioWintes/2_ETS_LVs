package lv2_comparator_exception.ubungsblatt2.bsp1;

import java.util.Comparator;

public class NameAscComporator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
