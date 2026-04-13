package boletin1.ejercicio4;

public class Electrodomestico {

    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    // Valores por defecto
    private static final String COLOR_DEFAULT = "blanco";
    private static final char CONSUMO_DEFAULT = 'F';
    private static final double PRECIO_DEFAULT = 100.0;
    private static final double PESO_DEFAULT = 5.0;

    // Constructor con precio y peso
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR_DEFAULT;
        this.consumoEnergetico = CONSUMO_DEFAULT;
    }

    // Constructor con todos los atributos
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    // Comprueba que el consumo energético es correcto (A-F)
    private char comprobarConsumoEnergetico(char letra) {
        char letraMayus = Character.toUpperCase(letra);
        if (letraMayus >= 'A' && letraMayus <= 'F') {
            return letraMayus;
        }
        return CONSUMO_DEFAULT;
    }

    // Comprueba que el color es correcto
    private String comprobarColor(String color) {
        if (color == null) return COLOR_DEFAULT;
        String colorLower = color.toLowerCase();
        switch (colorLower) {
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                return colorLower;
            default:
                return COLOR_DEFAULT;
        }
    }

    // precioFinal: aplica recargos por consumo y por peso
    public double precioFinal() {
        double precio = precioBase;

        // Recargo por consumo energético
        switch (consumoEnergetico) {
            case 'A': precio += 100; break;
            case 'B': precio += 80;  break;
            case 'C': precio += 60;  break;
            case 'D': precio += 50;  break;
            case 'E': precio += 30;  break;
            case 'F': precio += 10;  break;
        }

        // Recargo por tamaño (peso)
        if (peso <= 19) {
            precio += 10;
        } else if (peso <= 49) {
            precio += 50;
        } else if (peso <= 79) {
            precio += 80;
        } else {
            precio += 100;
        }

        precioBase = precio;
        return precioBase;
    }

    // Getters y Setters
    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = comprobarColor(color); }

    public char getConsumoEnergetico() { return consumoEnergetico; }
    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    @Override
    public String toString() {
        return "Electrodomestico [precioBase=" + precioBase + ", color=" + color
                + ", consumo=" + consumoEnergetico + ", peso=" + peso + " kg]";
    }
}
