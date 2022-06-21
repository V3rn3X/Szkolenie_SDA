package PL.SDA.podstawy_java;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String dataZatrudnienia;
    private int wynagrodzenie;

    private String mail;
    private int numerID;
    private static int liczbaPracowników;
    private String[] podwladni;

    public Pracownik(String imie) {
        this.imie = imie;
        this.numerID = ++liczbaPracowników;
    }

    public Pracownik(String imie, String nazwisko) {
        this(imie);
        this.nazwisko = nazwisko;
    }

    public Pracownik(String imie, String nazwisko, int wiek, String dataZatrudnienia, int wynagrodzenie) {
        this(imie, nazwisko);
        this.wiek = wiek;
        this.dataZatrudnienia = dataZatrudnienia;
        this.wynagrodzenie = wynagrodzenie;
    }

    public Pracownik(String imie, String nazwisko, int wiek, String dataZatrudnienia, int wynagrodzenie, String mail,String... podwladni) {
        this(imie, nazwisko, wiek, dataZatrudnienia, wynagrodzenie);
        this.podwladni = podwladni;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getMail() {return mail; }

    public void setMail(String mail) {this.mail = mail;}

    public String getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public void setDataZatrudnienia(String dataZatrudnienia) {
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public int getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(int wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    public int getNumerID() {
        return numerID;
    }

    public void pracuj() {
        System.out.println(imie + " pracuje");
    }

    public void odpoczywaj() {
        System.out.println(imie + " odpoczywa");
    }

    @Override
    public String toString() {
        String temp = imie + " " + nazwisko + " lat:" + wiek + " numer: " + numerID;  //Gienek Moczybroda lat:36

        if (podwladni != null && this.podwladni.length > 0) {
            temp += " Podwładni:";
//            for (int i = 0 ; i < podwladni.length;i++){
//                temp += podwladni[i] + " ";
//            }
            for (String podwladny : podwladni) {
                temp += podwladny + " ";
            }
        }
        return temp;

    }

    public static void validate(Pattern pattern, String text){
        System.out.println(text + " matches pattern: " + pattern.matcher(text).matches());
    }

}