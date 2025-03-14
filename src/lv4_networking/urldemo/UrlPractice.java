package lv4_networking.urldemo;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

public class UrlPractice {

    public static void main(String[] args) {

        try {
            URL myUrl = new URL("https://www.google.at");

            try(BufferedReader br = new BufferedReader(
                    new InputStreamReader(myUrl.openStream()));
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter("C:\\Users\\mario\\Studium\\2_ETS_LVs\\src\\lv4_networking\\urldemo\\google.html")
                )
            ){


                String line;
                while ((line = br.readLine()) != null){
                   // System.out.println(line);
                    bw.write(line);
                    bw.newLine();
                }
                bw.flush();
                System.out.println(myUrl.getDefaultPort());



            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
