package lv4_networking.fileIOrecap.inputoutputbsp;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonManager {

    private ArrayList<Person> personArrayList;

    public PersonManager() {
        this.personArrayList = new ArrayList<>();
    }

    public void load(String path) throws PersonLoadException {

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
            String line;
            br.readLine(); // nicht weglöschen, überspringt den CSV Header
            while ((line = br.readLine()) != null){
                String[] personArray = line.split(";");

                if (line.isEmpty()){
                    continue;
                }

                personArrayList.add(new Person(
                        personArray[0],
                        personArray[1],
                        personArray[2]
                ));
            }
        } catch (FileNotFoundException e) {
            throw new PersonLoadException("Datei nicht gefunden: " + path, e);
        } catch (IOException e) {
            throw new PersonLoadException("IOException: " + path, e);
        }
    }

    // für Demo Zwecke - wenn ich in der Demo bei .sort(null) übergebe, dann wird es default
    // sortiert, wenn ich einen comparator übergebe, wird es nach dem übergebenen Comparator sortiert
    public ArrayList<Person> sort(Comparator<Person> comp){
        if (comp == null){
            Collections.sort(personArrayList);
        } else
            Collections.sort(personArrayList, comp);
        return personArrayList;
    }

    public ArrayList<Person> getPersonArrayList() {
        return personArrayList;
    }

    public void setPersonArrayList(ArrayList<Person> personArrayList) {
        this.personArrayList = personArrayList;
    }
}
