package lv2_comparator.ubungsblatt2.bsp1;

import java.util.Comparator;

public class DepartmentAscNameDescComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int result = o1.getDepartment().compareTo(o2.getDepartment());
        if (result == 0){
            result = o2.getName().compareTo(o1.getName());
        }
        return result;
    }
}
