package buo;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Bil> garage = new ArrayList<>();

    public void tilføjBil(Bil bil) {
        garage.add(bil);
    }

    public String beregnGrønAfgiftForBilpark() {
        double samletGrønEjerafgift = 0;
        for (Bil bil : garage) {
            samletGrønEjerafgift += bil.beregnGrønEjerafgift();
        }
        return "Samlet grønejerafgift for alle bilerne i garagen: " + samletGrønEjerafgift + " kr";
    }

    @Override
    public String toString() {
        String garageListe = "";
        for (Bil bil : garage) {
            garageListe += bil.toString() + "\n";
        }
        return garageListe;
    }
}
