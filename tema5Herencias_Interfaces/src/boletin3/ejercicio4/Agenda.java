package boletin3.ejercicio4;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public boolean añadirContacto(Contacto c) {
        if (contactos.contains(c)) {
            System.out.println("Ya existe un contacto con el nombre: " + c.getNombre());
            return false;
        }
        contactos.add(c);
        System.out.println("Contacto añadido: " + c.getNombre());
        return true;
    }

    public boolean borrarContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                contactos.remove(c);
                System.out.println("Contacto eliminado: " + nombre);
                return true;
            }
        }
        System.out.println("No se encontró el contacto: " + nombre);
        return false;
    }

    public Contacto buscarContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) return c;
        }
        System.out.println("Contacto no encontrado: " + nombre);
        return null;
    }

    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
            return;
        }
        System.out.println("--- AGENDA (" + contactos.size() + " contactos) ---");
        for (Contacto c : contactos) System.out.println("  " + c);
        System.out.println("----------------------------");
    }
}
