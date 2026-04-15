package boletin3.ejercicio3;

public class MainCuentas {

    public static void main(String[] args) {
        Titular t1 = new Titular("12345678A", "Ana", "García López", "600111222");
        Titular t2 = new Titular("87654321B", "Luis", "Martínez Ruiz", "611333444");

        // Cuenta de ahorro
        CuentaAhorro ahorro = new CuentaAhorro("ES001", 1000.0, t1, 15.0, 2.5);
        System.out.println("=== CUENTA DE AHORRO ===");
        System.out.println(ahorro);
        ahorro.ingresar(500);
        ahorro.aplicarCuotaMantenimiento();
        System.out.println("Saldo con interés: " + ahorro.calcularSaldoConInteres() + " €");
        ahorro.añadirTitular(t2);
        System.out.println(ahorro);

        System.out.println();

        // Cuenta corriente
        Titular t3 = new Titular("11111111C", "Carlos", "Pérez Díaz", "622555666");
        CuentaCorriente corriente = new CuentaCorriente("ES002", 2000.0, t3, 0.5);
        System.out.println("=== CUENTA CORRIENTE ===");
        System.out.println(corriente);
        corriente.realizarTransaccion(new Transaccion(1, 4, 2025, "Nómina", 1200.0));
        corriente.realizarTransaccion(new Transaccion(5, 4, 2025, "Recibo luz", -80.0));
        corriente.listarTransacciones();
        System.out.println(corriente);
    }
}
