package boletin4.ejercicio4;

public abstract class Ficha implements Prestable,Comparable<Ficha> {

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
        return "ID: " + id +"\n Titulo:"+titulo + "\n préstamo: " + getPlazoPrestamosDias() + "\n----------------------\n";
    }
    
    @Override
    public int compareTo(Ficha otra) {
    	return Integer.compare(this.id, otra.id);
    }
    
}
