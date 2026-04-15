package boletin2.ejercicio3;

/**
 * Clase abstracta que implementa Vivir.
 * Los métodos vacunar, dormir y comer son comunes a todos los animales domésticos.
 * Los métodos hacerRuido y hacerCaso son abstractos (cada subclase los implementa).
 */
public abstract class AnimalDomestico implements Vivir {

    protected String nombre;
    protected String raza;
    protected double peso;   // en kg
    protected String color;

    public AnimalDomestico(String nombre, String raza, double peso, String color) {
        this.nombre = nombre;
        this.raza   = raza;
        this.peso   = peso;
        this.color  = color;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getRaza()   { return raza; }
    public double getPeso()   { return peso; }
    public String getColor()  { return color; }

    // --- Métodos comunes a todos los animales domésticos ---

    public void vacunar() {
        System.out.println(nombre + " ha sido vacunado/a correctamente.");
    }

    @Override
    public void dormir() {
        System.out.println(nombre + " está durmiendo... Zzz");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo su pienso.");
    }

    // --- Métodos abstractos (diferentes en cada subclase) ---

    @Override
    public abstract void hacerRuido();

    public abstract boolean hacerCaso();

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + "{nombre='" + nombre + "', raza='" + raza
                + "', peso=" + peso + "kg, color='" + color + "'}";
    }
}
