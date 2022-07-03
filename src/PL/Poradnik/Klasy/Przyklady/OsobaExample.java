package PL.Poradnik.Klasy.Przyklady;

import PL.Poradnik.Klasy.Przyklady.Osoba;

public class OsobaExample {

    public static void main(String[] args) {

        Osoba obywatel1 = new Osoba();

        obywatel1.ustawWiek(30);
        obywatel1.ustawImie("Andrzej");
        obywatel1.ustawNazwisko("Malinowski");

        System.out.println(obywatel1);

    }

}
