package boletin4ejercicio2;

import java.util.Comparator;

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
        return "\nid: " + id + "\n nombre:" + nombre + "\n edad:" + edad + "\n ----------------------------------------";
    }

    @Override
    public int compareTo(Socio otro) {
        // Orden ascendente por id
        return Integer.compare(this.id, otro.id);
    }
    final static Comparator<Socio>orderAge = (age1,age2)-> -Integer.compare(age1.getEdad(), age2.getEdad());
    
    final static Comparator<Socio> orderAlphabet = (name1, name2)-> name1.getNombre().compareTo(name2.getNombre()); 
}
