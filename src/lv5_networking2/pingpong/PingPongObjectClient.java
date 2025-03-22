package lv5_networking2.pingpong;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class PingPongObjectClient {

    public static void main(String[] args) {

        // Auf Server Verbinden
        try (Socket server = new Socket("localhost", 1111);
             BufferedWriter bw = new BufferedWriter(
                     new OutputStreamWriter(server.getOutputStream())
             );
             ObjectInputStream ois = new ObjectInputStream(
                     server.getInputStream()
             );
             BufferedReader cli = new BufferedReader(
                     new InputStreamReader(System.in)
             )
        ){
            // von Kommandozeile lesen
            String line;
            while ((line = cli.readLine()) != null){
                // an server senden
                bw.write(line);
                bw.newLine();
                bw.flush();

                System.out.println(line + " -> an Server gesendet");

                if (line.equalsIgnoreCase("EXIT")){
                    break;
                }

                // antwort lesen
                Response response = (Response) ois.readObject();
                System.out.println("response.getStatus() = " + response.getStatus());
                System.out.println("response.getMessage() = " + response.getMessage());
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
