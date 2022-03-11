package peaksoft;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /**City деген класс тузунуз. (code, name, ...)
         Эгерде code так сан болсо TreeSetke салыныз.
         Аларды чонунан кичинесине караган тартипте чыгарыныз.
         */

        Set<City> citySet = new HashSet<>();
        citySet.add(new City("Bishkek", 312));
        citySet.add(new City("Balykchy", 3944));
        citySet.add(new City("Karakol", 3922));
        citySet.add(new City("Kant", 311));
        citySet.add(new City("Djalal - Abad", 3722));
        citySet.add(new City("Tokmok", 313));


        Set<City> treeSet = new TreeSet<>(citySet);
        for (City a : treeSet) {
            if (a.getCode() % 2 != 0) {
                System.out.println(a);

            }
        }

    }
}
