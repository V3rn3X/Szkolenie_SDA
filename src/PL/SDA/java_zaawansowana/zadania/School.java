package PL.SDA.java_zaawansowana.zadania;

import java.math.BigDecimal;

public class School {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("Bober", "warszawa", "primary teacher", BigDecimal.valueOf(2000L));

        Student student = new Student("Andrzej", "katowice", "daily", 1990, BigDecimal.valueOf(10000L));

        Person student2 = new Student("Marta", "myslowice", "daily", 1990, BigDecimal.valueOf(0));



        System.out.println(lecturer);
        System.out.println(student);
        System.out.println(student2);

    }
}
