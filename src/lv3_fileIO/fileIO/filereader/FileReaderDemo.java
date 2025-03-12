package lv3_fileIO.fileIO.filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\mario\\Studium\\2_ETS_LVs\\src\\lv3_fileIO\\fileIO\\sub-ordner\\dokumente\\er hörte leise.txt")))
        {
            String line = br.readLine();

            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("line = " + line);;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
