package lv6_threading.uebung;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class TimeApp{

    public static void main(String[] args) throws InterruptedException {

        DateTimeBackgroundWorker backgroundWorker = new DateTimeBackgroundWorker();

        Thread th = new Thread(backgroundWorker);
        th.start();

        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Stopp");
        backgroundWorker.stop();
        //th.interrupt();
        th.join();
        System.out.println("Ende Erreicht");

    }
}
