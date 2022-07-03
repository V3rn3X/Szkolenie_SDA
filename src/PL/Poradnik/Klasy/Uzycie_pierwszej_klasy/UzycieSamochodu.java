package PL.Poradnik.Klasy.Uzycie_pierwszej_klasy;

public class UzycieSamochodu {
    public static void main(String[] args){

        Samochod samochod1 = new Samochod();
        samochod1.ustawKolor("Zielony");
        samochod1.ustawPredkosc(120);

        Samochod samochod2 = new Samochod();
        samochod2.ustawKolor("Czerwony");
        samochod2.ustawPredkosc(200);

        samochod1.wypiszInformacje();
        samochod2.wypiszInformacje();

    }
}
