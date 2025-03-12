package lv3_fileIO.exceptions.ue.transporter;

public class Transporter {

    public void beam(String person, String from, String to, boolean urgent) throws TransporterMalfunctionException {

        if (Math.random() < 0.5 && urgent){
            throw new TransporterMalfunctionException("Person " + person + " konnte nicht gebeamt werden");
            // nach throw wird programm immer abgebrochen, gleich wie return
        }

        System.out.println("Success!" + person + " wurde erfolgreich von " + from + " nach " + to + " gebeamt.");
    }

    public void shutdown(){
        System.out.println("Wird down geshuttet");
    }
}
