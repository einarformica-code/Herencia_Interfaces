package InterfacesDia1;

public class Perro  extends AnimalDomestico{
	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
		// TODO Auto-generated constructor stub
	}

	private static final double PROBABILIDAD_OBEDIENCIA = 0.05;
	
	
	@Override 
	public void hacerRuido() {
		System.out.println( getNombre() + "GUAO!");
	}
	
	public boolean hacerCaso() {
		return Math.random() < PROBABILIDAD_OBEDIENCIA;
	}
	
	public void sacaPaseo() {
		System.out.println(getNombre() + " está dando paseo..");
	}

}
