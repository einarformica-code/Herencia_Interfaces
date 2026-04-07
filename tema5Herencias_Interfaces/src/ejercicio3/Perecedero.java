package ejercicio3;

public class Perecedero extends Producto{
	
	private int diasACaducar;
	
	public Perecedero() {
	
	}
	
	public Perecedero(int diasACaducar) {
		super();
		this.diasACaducar = diasACaducar;
	}

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}
	
	@Override
	public double calcular(int cantidadProductos) {
		double descuento = 1;
		
		switch(diasACaducar) {
		case 1: descuento = 0.25;
		break;
		case 2: descuento = 1.0/3;
		break;
		case 3: descuento =1.0 /2;
		}
		return super.calcular(cantidadProductos) * descuento;
	
	}
	
	
	
	
	
	

}
