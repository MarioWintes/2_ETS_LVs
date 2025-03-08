package lv2_comparator.ubungsblatt2;

public class Employee implements Comparable<Employee>{

    private int empNumber;
    private String name;
    private double salary;
    private String department;

    public Employee(int empNumber, String name, double salary, String department) {
        this.name = name;
        this.empNumber = empNumber;
        this.salary = salary;
        this.department = department;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
//        if (this.empNumber > o.empNumber){
//            return 1;
//        }
//        if (this.empNumber < o.empNumber){
//            return -1;
//        }
//        else{
//            return 0;
//        }
        // absteigend, descending nach empNumber
        return Integer.compare(o.empNumber, this.empNumber);

        // aufsteigend
        //return Integer.compare(this.empNumber, o.empNumber);
    }
}
