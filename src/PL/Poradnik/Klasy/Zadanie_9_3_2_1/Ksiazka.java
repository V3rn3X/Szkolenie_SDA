package PL.Poradnik.Klasy.Zadanie_9_3_2_1;

import java.sql.SQLOutput;

public class Ksiazka {

    public String tytul;
    public String autor;

    private double cena;

    public void ustawCene (double nowaCena){
        if(czyCenaJestPoprawna(nowaCena)){
            this.cena = nowaCena;
        }
        else{
            System.out.println("Cena " + nowaCena + " jest nieprawidlowa!");
        }
    }

    public String toString(){
        return "Ksiazka o tytule " + tytul + ", której autorem jest " + autor + " kosztuje " + cena;
    }

    private boolean czyCenaJestPoprawna(double cenaDoSprawdzenia){
        return cenaDoSprawdzenia > 0;
    }

}
