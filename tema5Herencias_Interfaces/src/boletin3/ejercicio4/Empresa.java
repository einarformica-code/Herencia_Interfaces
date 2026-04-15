package boletin3.ejercicio4;

public class Empresa extends Contacto {

    private String paginaWeb;

    public Empresa(String nombre, String telefono, String paginaWeb) {
        super(nombre, telefono);
        this.paginaWeb = paginaWeb;
    }

    public String getPaginaWeb()       { return paginaWeb; }
    public void setPaginaWeb(String p) { this.paginaWeb = p; }

    @Override
    public String toString() {
        return "EMPRESA  | " + super.toString() + " | Web: " + paginaWeb;
    }
}
