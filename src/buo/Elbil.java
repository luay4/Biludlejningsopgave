package buo;

public class Elbil extends Bil {
    private int batterikapacitetKWh;
    private int maxKm;
    private int whPrKm;


    public Elbil(String regNr, String mærke, String model, int årgang, int antalDøre,
                 int batterikapacitetKWh, int maxKm, int whPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    public double beregnGrønEjerafgift() {
        double grønEjerAfgift;
        double kmPrL = 100 / (whPrKm / 91.25);

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
                "batterikapacitetKWh=" + batterikapacitetKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }
}
