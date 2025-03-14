package lv4_networking.fileIOrecap.inputoutputbsp;

import java.util.ArrayList;
import java.util.Collections;

public class PersonManagerDemo {

    public static void main(String[] args) {

        PersonManager pm = new PersonManager();

        try {
            pm.load(".\\src\\lv4_networking\\fileIOrecap\\inputoutputbsp\\ubungtx.txt");
        } catch (PersonLoadException e) {
            e.printStackTrace();
        }

        ArrayList<Person> p = pm.getPersonArrayList();
        Collections.sort(p);

        for (Person o : p) {
            System.out.println(o);
        }


        Collections.sort(p, new BirthplaceComparator());
        for (Person o : p) {
            System.out.println(o);
        }
    }
}
