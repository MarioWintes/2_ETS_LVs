package ua1_einwohnermanager;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

public class EinwohnerServer {

    public static void main(String[] args) {

        System.out.println("Server wird hochgefahren");
        try (ServerSocket serverSocket = new ServerSocket(1111)) {
            while (true) {
                System.out.println("Warte auf client");
                try (Socket client = serverSocket.accept();
                ) {
                    System.out.println("Client hat sich verbunden");
                    EinwohnerHandler eh = new EinwohnerHandler(client);
                    eh.process();
                }
            }
        } catch (IOException | DataFileException e) {
            throw new RuntimeException(e);
        }
    }
}

