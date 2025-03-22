package ua1_einwohnermanager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EinwohnerManager {

    private ArrayList<Einwohner> einwohners;

    public EinwohnerManager() {
        this.einwohners = new ArrayList<>();
    }

    public ArrayList<Einwohner> load() throws DataFileException {


        try (BufferedReader br = new BufferedReader(
                new FileReader(".\\src\\ua1_einwohnermanager\\testdata-einwohner.csv"))
        ){
            String line;
            br.readLine(); // überspringt header
            while ((line = br.readLine()) != null){
                String[] einwohnerArray = line.split(";");

                einwohners.add(
                    new Einwohner(Integer.parseInt(einwohnerArray[0]),
                            einwohnerArray[1],
                            einwohnerArray[2],
                            Integer.parseInt(einwohnerArray[3]))
                );
            }

        } catch (IOException e) {
            throw new DataFileException("Fehler beim Parsen", e);
        }
        return einwohners;
    }
}
