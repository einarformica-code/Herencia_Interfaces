package boletin3.ejercicio1;

public class Camion extends Vehiculo {

    private double pesoMaxAutorizado;
    private boolean mercanciasPeligrosas;

    public Camion(String marca, String modelo, String color, String matricula,
                  double pesoMaxAutorizado, boolean mercanciasPeligrosas) {
        super(marca, modelo, color, matricula);
        this.pesoMaxAutorizado = pesoMaxAutorizado;
        this.mercanciasPeligrosas = mercanciasPeligrosas;
    }

    @Override
    public void arrancar() {
        if (!motorEncendido) {
            motorEncendido = true;
            marchaActual = 1;
            System.out.println("El camión ha arrancado.");
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
            System.out.println("El camión se ha parado.");
        } else {
            System.out.println("El motor ya estaba apagado.");
        }
    }

    public double getPesoMaxAutorizado()    { return pesoMaxAutorizado; }
    public boolean isMercanciasPeligrosas() { return mercanciasPeligrosas; }
    public void setMercanciasPeligrosas(boolean val) { this.mercanciasPeligrosas = val; }

    @Override
    public String toString() {
        return super.toString() +
               " | PMA: " + pesoMaxAutorizado + " kg" +
               " | Mercancía peligrosa: " + (mercanciasPeligrosas ? "Sí" : "No");
    }
}
