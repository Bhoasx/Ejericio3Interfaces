public class Cilindro extends Circulo {
    private double altura;

    public Cilindro(int x, int y, double radio, double altura) {
        super(x, y, radio);
        this.altura = altura;
    }

    public double obtenerAltura() {
        return altura;
    }

    @Override
    public double obtenerArea() {
        return 2 * Math.PI * radio * altura + 2 * Math.PI * radio * radio;
    }

    @Override
    public double obtenerVolumen() {
        return Math.PI * radio * radio * altura;
    }

    @Override
    public String obtenerNombre() {
        return "Cilindro";
    }

    @Override
    public String toString() {
        return String.format("%s con centro en (%d, %d), radio %.2f y altura %.2f",
                obtenerNombre(), x, y, radio, altura);
    }
}