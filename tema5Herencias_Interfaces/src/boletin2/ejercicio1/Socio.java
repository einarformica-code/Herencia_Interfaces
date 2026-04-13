package boletin2.ejercicio1;

public class Socio implements Comparable<Socio> {

    private int id;
    private String nombre;
    private int edad;

    public Socio(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    @Override
    public String toString() {
        return "Socio{id=" + id + ", nombre='" + nombre + "', edad=" + edad + "}";
    }

    @Override
    public int compareTo(Socio otro) {
        // Orden ascendente por id
        return Integer.compare(this.id, otro.id);
    }
}
