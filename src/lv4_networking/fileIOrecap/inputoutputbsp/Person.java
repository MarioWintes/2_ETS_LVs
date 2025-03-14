package lv4_networking.fileIOrecap.inputoutputbsp;

public class Person {

    private String firstname;
    private String lastname;
    private String brithLocation;

    public Person(String firstname, String lastname, String brithLocation) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.brithLocation = brithLocation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", brithLocation='" + brithLocation + '\'' +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBrithLocation() {
        return brithLocation;
    }

    public void setBrithLocation(String brithLocation) {
        this.brithLocation = brithLocation;
    }
}
