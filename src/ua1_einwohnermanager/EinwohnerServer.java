package ua1_einwohnermanager;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class EinwohnerServer {

    public static void main(String[] args) {

        System.out.println("Server wird hochgefahren");
        try (ServerSocket serverSocket = new ServerSocket(1111)) {
            while (true) {
                System.out.println("Warte auf client");
                try (Socket client = serverSocket.accept();
                     PrintWriter pw = new PrintWriter(
                             new OutputStreamWriter(client.getOutputStream())
                     );
                     BufferedReader br = new BufferedReader(
                             new InputStreamReader(client.getInputStream())
                     )
                ) {
                    System.out.println("Client hat sich verbunden");
                    EinwohnerManager em = new EinwohnerManager();
                    ArrayList<Einwohner> einwohnerArrayList = em.load();

                    String input;
                    while ((input = br.readLine()) != null) {

                        String bundesland = br.readLine();

                        if (input.equalsIgnoreCase("exit")) {
                            pw.println("Good bye");
                            pw.flush();
                            System.out.println("Client hat die Verbindung getrennt");
                            break;
                        }
                        if (input.equals(bundesland)) {
                            for (Einwohner einwohner : einwohnerArrayList) {
                                if (einwohner.getBundesland().equals(bundesland)) {
                                    pw.println(einwohner);
                                    pw.flush();
                                }
                            }
                        }
                        else {
                            pw.println("Nix Da");
                            pw.flush();
                            
                        }


                    }


                } catch (DataFileException e) {
                    throw new RuntimeException(e);
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
