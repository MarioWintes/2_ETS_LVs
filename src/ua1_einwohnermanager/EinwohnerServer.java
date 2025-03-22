package ua1_einwohnermanager;

import java.io.IOException;
import java.net.ServerSocket;

public class EinwohnerServer {

    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(1111)){
            serverSocket.accept();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
