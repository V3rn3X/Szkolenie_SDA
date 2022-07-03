package PL.Poradnik.Klasy.Uzycie_pierwszej_klasy;

public class Samochod {
    private int predkosc;
    private String kolor;

    public void ustawPredkosc(int nowaPredkosc){
        this.predkosc = nowaPredkosc;
    }

    public void ustawKolor(String nowyKolor){
        this.kolor = nowyKolor;
    }

    public void wypiszInformacje(){
        System.out.println("Jestem samochodem! Mój kolor to " + kolor + " , jade z predkoscia " + predkosc);
    }
}
