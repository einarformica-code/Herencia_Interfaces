package boletin3.ejercicio4;

public class Persona extends Contacto {

    private String cumpleanos; // formato "DD/MM/AAAA"

    public Persona(String nombre, String telefono, String cumpleanos) {
        super(nombre, telefono);
        this.cumpleanos = cumpleanos;
    }

    public String getCumpleanos()       { return cumpleanos; }
    public void setCumpleanos(String c) { this.cumpleanos = c; }

    @Override
    public String toString() {
        return "PERSONA  | " + super.toString() + " | Cumpleaños: " + cumpleanos;
    }
}
