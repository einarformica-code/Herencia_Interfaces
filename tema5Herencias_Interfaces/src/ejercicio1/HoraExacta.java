	package ejercicio1;

	public class HoraExacta extends Hora {
		 private int segundos;

		public HoraExacta(int hora, int minutos, int segundos) {
			super(hora, minutos);
			this.segundos = segundos;
		}

		public boolean setSegundos(int segundos) {
			if(segundos>=0&&segundos<=59) {this.segundos=segundos;}
			return this.segundos==segundos;
		}

		@Override
		public String toString() {
			return  super.toString() +  ":" + segundos;
		}
		
	
		
		
		
		
		
	}
