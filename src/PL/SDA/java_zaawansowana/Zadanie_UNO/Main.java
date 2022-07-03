package PL.SDA.java_zaawansowana.Zadanie_UNO;

public class Main {
    public static void main(String[] args) {

        Rectangle prostokat = new Rectangle(4, 5);
        prostokat.getArea();
        prostokat.getPerimeter();

        System.out.println();

        Circle kolo = new Circle(7);
        kolo.getArea();
        kolo.getPerimeter();

        System.out.println();

        Square kwadrat = new Square(5);
        kwadrat.getArea();
        kwadrat.getPerimeter();

    }
}

class Rectangle implements Shape {

    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void getArea() {
        System.out.println("Pole prostokata o bokach " + a + " oraz " + b + " to: " + (a * b));
    }

    @Override
    public void getPerimeter() {
        System.out.println("Obwód prostokata o bokach " + a + " oraz " + b + " to: " + (a + a + b + b));
    }
}

class Circle implements Shape {

    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void getArea() {
        System.out.println("Pole kola o promieniu " + r + " to: " + (PI * r * r));
    }

    @Override
    public void getPerimeter() {
        System.out.println("Obwod kola o promieniu " + r + " to: " + (2 * PI * r));
    }
}

class Square implements Shape {

    int x;

    public Square(int x) {
        this.x = x;
    }

    @Override
    public void getArea() {
        System.out.println("Pole kwadratu o boku " + x + " to: " + (x * x));

    }

    @Override
    public void getPerimeter() {
        System.out.println("Obwód kwadratu o boku " + x + " to: " + (4 * x));
    }
}
