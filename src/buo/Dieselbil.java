package buo;

public class Dieselbil extends Bil {
    private boolean harPartikelfilter;
    private double kmPrL;


    public Dieselbil(String regNr, String mærke, String model, int årgang,
                     int antalDøre, boolean harPartikelfilter, double kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL = kmPrL;
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    public double beregnGrønEjerafgift() {
        double grønEjerAfgift;
        double udligningsafgift;
        double partikeludleningsafgift = 0;
        if (kmPrL >= 20) {
            grønEjerAfgift = 330;
            udligningsafgift = 130;
        } else if (kmPrL >= 15 && kmPrL < 20){
            grønEjerAfgift = 1050;
            udligningsafgift = 1390;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            grønEjerAfgift = 2340;
            udligningsafgift = 1850;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            grønEjerAfgift = 5500;
            udligningsafgift = 2770;
        } else {
            grønEjerAfgift = 10470;
            udligningsafgift = 15260;
        }

        if (!harPartikelfilter) {
            partikeludleningsafgift = 1000;
        }
        return grønEjerAfgift + udligningsafgift + partikeludleningsafgift;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "harPartikelfilter=" + harPartikelfilter +
                ", kmPrL=" + kmPrL +
                '}';
    }
}
