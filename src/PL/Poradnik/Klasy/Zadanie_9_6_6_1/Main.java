package PL.Poradnik.Klasy.Zadanie_9_6_6_1;

public class Main {
    public static void main(String[] args) {

     Adres adres = new Adres("Warszawa", "44-444", "Warszawska", 12);
     Osoba osoba1 = new Osoba("Jan", "Kowalski", 1934, adres);
     Osoba osoba2 = new Osoba("Jan", "Nowak", 1980, "Warszawa", "01-231", "Grzybowska", 20
        );

        System.out.println(adres);

        System.out.println(osoba1);
        System.out.println(osoba2);

    }
}
