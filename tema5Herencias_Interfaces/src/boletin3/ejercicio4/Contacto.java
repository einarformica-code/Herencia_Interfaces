package boletin3.ejercicio4;

public abstract class Contacto {

    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre()         { return nombre; }
    public String getTelefono()       { return telefono; }
    public void setTelefono(String t) { this.telefono = t; }

    /** Dos contactos son iguales si tienen el mismo nombre */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contacto)) return false;
        Contacto otro = (Contacto) o;
        return this.nombre.equalsIgnoreCase(otro.nombre);
    }

    @Override
    public String toString() {
        return nombre + " | Tel: " + telefono;
    }
}
