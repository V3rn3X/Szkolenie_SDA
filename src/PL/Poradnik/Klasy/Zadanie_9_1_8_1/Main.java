package PL.Poradnik.Klasy.Zadanie_9_1_8_1;

public class Main {
    public static void main(String[] args) {

        Osoba Mietek = new Osoba();
        Osoba Andrzej = new Osoba();
        Osoba Alicja = new Osoba();

        Mietek.ustawWiek(30);
        Mietek.ustawImie("Mietek");
        Mietek.ustawNazwisko("Nowak");

        Andrzej.ustawWiek(43);
        Andrzej.ustawImie("Andrzej");
        Andrzej.ustawNazwisko("Malinowski");

        Alicja.ustawWiek(18);
        Alicja.ustawImie("Alicja");
        Alicja.ustawNazwisko("Pill");

        System.out.println(Andrzej);
        System.out.println(Mietek);
        System.out.println(Alicja);

    }
}
