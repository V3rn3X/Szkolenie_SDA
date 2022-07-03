package PL.Poradnik.Klasy.Zadanie_9_3_2_1;

public class Ksiegarnia {

    public static void main(String[] args) {

        Ksiazka lokomotywa = new Ksiazka();

        lokomotywa.tytul = "Lokomotywa";
        lokomotywa.autor = "Julian Tuwim";
        lokomotywa.ustawCene(29.99);

        System.out.println(lokomotywa);

        lokomotywa.ustawCene(-30);

        System.out.println(lokomotywa);

    }

}
