package lv6_threading.uebung;

import java.util.Date;

public class DateTimeBackgroundWorker implements Runnable {

    private boolean shouldRun = false;

    public DateTimeBackgroundWorker() {
    }

    public void stop() {
        shouldRun = false;
    }

    public void work() {

        shouldRun = true;
        while (shouldRun) {
            Date d = new Date();
            System.out.println(d);

            try {
                Thread.sleep(1000); // "Höfliches Stoppen" ist ein problem, weil das stoppen auch solange dauert wie die hier implementierte Zeit
                // damm muss man thread.stop(); machen!
            } catch (InterruptedException e) {
                if (Thread.currentThread().isInterrupted()){
                    break;
                }
                else {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public void run() {
        work();
    }
}
