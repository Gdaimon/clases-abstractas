package abstracto;

public class Circulo extends Figura{
    private int radio;

    public Circulo(String color, int radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double area() {
        return 3.1416 * (this.radio * this.radio);
    }

}
