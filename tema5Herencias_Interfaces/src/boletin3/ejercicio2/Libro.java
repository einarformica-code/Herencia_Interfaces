package boletin3.ejercicio2;

public class Libro extends Ficha {

    private String autor;
    private String editorial;

    public Libro(int id, String titulo, String autor, String editorial) {
        super(id, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public int getPlazoPrestamosDias() { return 15; }

    public String getAutor()         { return autor; }
    public String getEditorial()     { return editorial; }
    public void setAutor(String a)   { this.autor = a; }
    public void setEditorial(String e){ this.editorial = e; }

    @Override
    public String toString() {
        return "LIBRO  | " + super.toString() + " | Autor: " + autor + " | Editorial: " + editorial;
    }
}
