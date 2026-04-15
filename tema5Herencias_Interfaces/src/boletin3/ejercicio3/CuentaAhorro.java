package boletin3.ejercicio3;

public class CuentaAhorro extends CuentaBancaria {

    private double cuotaMantenimiento;
    private double interesAnual; // en tanto por ciento, ej: 2.5 = 2.5%

    public CuentaAhorro(String numeroCuenta, double saldoInicial, Titular titular,
                        double cuotaMantenimiento, double interesAnual) {
        super(numeroCuenta, saldoInicial, titular);
        this.cuotaMantenimiento = cuotaMantenimiento;
        this.interesAnual = interesAnual;
    }

    /** Devuelve el saldo resultante si se aplica el interés anual */
    public double calcularSaldoConInteres() {
        return saldo + (saldo * interesAnual / 100.0);
    }

    /** Aplica la cuota de mantenimiento descontándola del saldo */
    public void aplicarCuotaMantenimiento() {
        if (saldo < cuotaMantenimiento) {
            System.out.println("Saldo insuficiente para aplicar la cuota de mantenimiento.");
        } else {
            saldo -= cuotaMantenimiento;
            System.out.println("Cuota de mantenimiento aplicada: -" + cuotaMantenimiento +
                               " €. Saldo actual: " + saldo + " €");
        }
    }

    public double getCuotaMantenimiento() { return cuotaMantenimiento; }
    public double getInteresAnual()        { return interesAnual; }
    public void setCuotaMantenimiento(double c){ this.cuotaMantenimiento = c; }
    public void setInteresAnual(double i)      { this.interesAnual = i; }

    @Override
    public String toString() {
        return "AHORRO | " + super.toString() +
               " | Cuota mant.: " + cuotaMantenimiento +
               " € | Interés: " + interesAnual + "%";
    }
}
