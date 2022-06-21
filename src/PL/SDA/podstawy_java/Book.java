package PL.SDA.podstawy_java;

public class Book {
    private String author;
    private String title;
    int numOfPages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }


    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", numOfPages=" + numOfPages +
                '}';
    }

    public void setNumOfPages(int numOfPages) {
        if (numOfPages > 0) {
            this.numOfPages = numOfPages;
        } else {
            throw new IllegalArgumentException("Książka nie może mieć ujemnej liczby stron");
        }
        System.out.println("ustawilismy liczbe stron");
    }
}

