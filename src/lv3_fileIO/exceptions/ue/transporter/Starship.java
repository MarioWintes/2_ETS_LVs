package lv3_fileIO.exceptions.ue.transporter;

public class Starship {

    private String name;
    private Transporter transporter;

    public Starship(String name) {
        this.name = name;
        this.transporter = new Transporter();
    }

    public void beamUp(String person, String from) {
        try {
            transporter.beam(person, from, name, true);

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            transporter.shutdown();
        }
    }
}
