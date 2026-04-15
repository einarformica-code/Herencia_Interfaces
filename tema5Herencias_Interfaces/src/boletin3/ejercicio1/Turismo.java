package boletin3.ejercicio1;

import java.util.Scanner;

public class Turismo extends Vehiculo {

    private int numPlazas;
    private String tipoUso; // "profesional" o "particular"

    public Turismo(String marca, String modelo, String color, String matricula,
                   int numPlazas, String tipoUso) {
        super(marca, modelo, color, matricula);
        this.numPlazas = numPlazas;
        this.tipoUso = tipoUso;
    }

    @Override
    public void arrancar() {
        if (!motorEncendido) {
            motorEncendido = true;
            marchaActual = 1;
            System.out.println("El coche ha arrancado. Marcha 1.");
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
            System.out.println("El coche se ha parado y el motor se ha apagado.");
        } else {
            System.out.println("El motor ya está apagado.");
        }
    }

    /**
     * Actualiza la marcha automáticamente según la velocidad actual.
     * Rangos: 1ª 0-30 | 2ª 30-50 | 3ª 50-70 | 4ª 70-100 | 5ª 100+
     */
    private void ajustarMarcha() {
        int marchaCorrecta;
        if      (velocidadActual < 30)  marchaCorrecta = 1;
        else if (velocidadActual < 50)  marchaCorrecta = 2;
        else if (velocidadActual < 70)  marchaCorrecta = 3;
        else if (velocidadActual < 100) marchaCorrecta = 4;
        else                            marchaCorrecta = 5;

        if (marchaCorrecta > marchaActual) {
            while (marchaActual < marchaCorrecta) subirMarcha();
        } else if (marchaCorrecta < marchaActual) {
            while (marchaActual > marchaCorrecta) bajarMarcha();
        }
    }

    /**
     * Simula la conducción completa:
     * reposo → arrancar → acelerar → mantener → desacelerar → punto muerto → apagar
     */
    public void simularConduccion(int velocidadObjetivo, int tiempoEspera) {
        System.out.println("\n--- INICIO DE SIMULACIÓN ---");
        System.out.println("Estado inicial: " + this);

        // Arrancar
        arrancar();
        System.out.println(this);

        // Acelerar subiendo de 10 en 10
        System.out.println("\n>> Acelerando hasta " + velocidadObjetivo + " km/h...");
        while (velocidadActual < velocidadObjetivo) {
            velocidadActual = Math.min(velocidadActual + 10, velocidadObjetivo);
            ajustarMarcha();
            System.out.println("  " + this);
        }

        // Mantener velocidad
        System.out.println("\n>> Manteniendo " + velocidadObjetivo + " km/h durante " + tiempoEspera + " segundos...");
        try { Thread.sleep(tiempoEspera * 1000L); } catch (InterruptedException ignored) {}
        System.out.println("  Tiempo completado.");

        // Desacelerar bajando de 10 en 10
        System.out.println("\n>> Desacelerando...");
        while (velocidadActual > 0) {
            velocidadActual = Math.max(velocidadActual - 10, 0);
            ajustarMarcha();
            System.out.println("  " + this);
        }

        // Punto muerto y apagar
        marchaActual = 0;
        System.out.println("\n>> Punto muerto.");
        parar();
        System.out.println("--- FIN DE SIMULACIÓN ---\n");
    }

    // Getters
    public int getNumPlazas() { return numPlazas; }
    public String getTipoUso(){ return tipoUso; }

    @Override
    public String toString() {
        return super.toString() + " | Plazas: " + numPlazas + " | Uso: " + tipoUso;
    }

    // Main de prueba
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la velocidad objetivo (km/h): ");
        int vel = sc.nextInt();
        System.out.print("Introduce el tiempo de espera (segundos): ");
        int tiempo = sc.nextInt();
        sc.close();

        Turismo t = new Turismo("Seat", "Ibiza", "Rojo", "1234ABC", 5, "particular");
        t.simularConduccion(vel, tiempo);
    }
}
