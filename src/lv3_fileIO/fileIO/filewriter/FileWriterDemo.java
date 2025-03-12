package lv3_fileIO.fileIO.filewriter;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class FileWriterDemo {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter(new File("C:\\Users\\mario\\Studium\\2_ETS_LVs\\src\\lv3_fileIO\\fileIO\\filewriter\\noten.txt"));
        BufferedWriter bw = new BufferedWriter(fw);

        Scanner scanner = new Scanner(System.in);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String line;

            while (!(line = br.readLine()).equals("STOP")){
                bw.write(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        bw.flush();
        bw.close();
    }
}
