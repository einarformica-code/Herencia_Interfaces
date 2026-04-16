package boletin4ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;

public class PrincipalSocio {

	public static void main(String[] args) {
		ArrayList<Socio> ListaSocios=new ArrayList<>(); 
		 Socio socio1 = new Socio(112, "Ramon Carvajal", 14);
		 Socio socio2 = new Socio(123, "Aldon barbatal", 33);
		 Socio socio3 = new Socio(114, "Antonio Gijon", 22);
		 Socio socio4 = new Socio(115, "Jesus", 100);
		 Socio socio5 = new Socio(116, "Jesus", 80);
		 ListaSocios.add(socio1);
		 ListaSocios.add(socio2);
		 ListaSocios.add(socio3);
		 ListaSocios.add(socio4);
		 
		 System.out.println("Lista por defecto: " + ListaSocios+"\n\n\n");
		 //Ordenar alfabeticamente
		 
		 ListaSocios.sort(Socio.orderAlphabet);
		 System.out.println("Lista por ordenada por nombre alfabeticamente es: " + ListaSocios+"\n\n\n");
		 
		 
		 //Ordenar por edad
		
		 
		 ListaSocios.sort(Socio.orderAge);
		 
		 System.out.println("La lista ordenada por edad, de mayor a menor, es:" + ListaSocios);
		 
		 
		 
	}
}
