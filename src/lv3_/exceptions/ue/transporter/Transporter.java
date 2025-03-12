package lv3_.exceptions.ue.transporter;

import java.util.Random;

public class Transporter {

    public void beam(String person, String from, String to, boolean urgent) throws Exception {
        Random randInt = new Random();
        int random = randInt.nextInt(10) + 1;
        if (random < 5 && urgent){
            throw (new TransporterMalfunctionException("Beamer hat nicht funktioniert"));
        }else{
            System.out.println("Success");
        }
    }

    public void shutdown(){
        System.out.println("wird down geshuttet");
    }
}
