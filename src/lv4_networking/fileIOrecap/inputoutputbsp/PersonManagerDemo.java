package lv4_networking.fileIOrecap.inputoutputbsp;

public class PersonManagerDemo {

    public static void main(String[] args) {

        PersonManager pm = new PersonManager();

        try {
            pm.load(".\\src\\lv4_networking\\fileIOrecap\\inputoutputbsp\\ubungtx.txt");
        } catch (PersonLoadException e) {
            e.printStackTrace();
        }

        for (Person p : pm.getPersonArrayList()) {
            System.out.println(p);
        }
    }
}
