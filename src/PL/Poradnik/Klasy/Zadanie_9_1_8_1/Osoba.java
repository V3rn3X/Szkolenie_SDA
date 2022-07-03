package PL.Poradnik.Klasy.Zadanie_9_1_8_1;

public class Osoba {

    private int wiek;
    private String imie;
    private String nazwisko;

    public void ustawWiek (int ustawWiek){
        this.wiek = ustawWiek;
    }

    public void ustawNazwisko (String ustawNazwisko){
        this.nazwisko = ustawNazwisko;
    }

    public void ustawImie (String ustawImie){
        this.imie = ustawImie;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "wiek='" + wiek + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }



}
