package boletin3.ejercicio3;

import java.util.ArrayList;

public class CuentaCorriente extends CuentaBancaria {

    private double porcentajeTransaccion; // % cobrado por transacción
    private int numTransacciones;
    private ArrayList<Transaccion> transacciones;

    public CuentaCorriente(String numeroCuenta, double saldoInicial, Titular titular,
                           double porcentajeTransaccion) {
        super(numeroCuenta, saldoInicial, titular);
        this.porcentajeTransaccion = porcentajeTransaccion;
        this.numTransacciones = 0;
        this.transacciones = new ArrayList<>();
    }

    /**
     * Registra una transacción y cobra el porcentaje correspondiente sobre su importe.
     * Si el importe es positivo, es un ingreso; si es negativo, es un cargo.
     */
    public void realizarTransaccion(Transaccion t) {
        double comision = Math.abs(t.getImporte()) * porcentajeTransaccion / 100.0;
        if (saldo < comision) {
            System.out.println("Saldo insuficiente para cubrir la comisión de la transacción.");
            return;
        }
        saldo += t.getImporte();
        saldo -= comision;
        transacciones.add(t);
        numTransacciones++;
        System.out.println("Transacción registrada: " + t);
        System.out.println("  Comisión cobrada: " + comision + " € | Saldo resultante: " + saldo + " €");
    }

    public double getPorcentajeTransaccion()    { return porcentajeTransaccion; }
    public int getNumTransacciones()            { return numTransacciones; }
    public ArrayList<Transaccion> getTransacciones() { return transacciones; }

    public void listarTransacciones() {
        System.out.println("Transacciones de la cuenta " + getNumeroCuenta() + ":");
        if (transacciones.isEmpty()) {
            System.out.println("  (Sin transacciones)");
        } else {
            for (Transaccion t : transacciones) System.out.println("  " + t);
        }
    }

    @Override
    public String toString() {
        return "CORRIENTE | " + super.toString() +
               " | % transacción: " + porcentajeTransaccion +
               "% | Nº transacciones: " + numTransacciones;
    }
}
