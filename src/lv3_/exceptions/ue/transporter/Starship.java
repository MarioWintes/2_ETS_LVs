package lv3_.exceptions.ue.transporter;

public class Starship {

    private String name;
    private Transporter transporter = new Transporter();

    public void beamUp(String person, String from) {
        try {
            transporter.beam(person, from, "Enterprise", true);

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            transporter.shutdown();
        }
    }
}
