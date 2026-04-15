package boletin3.ejercicio2;

public abstract class Ficha implements Prestable {

    private int id;
    private String titulo;

    public Ficha(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public int getId()           { return id; }
    public String getTitulo()    { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    @Override
    public String toString() {
        return "[ID: " + id + "] " + titulo + " (préstamo: " + getPlazoPrestamosDias() + " días)";
    }
}
