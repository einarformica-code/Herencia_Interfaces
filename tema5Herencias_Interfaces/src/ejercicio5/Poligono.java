public abstract class Poligono {
    private int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public abstract double area();

    @Override
    public String toString() {
        return "Polígono con " + numeroLados + " lados";
    }
}
