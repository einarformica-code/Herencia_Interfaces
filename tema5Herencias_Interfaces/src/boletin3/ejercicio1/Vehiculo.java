package boletin3.ejercicio1;

public abstract class Vehiculo {

    private String marca;
    private String modelo;
    private String color;
    private String matricula;

    protected boolean motorEncendido;
    protected int marchaActual;
    protected int velocidadActual;

    public Vehiculo(String marca, String modelo, String color, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.motorEncendido = false;
        this.marchaActual = 0;
        this.velocidadActual = 0;
    }

    public abstract void arrancar();
    public abstract void parar();

    public void subirMarcha() {
        if (!motorEncendido) {
            System.out.println("El motor está apagado. No se puede subir marcha.");
            return;
        }
        if (marchaActual < 5) {
            marchaActual++;
            System.out.println("Subida a marcha: " + marchaActual);
        } else {
            System.out.println("Ya estás en la marcha máxima (5ª).");
        }
    }

    public void bajarMarcha() {
        if (marchaActual > 1) {
            marchaActual--;
            System.out.println("Bajada a marcha: " + marchaActual);
        } else if (marchaActual == 1) {
            marchaActual = 0;
            System.out.println("Punto muerto.");
        } else {
            System.out.println("Ya estás en punto muerto.");
        }
    }

    // Getters
    public String getMarca()         { return marca; }
    public String getModelo()        { return modelo; }
    public String getColor()         { return color; }
    public String getMatricula()     { return matricula; }
    public boolean isMotorEncendido(){ return motorEncendido; }
    public int getMarchaActual()     { return marchaActual; }
    public int getVelocidadActual()  { return velocidadActual; }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + matricula + ")" +
               " | Motor: " + (motorEncendido ? "encendido" : "apagado") +
               " | Marcha: " + marchaActual +
               " | Velocidad: " + velocidadActual + " km/h";
    }
}
