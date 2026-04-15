package InterfacesDia1;

public class Gato extends AnimalDomestico {
	private static final double PROBABILIDAD_OBEDIENCIA = 0.05;
	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
		// TODO Auto-generated constructor stub
	}
	
	@Override 
	public void hacerRuido() {
		System.out.println( getNombre() + "Miau!");
	}
	
	public boolean hacerCaso() {
		return Math.random() < PROBABILIDAD_OBEDIENCIA;
	}
	

}
