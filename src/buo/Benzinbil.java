package buo;

public class Benzinbil extends Bil {
    private int oktantal;
    private double kmPrL;


    public Benzinbil(String regNr, String mærke, String model, int årgang
            , int antalDøre, int oktantal, double kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;
    }

    public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    public double beregnGrønEjerafgift() {
        double grønEjerAfgift;
        if (kmPrL >= 20) {
            grønEjerAfgift = 330;
        } else if (kmPrL >= 15 && kmPrL < 20){
            grønEjerAfgift = 1050;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            grønEjerAfgift = 2340;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            grønEjerAfgift = 5500;
        } else {
            grønEjerAfgift = 10470;
        }
        return grønEjerAfgift;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "oktantal=" + oktantal +
                ", kmPrL=" + kmPrL +
                '}';
    }
}
