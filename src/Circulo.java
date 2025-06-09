public class Circulo extends Punto {
    protected double radio;

    public Circulo(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    public double obtenerRadio() {
        return radio;
    }

    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String obtenerNombre() {
        return "Círculo";
    }

    @Override
    public String toString() {
        return String.format("%s con centro en (%d, %d) y radio %.2f", obtenerNombre(), x, y, radio);
    }
}