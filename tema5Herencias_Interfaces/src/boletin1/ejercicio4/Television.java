package boletin1.ejercicio4;

public class Television extends Electrodomestico {

    private int resolucion;
    private boolean sintonizadorTDT;

    // Valores por defecto
    private static final int RESOLUCION_DEFAULT = 20;
    private static final boolean SINTONIZADOR_DEFAULT = false;

    // Constructor con precio y peso
    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION_DEFAULT;
        this.sintonizadorTDT = SINTONIZADOR_DEFAULT;
    }

    // Constructor con resolución, sintonizador y el resto de atributos heredados
    public Television(double precioBase, String color, char consumoEnergetico, double peso,
                      int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        // Llama al método padre (aplica recargos de consumo y peso)
        super.precioFinal();

        // Recargo del 30% si resolución > 40 pulgadas
        if (resolucion > 40) {
            precioBase += precioBase * 0.30;
        }

        // Recargo de 50€ si tiene sintonizador TDT
        if (sintonizadorTDT) {
            precioBase += 50;
        }

        return precioBase;
    }

    // Getters y Setters
    public int getResolucion() { return resolucion; }
    public void setResolucion(int resolucion) { this.resolucion = resolucion; }

    public boolean isSintonizadorTDT() { return sintonizadorTDT; }
    public void setSintonizadorTDT(boolean sintonizadorTDT) { this.sintonizadorTDT = sintonizadorTDT; }

    @Override
    public String toString() {
        return "Television [precioBase=" + precioBase + ", color=" + color
                + ", consumo=" + consumoEnergetico + ", peso=" + peso
                + " kg, resolucion=" + resolucion + "\", TDT=" + sintonizadorTDT + "]";
    }
}
