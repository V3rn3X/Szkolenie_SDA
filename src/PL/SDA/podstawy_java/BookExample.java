package PL.SDA.podstawy_java;

public class BookExample {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();

        try {
            b1.setTitle("Ksiazka1");
            b1.setAuthor("Autor1");
            b1.setNumOfPages(1234);

            b2.setTitle("Ksiazka2");
            b2.setAuthor("Autor2");
            b2.setNumOfPages(-3);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }


        System.out.println(b1);
        System.out.println(b2);


    }
}