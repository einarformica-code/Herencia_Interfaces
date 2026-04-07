package ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Poligono> listaPoligonos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero("Elige una opción: ");

            switch (opcion) {
                case 1 -> introducirTriangulo();
                case 2 -> introducirRectangulo();
                case 3 -> mostrarPoligonos();
                case 0 -> System.out.println("Saliendo del programa. ¡Hasta pronto!");
                default -> System.out.println("Opción no válida. Inténtalo de nuevo.\n");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
     
        System.out.println("  1. Introducir triángulo     ");
        System.out.println(" 2. Introducir rectángulo    ");
        System.out.println("  3. Mostrar polígonos        ");
        System.out.println("  0. Salir                    ");

    }

    // ----- Opción 1: Introducir triángulo -----
    private static void introducirTriangulo() {
        System.out.println("\n--- Introducir Triángulo ---");
        double a = leerDouble("Introduce el lado A: ");
        double b = leerDouble("Introduce el lado B: ");
        double c = leerDouble("Introduce el lado C: ");

        Triangulo t = new Triangulo(a, b, c);

        if (!t.esValido()) {
            System.out.println("⚠ Los lados introducidos no forman un triángulo válido. No se ha añadido.\n");
        } else {
            listaPoligonos.add(t);
            System.out.println("✔ Triángulo añadido correctamente.\n");
        }
    }

    // ----- Opción 2: Introducir rectángulo -----
    private static void introducirRectangulo() {
        System.out.println("\n--- Introducir Rectángulo ---");
        double base   = leerDouble("Introduce la base: ");
        double altura = leerDouble("Introduce la altura: ");

        Rectangulo r = new Rectangulo(base, altura);
        listaPoligonos.add(r);
        System.out.println("✔ Rectángulo añadido correctamente.\n");
    }

    // ----- Opción 3: Mostrar polígonos -----
    private static void mostrarPoligonos() {
        System.out.println("\n--- Lista de Polígonos ---");

        if (listaPoligonos.isEmpty()) {
            System.out.println("No hay polígonos almacenados.\n");
            return;
        }

        for (int i = 0; i < listaPoligonos.size(); i++) {
            Poligono p = listaPoligonos.get(i);
            System.out.printf("  [%d] %s%n", i + 1, p.toString());
            System.out.printf("      Área: %.4f%n", p.area());
        }
        System.out.println();
    }


    private static double leerDouble(String mensaje) {
        double valor = 0;
        boolean valido = false;
        while (!valido) {
            System.out.print(mensaje);
            try {
                valor = Double.parseDouble(scanner.nextLine().trim());
                if (valor <= 0) {
                    System.out.println("El valor debe ser positivo. Inténtalo de nuevo.");
                } else {
                    valido = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Introduce un número.");
            }
        }
        return valor;
    }

    private static int leerEntero(String mensaje) {
        int valor = -1;
        boolean valido = false;
        while (!valido) {
            System.out.print(mensaje);
            try {
                valor = Integer.parseInt(scanner.nextLine().trim());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Introduce un número entero.");
            }
        }
        return valor;
    }
}
