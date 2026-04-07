package ejercicio5;

public class Triangulo extends Poligono {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    // Constructor sin parámetros (lados = 1 por defecto)
    public Triangulo() {
        super(3);
        this.ladoA = 1;
        this.ladoB = 1;
        this.ladoC = 1;
    }

    // Constructor con parámetros
    public Triangulo(double ladoA, double ladoB, double ladoC) {
        super(3);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    // Getters y Setters
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    // Área mediante la Fórmula de Herón:
    // s = semiperímetro = (a + b + c) / 2
    // área = sqrt(s * (s-a) * (s-b) * (s-c))
    @Override
    public double area() {
        double s = (ladoA + ladoB + ladoC) / 2.0;
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }

    // Verifica si los lados forman un triángulo válido
    public boolean esValido() {
        return (ladoA + ladoB > ladoC) &&
               (ladoA + ladoC > ladoB) &&
               (ladoB + ladoC > ladoA);
    }

    @Override
    public String toString() {
        return "Triángulo [ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + "]";
    }
}
