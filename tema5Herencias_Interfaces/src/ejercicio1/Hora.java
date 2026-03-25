package ejercicio1;

public class Hora {
	protected int hora;
	protected int minutos;
	
	public Hora() {

	}

	
	public Hora(int hora, int minutos) {
		
		this.hora = hora;
		this.minutos = minutos;
	}
	
	boolean setMinutos(int minutos) {
		if(minutos <=60&& minutos>=0) {
			this.minutos=minutos;
		}
		return this.minutos==minutos;
	}
	
	
	boolean setHora(int hora) {
		if(hora<=23 && hora>=0) {this.hora=hora;}
		return this.hora == hora;
	}


	@Override
	public String toString() {
		return  hora + ":" + minutos;
	}
	
	
	
	
	
	
	
}
