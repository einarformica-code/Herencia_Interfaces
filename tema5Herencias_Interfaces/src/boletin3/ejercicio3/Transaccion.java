package boletin3.ejercicio3;

public class Transaccion {

    private int dia;
    private int mes;
    private int anio;
    private String concepto;
    private double importe;

    public Transaccion(int dia, int mes, int anio, String concepto, double importe) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.concepto = concepto;
        this.importe = importe;
    }

    public int getDia()        { return dia; }
    public int getMes()        { return mes; }
    public int getAnio()       { return anio; }
    public String getConcepto(){ return concepto; }
    public double getImporte() { return importe; }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio + " | " + concepto + " | " + importe + " €";
    }
}
