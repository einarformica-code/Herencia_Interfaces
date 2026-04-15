package boletin2.ejercicio3;

import java.util.Random;

public class Gato extends AnimalDomestico {

    private static final Random random = new Random();

    public Gato(String nombre, String raza, double peso, String color) {
        super(nombre, raza, peso, color);
    }

    /** El gato maúlla. */
    @Override
    public void hacerRuido() {
        System.out.println(nombre + " dice: ¡Miau miau!");
    }

    /** El gato hace caso el 5% de las veces. */
    @Override
    public boolean hacerCaso() {
        boolean obedece = random.nextDouble() < 0.05;
        if (obedece) {
            System.out.println(nombre + " te hace caso... ¡hoy es tu día de suerte!");
        } else {
            System.out.println(nombre + " te mira con indiferencia y sigue a lo suyo.");
        }
        return obedece;
    }

    /** Método exclusivo del gato. */
    public void toserBolaPelo() {
        System.out.println(nombre + " tose una bola de pelo. ¡Qué asco!");
    }
}
