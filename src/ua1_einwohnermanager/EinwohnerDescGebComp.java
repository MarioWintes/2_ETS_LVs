package ua1_einwohnermanager;

import java.util.Comparator;

public class EinwohnerDescGebComp implements Comparator<Einwohner> {
    @Override
    public int compare(Einwohner o1, Einwohner o2) {
        int result = Integer.compare(o2.getGeburtsjahr(), o1.getGeburtsjahr());
        if (result == 0) {
            result = o1.getName().compareTo(o2.getName());
        }
        return result;
    }
}
