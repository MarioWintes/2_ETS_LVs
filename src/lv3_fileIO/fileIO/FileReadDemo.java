package lv3_fileIO.fileIO;

import java.io.*;

public class FileReadDemo {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\mario\\Studium\\2_ETS_LVs\\src\\lv3_fileIO\\fileIO\\sub-ordner\\dokumente\\lorem-ipsum.txt");

        try(FileInputStream fis = new FileInputStream(f)){

            BufferedInputStream bis = new BufferedInputStream(fis);
            System.out.println(bis.available());

            int counter = 0;
            int byteRead;

            while ((byteRead = fis.read()) != -1){
                counter++;
                //char c = (char) byteRead;
                System.out.print(byteRead);
                if (byteRead == 32){
                    System.out.print(" ");
                }
            }
            System.out.println("\n" + counter + " Zeichen");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
