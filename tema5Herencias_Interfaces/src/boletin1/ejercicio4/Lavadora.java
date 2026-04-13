package boletin1.ejercicio4;

public class Lavadora extends Electrodomestico {

    private double carga;

    // Valor por defecto
    private static final double CARGA_DEFAULT = 5.0;

    // Constructor con precio y peso
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = CARGA_DEFAULT;
    }

    // Constructor con carga y el resto de atributos heredados
    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    @Override
    public double precioFinal() {
        // Llama al método padre (aplica recargos de consumo y peso)
        super.precioFinal();

        // Recargo adicional si la carga es mayor de 30 kg
        if (carga > 30) {
            precioBase += 50;
        }

        return precioBase;
    }

    // Getters y Setters
    public double getCarga() { return carga; }
    public void setCarga(double carga) { this.carga = carga; }

    @Override
    public String toString() {
        return "Lavadora [precioBase=" + precioBase + ", color=" + color
                + ", consumo=" + consumoEnergetico + ", peso=" + peso
                + " kg, carga=" + carga + " kg]";
    }
}
