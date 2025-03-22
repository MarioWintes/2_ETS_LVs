package lv5_networking2;

import javax.net.ssl.SSLSocketFactory;
import java.io.*;
import java.net.Socket;

public class SocketPractice {

    public static void main(String[] args) {

        try (Socket server = SSLSocketFactory.getDefault().createSocket("news.orf.at", 443);
             BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(server.getOutputStream()));
             FileWriter fw = new FileWriter(new File(".\\src\\lv5_networking2\\file.txt"))
        ){

            bw.write("GET / HTTP/3.0\r\nHost: news.orf.at\r\n\r\n");
            bw.flush();

            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                fw.write(line + "\r\n");

                fw.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
