package PL.Poradnik.Klasy.Zadanie_9_6_6_1;

public class Osoba {

    private String imie;
    private String nazwisko;
    private final int rokUrodzenia;
    private Adres adres;


    public Osoba(String imie, String nazwisko, int rokUrodzenia, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.adres = adres;
    }

    public Osoba(String imie, String nazwisko, int rokUrodzenia, String miejscowosc, String kodPocztowy, String nazwaUlicy, int nrDomu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.adres = new Adres(miejscowosc, kodPocztowy, nazwaUlicy, nrDomu);
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                ", adres=" + adres +
                '}';
    }



}
