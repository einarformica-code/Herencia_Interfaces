package boletin3.ejercicio2;

public class Revista extends Ficha {

    private int numeroRevista;
    private int anioPublicacion;

    public Revista(int id, String titulo, int numeroRevista, int anioPublicacion) {
        super(id, titulo);
        this.numeroRevista = numeroRevista;
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public int getPlazoPrestamosDias() { return 10; }

    public int getNumeroRevista()       { return numeroRevista; }
    public int getAnioPublicacion()     { return anioPublicacion; }
    public void setAnioPublicacion(int a){ this.anioPublicacion = a; }

    @Override
    public String toString() {
        return "REVISTA | " + super.toString() + " | Nº: " + numeroRevista + " | Año: " + anioPublicacion;
    }
}
