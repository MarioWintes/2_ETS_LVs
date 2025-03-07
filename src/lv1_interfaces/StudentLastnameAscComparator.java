package lv1_interfaces;

import java.util.Comparator;

public class StudentLastnameAscComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getLastName().compareTo(o2.getLastName());
        if (result == 0){
            result = o2.getFirstName().compareTo(o1.getFirstName());
        }
        return result;
    }
}
