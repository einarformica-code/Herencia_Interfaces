package boletin3.ejercicio1;

public class Motocicleta extends Vehiculo {

    private int cilindrada; // en CC

    public Motocicleta(String marca, String modelo, String color, String matricula, int cilindrada) {
        super(marca, modelo, color, matricula);
        this.cilindrada = cilindrada;
    }

    @Override
    public void arrancar() {
        if (!motorEncendido) {
            motorEncendido = true;
            marchaActual = 1;
            System.out.println("La moto ha arrancado.");
        } else {
            System.out.println("El motor ya está encendido.");
        }
    }

    @Override
    public void parar() {
        if (motorEncendido) {
            velocidadActual = 0;
            marchaActual = 0;
            motorEncendido = false;
            System.out.println("La moto se ha parado.");
        } else {
            System.out.println("El motor ya estaba apagado.");
        }
    }

    /** Las motos de 125 CC o más requieren carnet de conducir */
    public boolean requiereCarnet() {
        return cilindrada >= 125;
    }

    public int getCilindrada() { return cilindrada; }

    @Override
    public String toString() {
        return super.toString() +
               " | Cilindrada: " + cilindrada + " CC" +
               " | Requiere carnet: " + (requiereCarnet() ? "Sí" : "No");
    }
}
