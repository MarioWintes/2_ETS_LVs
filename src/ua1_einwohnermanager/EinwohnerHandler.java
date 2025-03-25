package ua1_einwohnermanager;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;

public class EinwohnerHandler {

    private Socket client;
    private EinwohnerManager em;

    public EinwohnerHandler(Socket client) {
        this.client = client;
        this.em = new EinwohnerManager();
    }

    public void process() throws DataFileException {

        ArrayList<Einwohner> einwohners = em.load();
        // mit client kommunizieren
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(client.getInputStream()));
             BufferedWriter bw = new BufferedWriter(
                     new OutputStreamWriter(client.getOutputStream()))
        ) {
            String input;
            while ((input = br.readLine()) != null) {

                if (input.equalsIgnoreCase("exit")) {
                    bw.write("Verbindung wird beendet");
                    bw.newLine(); // !!
                    bw.flush(); // !!
                    System.out.println("Client hat verbindung getrennt");
                    break;
                }

                // 1. Fall: GET <<bundesland>>
                // 2. Fall: GET <<geburtsjahr>> order by name
                if (input.startsWith("GET ")) {
                    String[] commands = input.split(" ");
                    if (commands.length == 2) {
                        // Bundesland wird abgefragt
                        for (Einwohner einwohner : einwohners) {
                            if (einwohner.getBundesland().equals(commands[1])) {
                                bw.write(einwohner.toString());
                                bw.newLine();
                            }
                        }

                    } else {
                        // Geburtsjahr wird abgefragt
                        ArrayList<Einwohner> list = getEinwohnerPerYear(commands[1], einwohners);
                        for (Einwohner einwohner : list) {
                            bw.write(einwohner.toString());
                            bw.newLine();
                        }
                    }

                } else {
                    bw.write("unknown command");
                }
                bw.newLine();
                bw.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private ArrayList<Einwohner> getEinwohnerPerYear(String command, ArrayList<Einwohner> einwohners) {
        int geburtsJahr = Integer.parseInt(command);
        ArrayList<Einwohner> einwohnerList = new ArrayList<>();

        for (Einwohner einwohner : einwohners) {
            if (einwohner.getGeburtsjahr() == geburtsJahr) {
                einwohnerList.add(einwohner);
            }
        }
        Collections.sort(einwohnerList);
        return einwohnerList;
    }
}
