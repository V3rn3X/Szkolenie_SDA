package PL.SDA.podstawy_java;

import java.util.Optional;
import java.util.regex.Pattern;

import static PL.SDA.podstawy_java.Pracownik.validate;

public class PracownikExample {
    public static void main(String[] args) {

        Pattern mailPattern = Pattern.compile("([a-zA-Z0-9_\\-]+\\.)*[a-zA-Z0-9_\\-]+@([\\w\\-]+\\.)*[\\w\\-]+\\.[a-z]{2,4}");

        Pracownik p = new Pracownik("Heniek");
        Pracownik p1 = new Pracownik("Gienek", "Moczybroda");
        Pracownik p2 = new Pracownik("Zenek", "Zdunek", 40, "12-12-2021",
                8000, "zenek@zdunek.pl", "Heniek", "Majster", "Tedek");
        Pracownik p3 = new Pracownik("Sierotka", "Marysia", 40, "12-12-2021",
                5000, "Ala", "Kot");

        validate(mailPattern, p2.getMail());

        p.pracuj();
        p1.odpoczywaj();

        p1.setDataZatrudnienia("12-12-1966");
        System.out.println(p1.getImie() +" - Data zatrudnienia: " + p1.getDataZatrudnienia());

        System.out.println(p);
        System.out.println(p1); //Gienek Moczybroda lat:0 id:2
        System.out.println(new Pracownik("Stefan"));
        System.out.println(p2); //Zenek Zdunek lat:40 id:4 Podwładni:Heniek, Majster, Tedek
        System.out.println(p3);

//        Pracownik x = null;
//        Optional<Pracownik> optionalPracownik = Optional.ofNullable(x);
//        System.out.println(optionalPracownik.orElse(new Pracownik("no name")));

    }
}

