package boletin2.ejercicio3;

import java.util.Random;

public class Perro extends AnimalDomestico {

    private static final Random random = new Random();

    public Perro(String nombre, String raza, double peso, String color) {
        super(nombre, raza, peso, color);
    }

    /** El perro ladra. */
    @Override
    public void hacerRuido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }

    /** El perro hace caso el 90% de las veces. */
    @Override
    public boolean hacerCaso() {
        boolean obedece = random.nextDouble() < 0.90;
        if (obedece) {
            System.out.println(nombre + " te hace caso enseguida. ¡Buen perro!");
        } else {
            System.out.println(nombre + " te ignora... quizás otro día.");
        }
        return obedece;
    }

    /** Método exclusivo del perro. */
    public void sacarPaseo() {
        System.out.println(nombre + " sale a pasear feliz, moviendo la cola.");
    }
}
