package lv2_comparator.ubungsblatt2;

import java.util.Arrays;

public class EmployeeSortDemo {

    public static void main(String[] args) {

        Employee[] employees = {
                new Employee(5, "max",3000, "Dev"),
                new Employee(2, "susi", 6000, "Research"),
                new Employee(6, "john", 4500, "Sales"),
                new Employee(7, "tibor", 7500, "Sales"),
                new Employee(1, "max", 2500, "Marketing"),
                new Employee(10, "zerhat", 2500, "Dev")
        };

        System.out.println(Arrays.toString(employees));
        Arrays.sort(employees, new NameAscComporator());
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, new SalaryDescComparator());
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, new DepartmentAscNameDescComparator());
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, new SalaryAscNameAscComparator());
        System.out.println(Arrays.toString(employees));
    }
}
