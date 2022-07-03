package PL.Poradnik.Klasy.Przyklady;

public class Osoba {

    private int wiek;

    private String imie;

    private String nazwisko;

    public void ustawWiek(int nowyWiek) {
        wiek = nowyWiek;
    }

    public void ustawImie(String nowyImie) {
        imie = nowyImie;
    }

    public void  ustawNazwisko(String nowyNazwisko){
        nazwisko = nowyNazwisko;
    }

    public String toString(){
        return "Dane osoby to: \nWiek: " + wiek + "\nImie: " + imie + "\nNazwisko: " + nazwisko;
    }



}
