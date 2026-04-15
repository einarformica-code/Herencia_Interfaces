package boletin3.ejercicio3;

import java.util.ArrayList;

public abstract class CuentaBancaria {

    private String numeroCuenta;
    protected double saldo;
    private ArrayList<Titular> titulares;

    private static final int MAX_TITULARES = 3;

    /** Constructor: obliga a tener al menos un titular */
    public CuentaBancaria(String numeroCuenta, double saldoInicial, Titular titularPrincipal) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.titulares = new ArrayList<>();
        this.titulares.add(titularPrincipal);
    }

    public void ingresar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a ingresar debe ser positiva.");
            return;
        }
        saldo += cantidad;
        System.out.println("Ingreso de " + cantidad + " €. Saldo actual: " + saldo + " €");
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser positiva.");
            return;
        }
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }
        saldo -= cantidad;
        System.out.println("Retirada de " + cantidad + " €. Saldo actual: " + saldo + " €");
    }

    public boolean añadirTitular(Titular t) {
        if (titulares.size() >= MAX_TITULARES) {
            System.out.println("No se pueden añadir más titulares (máximo " + MAX_TITULARES + ").");
            return false;
        }
        titulares.add(t);
        System.out.println("Titular añadido: " + t.getNombre());
        return true;
    }

    public boolean borrarTitular(Titular t) {
        if (titulares.size() <= 1) {
            System.out.println("La cuenta debe tener al menos un titular.");
            return false;
        }
        boolean eliminado = titulares.remove(t);
        if (eliminado) System.out.println("Titular eliminado: " + t.getNombre());
        return eliminado;
    }

    public String getNumeroCuenta()        { return numeroCuenta; }
    public double getSaldo()               { return saldo; }
    public ArrayList<Titular> getTitulares(){ return titulares; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta: ").append(numeroCuenta)
          .append(" | Saldo: ").append(saldo).append(" €")
          .append(" | Titulares: ");
        for (Titular t : titulares) sb.append(t.getNombre()).append("; ");
        return sb.toString();
    }
}
