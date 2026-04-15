package boletin3.ejercicio3;

public class Titular {

    private String dni;
    private String nombre;
    private String apellidos;
    private String telefono;

    public Titular(String dni, String nombre, String apellidos, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public String getDni()           { return dni; }
    public String getNombre()        { return nombre; }
    public String getApellidos()     { return apellidos; }
    public String getTelefono()      { return telefono; }
    public void setTelefono(String t){ this.telefono = t; }
    public void setNombre(String n)  { this.nombre = n; }
    public void setApellidos(String a){ this.apellidos = a; }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " (DNI: " + dni + ", Tel: " + telefono + ")";
    }
}
