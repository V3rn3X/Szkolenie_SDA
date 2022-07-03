package PL.Poradnik.Klasy.Zadanie_9_6_6_1;

public class Adres {

    private String miejscowosc;
    private String kodPocztowy;
    private String nazwaUlicy;
    private int nrDomu;

    public Adres(String miejscowosc, String kodPocztowy, String nazwaUlicy, int nrDomu) {
        this.miejscowosc = miejscowosc;
        this.kodPocztowy = kodPocztowy;
        this.nazwaUlicy = nazwaUlicy;
        this.nrDomu = nrDomu;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "miejscowosc='" + miejscowosc + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                ", nazwaUlicy='" + nazwaUlicy + '\'' +
                ", nrDomu=" + nrDomu +
                '}';
    }
}
