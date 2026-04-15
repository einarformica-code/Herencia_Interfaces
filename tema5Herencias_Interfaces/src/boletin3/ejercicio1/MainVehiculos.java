package boletin3.ejercicio1;

public class MainVehiculos {

    public static void main(String[] args) {

        System.out.println("=== CAMIÓN ===");
        Camion c = new Camion("Volvo", "FH16", "Blanco", "1111BBB", 26000, true);
        c.arrancar();
        c.subirMarcha();
        c.subirMarcha();
        c.bajarMarcha();
        c.parar();
        System.out.println(c);

        System.out.println("\n=== MOTOCICLETA ===");
        Motocicleta m1 = new Motocicleta("Honda", "CBR", "Rojo", "2222CCC", 600);
        Motocicleta m2 = new Motocicleta("Peugeot", "Tweet", "Azul", "3333DDD", 50);
        System.out.println(m1 + "\n" + m2);

        System.out.println("\n=== TURISMO (simulación) ===");
        // Velocidad objetivo: 80 km/h, tiempo de espera: 2 segundos
        Turismo t = new Turismo("Toyota", "Corolla", "Gris", "4444EEE", 5, "particular");
        t.simularConduccion(80, 2);
    }
}
