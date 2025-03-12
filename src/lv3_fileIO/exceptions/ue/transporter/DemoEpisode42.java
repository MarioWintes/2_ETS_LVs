package lv3_fileIO.exceptions.ue.transporter;

public class DemoEpisode42 {

    public static void main(String[] args) throws TransporterMalfunctionException {

        Starship enterprise = new Starship("Enterprise");

        for (int i = 0; i < 10; i++) {
            enterprise.beamUp("Captian Kirk", "Riga IV");
        }
    }
}
