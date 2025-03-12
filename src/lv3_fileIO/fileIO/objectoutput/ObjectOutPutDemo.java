package lv3_fileIO.fileIO.objectoutput;

import java.io.*;

public class ObjectOutPutDemo {

    public static void main(String[] args) throws IOException {

        Person p = new Person("Hermann", "Mayer", 1);
        Person p2 = new Person("Alex", "Kirschberger", 2);

        FileOutputStream fos = new FileOutputStream("C:\\Users\\mario\\Studium\\2_ETS_LVs\\src\\lv3_fileIO\\fileIO\\objectoutput\\person.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(p);
        oos.writeObject(p2);
        oos.writeObject(null); // damit man beim einlesen weiß wann es aus ist, äquivalenz zu -1 bei FileStream

        oos.flush();
        oos.close();
    }
}
