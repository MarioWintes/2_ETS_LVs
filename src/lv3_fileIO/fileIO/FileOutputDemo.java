package lv3_fileIO.fileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.System.in;

public class FileOutputDemo {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\mario\\Studium\\2_ETS_LVs\\src\\lv3_fileIO\\fileIO\\text.txt");
        System.out.println("Gib ein Zeichen ein: ");
        try (FileOutputStream fos = new FileOutputStream(f)) {
            while (true){
                char c = (char) System.in.read();
                if (c == 'x' || c == 'X'){
                    System.out.println("Oh nein ein X/x kam.");
                    break;
                }
                fos.write(c);
            }
            fos.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
