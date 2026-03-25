package ejercicio2;

public class ProgramaEjercicio2 {
public static void main(String[] args) {
	Empleado e1 = new Empleado("Einar");
	Directivo d1 = new Directivo("Juan");
	Operario op1 = new Operario("Escohotado");
	Tecnico tec1 = new Tecnico("Antoño");
	Oficial of1 = new Oficial("JoseLuis");
	System.out.println(e1.toString()+"\n" + d1.toString()+"\n" + op1.toString()+"\n"+tec1.toString()+"\n" + of1.toString());
}
	
	
}
