package lv3_fileIO.fileIO.filewriter;

import java.io.*;

public class FileWriterDemo {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\mario\\Studium\\2_ETS_LVs\\src\\lv3_fileIO\\fileIO\\filewriter\\noten.txt"))){
            String line;

            while (!(line = br.readLine()).equals("STOP")){
                pw.write(line + "\n");
                pw.flush();
            }
            pw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
