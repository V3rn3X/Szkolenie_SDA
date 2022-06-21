package PL.Poradnik.Zmienne;

import java.util.Scanner;

public class Point_1 {
    public static void main(String[] args) {


    int a = getInt(), b = getInt(), c = getInt(), d;
    d = a + b + c;

        System.out.println(d);


    }

    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }

    public static String getString(){
        return new Scanner(System.in).nextLine();
    }


}
