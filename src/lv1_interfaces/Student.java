package lv1_interfaces;

public class Student implements Comparable<Student>{

    private int matNr;
    private String firstName;
    private String lastName;

    public Student(int matNr, String firstName, String lastName) {
        this.matNr = matNr;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getMatNr() {
        return matNr;
    }

    public void setMatNr(int matNr) {
        this.matNr = matNr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Student o) {

        return Integer.compare(o.matNr, this.matNr);
    }

    @Override
    public String toString() {
        return "Student{" +
                "matNr=" + matNr +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
