package PL.SDA.podstawy_java;

public class Tablice {

    public static void main(String[] args) {


        int[] tab = new int[5];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i;
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
            ;
        }



    }
}