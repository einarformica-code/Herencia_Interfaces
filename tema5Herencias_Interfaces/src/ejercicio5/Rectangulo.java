public class Rectangulo extends Poligono {
    private double base;
    private double altura;

    // Constructor sin parámetros (lados = 1 por defecto)
    public Rectangulo() {
        super(4);
        this.base = 1;
        this.altura = 1;
    }

    // Constructor con parámetros
    public Rectangulo(double base, double altura) {
        super(4);
        this.base = base;
        this.altura = altura;
    }

    // Getters y Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectángulo [base=" + base + ", altura=" + altura + "]";
    }
}
