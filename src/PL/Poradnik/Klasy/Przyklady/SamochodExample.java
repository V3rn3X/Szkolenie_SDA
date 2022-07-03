package PL.Poradnik.Klasy;

public class SamochodExample {
    public static void main(String[] args) {

        Samochod samochod1 = new Samochod(); // 1
        samochod1.ustawKolor("Zielony");
        samochod1.ustawPredkosc(50);
        samochod1.ustawWaga(3000);

        Samochod samochod2 = new Samochod(); // 2
        samochod2.ustawKolor("Niebieski");
        samochod2.ustawPredkosc(60);
        samochod2.ustawWaga(5000);


        System.out.println(samochod1); // 1
        System.out.println(samochod2); // 2

        System.out.println();

        String opisSamochodu1 = samochod1.toString(); // 3
        String dokladniejszyOpis = "Opis zmiennej samochod1 to: " + samochod1; // 4
        System.out.println(opisSamochodu1);
        System.out.println(dokladniejszyOpis);

    }
}