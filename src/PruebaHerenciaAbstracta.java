public class PruebaHerenciaAbstracta {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];

        figuras[0] = new Punto(1, 2);
        figuras[1] = new Circulo(3, 4, 5.5);
        figuras[2] = new Cilindro(6, 7, 3.0, 10.0);

        for (Figura f : figuras) {
            System.out.println(f.toString());
            System.out.printf("Área: %.2f\n", f.obtenerArea());
            System.out.printf("Volumen: %.2f\n\n", f.obtenerVolumen());
        }
    }
}