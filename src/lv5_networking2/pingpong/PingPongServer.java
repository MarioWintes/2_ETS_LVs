package lv5_networking2.pingpong;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class PingPongServer {

    public static void main(String[] args) {

        // server erstellen
        try (ServerSocket serverSocket = new ServerSocket(1111);

        ){
            while (true) {
                System.out.println("Server wartet auf Client");
                // server soll auf verbindung warten
                // kanäle für lesen und schreiben öffnen
                try (Socket client = serverSocket.accept();
                     BufferedReader br = new BufferedReader(
                             new InputStreamReader(client.getInputStream())
                     );
                     PrintWriter pw = new PrintWriter(
                             new OutputStreamWriter(client.getOutputStream())
                     )
                ){
                    System.out.println("client hat sich verbunden");
                    // zuerst lesen
                    String input;
                    while ((input = br.readLine()) != null){
                        // wenn ping -> pong
                        // wenn pong -> ping
                        // alles andere error

                        if (input.equalsIgnoreCase("exit")){
                            pw.println("Good bye");
                            pw.flush();
                            System.out.println("Client hat verbindung beendet");
                            break;
                        }

                        switch (input){
                            case "PONG":
                                pw.println("--> PING");
                                break;
                            case "PING":
                                pw.println("--> PONG");
                                break;
                            default:
                                pw.println("errorrrrrrr");
                        }
                        pw.flush();
                    }
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
