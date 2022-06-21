package PL.SDA.podstawy_java;

import java.util.Scanner;
import java.util.Arrays;


public class Zadanie {
    public static void main(String[] args) {


        //////////////////////////////////////////////////////////////////////
        // Task 1 i 2
        //////////////////////////////////////////////////////////////////////

        System.out.println("Podaj imiona\n");

        Scanner number = new Scanner(System.in);
        String[] imiona = new String[5];

        for (int i = 0; i < imiona.length; i++) {
            System.out.println("Podaj imie " + (i + 1) + ":");
            imiona[i] = number.nextLine();
        }

        System.out.println();
        System.out.println(Arrays.toString(imiona));
        System.out.println();

        String[] zad4 = Arrays.copyOf(imiona, imiona.length);

        int k = 1;
        for (String imie : imiona) {
            System.out.println(k++ + ". " + imie);
        }

        //////////////////////////////////////////////////////////////////////
        // Task 3
        //////////////////////////////////////////////////////////////////////

        System.out.println();
        System.out.println("Zadanie 3:");

        String[] tab = {"Ala", "ma", "kota"};
        String[] tab1 = new String[tab.length];

        int t = tab.length - 1;
        for (int i = 0; i < tab.length; i++) {
            tab1[i] = tab[t];
            t--;
        }

        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(tab1));

        System.out.println();
        k = 1;
        for (String ex1 : tab) {
            System.out.println(k++ + ". " + ex1);
        }
        System.out.println();

        k = 1;
        for (String ex2 : tab1) {
            System.out.println(k++ + ". " + ex2);
        }

        //////////////////////////////////////////////////////////////////////
        // Task 3*
        //////////////////////////////////////////////////////////////////////

        System.out.println();
        System.out.println("Zadanie 3*:");

        String temp;
        int l = imiona.length - 1;
        for (int i = 0; i < imiona.length / 2; i++) {
            temp = imiona[i];
            imiona[i] = imiona[l];
            imiona[l] = temp;
            l--;
        }

        System.out.println();
        System.out.println(Arrays.toString(imiona));
        k = 1;
        for (String imie : imiona) {
            System.out.println(k++ + ". " + imie);
        }


        //////////////////////////////////////////////////////////////////////
        // Task 4
        //////////////////////////////////////////////////////////////////////

        System.out.println();
        System.out.println("Zadanie 4:");

        for (int i = zad4.length - 1; i >= 0; i--) {
            for (int j = zad4[i].length() - 1; j >= 0; j--) {
                System.out.print(zad4[i].charAt(j));
            }
            System.out.println();
        }

        //////////////////////////////////////////////////////////////////////
        // Task 4*
        //////////////////////////////////////////////////////////////////////


        System.out.println();
        System.out.println("Zadanie 4*:");

        String[] zad4g = new String[zad4.length];

        int temp1;

        for (int i = 0; i < zad4.length; i++) {
            temp1 = zad4[i].length() - 1;
            for (int j = 0; j < zad4[i].length(); j++) {
                if (zad4g[i] == null) {
                    zad4g[i] = "" + zad4[i].charAt(temp1);
                } else {
                    zad4g[i] = zad4g[i] + zad4[i].charAt(temp1);
                }
                temp1--;
            }
        }
        System.out.println(Arrays.toString(zad4));
        System.out.println(Arrays.toString(zad4g));
    }
}
