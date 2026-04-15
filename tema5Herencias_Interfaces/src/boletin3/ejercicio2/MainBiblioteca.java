package boletin3.ejercicio2;

public class MainBiblioteca {

    public static void main(String[] args) {
        Ficha[] fichas = {
            new Libro(1, "Don Quijote", "Cervantes", "Alfaguara"),
            new Revista(2, "National Geographic", 345, 2024),
            new DVD(3, "Oppenheimer", "Christopher Nolan", 2023, "película")
        };

        System.out.println("=== FICHAS DE BIBLIOTECA ===");
        for (Ficha f : fichas) {
            System.out.println(f);
        }
    }
}
