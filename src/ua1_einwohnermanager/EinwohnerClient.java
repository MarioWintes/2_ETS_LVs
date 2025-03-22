package ua1_einwohnermanager;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class EinwohnerClient {

    public static void main(String[] args) {

        try (Socket client = new Socket("localhost", 1111)){


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
