package ua1_einwohnermanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EinwohnerDemo {

    public static void main(String[] args) {

        EinwohnerManager em = new EinwohnerManager();

        try {
            ArrayList<Einwohner> einwohnerArrayList = em.load();

            Collections.sort(einwohnerArrayList);
            einwohnerArrayList.sort(new EinwohnerDescGebComp());

            for (Einwohner einwohner : einwohnerArrayList) {
                System.out.println(einwohner);
            }
        } catch (DataFileException e) {
            throw new RuntimeException(e);
        }
    }
}
