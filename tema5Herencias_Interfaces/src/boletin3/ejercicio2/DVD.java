package boletin3.ejercicio2;

public class DVD extends Ficha {

    private String director;
    private int anio;
    private String tipo; // "película", "documental" o "serie"

    public DVD(int id, String titulo, String director, int anio, String tipo) {
        super(id, titulo);
        this.director = director;
        this.anio = anio;
        this.tipo = tipo;
    }

    @Override
    public int getPlazoPrestamosDias() { return 5; }

    public String getDirector()        { return director; }
    public int getAnio()               { return anio; }
    public String getTipo()            { return tipo; }
    public void setDirector(String d)  { this.director = d; }
    public void setAnio(int a)         { this.anio = a; }
    public void setTipo(String t)      { this.tipo = t; }

    @Override
    public String toString() {
        return "DVD    | " + super.toString() +
               " | Director: " + director + " | Año: " + anio + " | Tipo: " + tipo;
    }
}
