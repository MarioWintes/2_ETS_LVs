package lv4_networking.urldemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class MyFirstUrl {

    public static void main(String[] args) {

        try {
            URL myUrl = new URL("https://www.campus02.at");

            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(myUrl.openStream()))){

                String line;
                while ((line = br.readLine()) != null){
                    System.out.println(line);
                }

            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
