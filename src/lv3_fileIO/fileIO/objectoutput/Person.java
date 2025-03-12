package lv3_fileIO.fileIO.objectoutput;

import java.io.Serializable;

public class Person implements Serializable {

    private String firstname;
    private String lastname;
    private int number;

    public Person(String firstname, String lastname, int number) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", number=" + number +
                '}';
    }
}
