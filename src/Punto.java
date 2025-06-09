public class Punto extends Figura {
    protected int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int obtenerX() {
        return x;
    }

    public int obtenerY() {
        return y;
    }

    @Override
    public String obtenerNombre() {
        return "Punto";
    }

    @Override
    public String toString() {
        return String.format("%s en (%d, %d)", obtenerNombre(), x, y);
    }
}