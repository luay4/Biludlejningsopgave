package buo;

public class BilMain {

    public static void main(String[] args) {
        Garage garage = new Garage();

        Benzinbil golf3 = new Benzinbil("AH96133", "Volkswagen", "Golf", 1994, 3, 95, 13.6);
        Benzinbil peugeot206 = new Benzinbil("LP66357", "Peugeot", "206", 2003, 5, 92, 20.3);
        Dieselbil audiA4 = new Dieselbil("MN29388", "Audi", "A4", 2014, 5, true, 20.4);
        Dieselbil kiaSportage = new Dieselbil("GG79462", "Kia", "Sportage", 2011, 5, false, 15.6);
        Elbil hyundaiKona = new Elbil("TE92113", "Hyundai", "Kona", 2018, 5, 39, 289, 150);
        Elbil teslaModel3 = new Elbil("CD091209", "Tesla", "Model 3", 2021, 4, 75, 614, 147);

        garage.tilføjBil(golf3);
        garage.tilføjBil(peugeot206);
        garage.tilføjBil(audiA4);
        garage.tilføjBil(kiaSportage);
        garage.tilføjBil(hyundaiKona);
        garage.tilføjBil(teslaModel3);

        System.out.println(garage);
        System.out.println(garage.beregnGrønAfgiftForBilpark());
    }
}
