package lv3_fileIO.fileIO;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class FileDemo {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\mario\\Studium\\2_ETS_LVs\\src\\lv3_fileIO\\fileIO\\sub-ordner");
        System.out.println(f.length());

        System.out.println(printAndGetFileSize(f));

    }

    public static long printAndGetFileSize(File f) {

        if (f.isFile()) {
            return f.length();
        }

        //else -> Directory
        long length = 0;
        for (File file : f.listFiles()) {
            length += printAndGetFileSize(file);

        }

        return length;

    }
}
