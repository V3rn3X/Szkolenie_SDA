package PL.SDA.java_zaawansowana.zadania;

import java.math.BigDecimal;

public class Lecturer extends Person {

    private String spec;
    private BigDecimal price;

    public Lecturer(String name, String address, String spec, BigDecimal price) {
        super(name, address);
        this.spec = spec;
        this.price = price;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + " -> " + this.spec + " -> " + this.price;
    }
}
