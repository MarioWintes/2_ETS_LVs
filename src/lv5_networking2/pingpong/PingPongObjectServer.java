package lv5_networking2.pingpong;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class PingPongObjectServer {

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
                     ObjectOutputStream oos = new ObjectOutputStream(
                             client.getOutputStream()
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
                            oos.writeObject(new Response(3, "Good bye"));
                            oos.flush();
                            System.out.println("Client hat verbindung beendet");
                            break;
                        }

                        switch (input){
                            case "PONG":
                                oos.writeObject(new Response(1, "--> PING"));
                                break;
                            case "PING":
                                oos.writeObject(new Response(1, "--> PONG"));
                                break;
                            default:
                                oos.writeObject(new Response(400, "--> Örror"));
                        }
                        oos.flush();
                    }
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
