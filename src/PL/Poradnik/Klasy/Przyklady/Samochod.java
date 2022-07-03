package PL.Poradnik.Klasy.Przyklady;

public class Samochod {
    private int predkosc; // (1)
    private String kolor; // (2)

    private int waga; // (3)


    public void ustawPredkosc(int nowaPredkosc) {
        predkosc = nowaPredkosc; // (3)
    }
    public void ustawKolor(String nowyKolor) {
        kolor = nowyKolor; // (4)
    }

    public void ustawWaga(int nowyWaga){
        waga = nowyWaga; // (5)
    }
    public void wypiszInformacje() {
        System.out.println("Jestem samochodem! Moj kolor to " + kolor +
                ", jade z predkoscia " + predkosc + ", a moja waga to " + waga); // (5)
    }

    public String toString(){
        return "Jestem samochodem! Moj kolor to " + kolor +
                ", jade z predkoscia " + predkosc + ", a moja waaga to " + waga;
    }

    public String toStfefefring(){
        return "Jestem samochodem! Moj kolor to " + kolor +
                ", jade z predkoscia " + predkosc + ", a moja waaaga to " + waga;
    }

}
