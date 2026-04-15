package boletin3.ejercicio4;

public class MainAgenda {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.añadirContacto(new Persona("María Sánchez", "600123456", "15/03/1995"));
        agenda.añadirContacto(new Persona("Juan Pérez", "611987654", "22/07/1988"));
        agenda.añadirContacto(new Empresa("Fontanería López", "954111222", "www.fontanerialopez.es"));
        agenda.añadirContacto(new Empresa("Electricidad Norte", "954333444", "www.electricidadnorte.com"));

        // Intento de duplicado
        agenda.añadirContacto(new Persona("Juan Pérez", "699000000", "01/01/1990"));

        agenda.listarContactos();

        System.out.println("\nBuscando a María Sánchez:");
        Contacto encontrado = agenda.buscarContacto("María Sánchez");
        if (encontrado != null) System.out.println("  Encontrado: " + encontrado);

        agenda.borrarContacto("Juan Pérez");
        agenda.listarContactos();
    }
}
