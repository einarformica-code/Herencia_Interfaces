package boletin1.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Crear la lista de tipo Electrodomestico
        List<Electrodomestico> lista = new ArrayList<>();

        // --- Electrodomésticos genéricos ---
        Electrodomestico e1 = new Electrodomestico(150, 25);           // precio=150, peso=25
        Electrodomestico e2 = new Electrodomestico(200, "rojo", 'B', 60); // precio=200, rojo, B, 60kg

        // --- Lavadoras ---
        Lavadora l1 = new Lavadora(300, 40);                               // precio=300, peso=40, carga=5(default)
        Lavadora l2 = new Lavadora(400, "blanco", 'A', 55, 35);           // carga=35 > 30 → +50€

        // --- Televisiones ---
        Television t1 = new Television(500, 10);                                    // precio=500, peso=10, 20", sin TDT
        Television t2 = new Television(600, "negro", 'C', 15, 55, true); // 55" >40 +30%, TDT +50

        // Añadir todos a la lista
        lista.add(e1);
        lista.add(e2);
        lista.add(l1);
        lista.add(l2);
        lista.add(t1);
        lista.add(t2);

        System.out.println("   LISTA DE ELECTRODOMÉSTICOS");


        double totalElectrodomesticos = 0;
        double totalLavadoras = 0;
        double totalTelevisiones = 0;

        // Recorrer la lista y ejecutar precioFinal() para cada objeto
        for (Electrodomestico ed : lista) {
            double precio = ed.precioFinal();
            System.out.println(ed + " → Precio final: " + String.format("%.2f", precio) + " €");

            // Acumular totales usando instanceof
            totalElectrodomesticos += precio;

            if (ed instanceof Lavadora) {
                totalLavadoras += precio;
            } else if (ed instanceof Television) {
                totalTelevisiones += precio;
            }
        }


        System.out.println("   RESUMEN DE PRECIOS");

        System.out.printf("Total Electrodomésticos (todos):", totalElectrodomesticos);
        System.out.printf("Total Lavadoras: ", totalLavadoras);
        System.out.printf("Total Televisiones:", totalTelevisiones);

    }
}
