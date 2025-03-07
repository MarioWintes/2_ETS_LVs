package lv1_interfaces.employee;

import java.util.Arrays;

public class EmployeeSortDemo {

    public static void main(String[] args) {

        Employee[] employees = {
                new Employee(5, "max",3000, "Dev"),
                new Employee(2, "susi", 6000, "Research"),
                new Employee(6, "john", 4500, "Sales"),
                new Employee(1, "max", 2500, "Marketing")
        };

        System.out.println(Arrays.toString(employees));
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));
    }
}
