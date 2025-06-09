import java.util.Scanner;

public class PruebaHerenciaAbstracta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX = 10; 
        Figura[] figuras = new Figura[MAX];
        int cantidad = 0;

        int opcion;
        do {
            System.out.println("\n--- Menú de Figuras ---");
            System.out.println("1. Crear Punto");
            System.out.println("2. Crear Círculo");
            System.out.println("3. Crear Cilindro");
            System.out.println("4. Mostrar figuras ingresadas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 3 && cantidad >= MAX) {
                System.out.println("Ya se alcanzó el número máximo de figuras.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Coordenada X: ");
                    int x1 = scanner.nextInt();
                    System.out.print("Coordenada Y: ");
                    int y1 = scanner.nextInt();
                    figuras[cantidad++] = new Punto(x1, y1);
                    break;
                case 2:
                    System.out.print("Coordenada X: ");
                    int x2 = scanner.nextInt();
                    System.out.print("Coordenada Y: ");
                    int y2 = scanner.nextInt();
                    System.out.print("Radio: ");
                    double r1 = scanner.nextDouble();
                    figuras[cantidad++] = new Circulo(x2, y2, r1);
                    break;
                case 3:
                    System.out.print("Coordenada X: ");
                    int x3 = scanner.nextInt();
                    System.out.print("Coordenada Y: ");
                    int y3 = scanner.nextInt();
                    System.out.print("Radio: ");
                    double r2 = scanner.nextDouble();
                    System.out.print("Altura: ");
                    double h = scanner.nextDouble();
                    figuras[cantidad++] = new Cilindro(x3, y3, r2, h);
                    break;
                case 4:
                    System.out.println("\n=== Figuras ingresadas ===");
                    for (int i = 0; i < cantidad; i++) {
                        System.out.println(figuras[i].toString());
                        System.out.printf("Área: %.2f\n", figuras[i].obtenerArea());
                        System.out.printf("Volumen: %.2f\n\n", figuras[i].obtenerVolumen());
                    }
                    break;
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
