package boletin2.ejercicio2;

public class Futbolista implements Comparable<Futbolista> {

    private int numeroCamiseta;
    private String nombre;
    private int edad;
    private int numeroGoles;

    public Futbolista(int numeroCamiseta, String nombre, int edad, int numeroGoles) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
    }

    // Getters
    public int getNumeroCamiseta() { return numeroCamiseta; }
    public String getNombre()      { return nombre; }
    public int getEdad()           { return edad; }
    public int getNumeroGoles()    { return numeroGoles; }

    // toString
    @Override
    public String toString() {
        return String.format("Futbolista{camiseta=%2d, nombre='%-18s', edad=%2d, goles=%d}",
                numeroCamiseta, nombre, edad, numeroGoles);
    }

    // equals: dos futbolistas son iguales si tienen el mismo número de camiseta Y nombre
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Futbolista)) return false;
        Futbolista otro = (Futbolista) obj;
        return this.numeroCamiseta == otro.numeroCamiseta
                && this.nombre.equals(otro.nombre);
    }

    @Override
    public int hashCode() {
        return 31 * numeroCamiseta + nombre.hashCode();
    }

    // compareTo: primero por número de camiseta; si empatan, por nombre
    @Override
    public int compareTo(Futbolista otro) {
        int cmp = Integer.compare(this.numeroCamiseta, otro.numeroCamiseta);
        if (cmp != 0) return cmp;
        return this.nombre.compareTo(otro.nombre);
    }
}
