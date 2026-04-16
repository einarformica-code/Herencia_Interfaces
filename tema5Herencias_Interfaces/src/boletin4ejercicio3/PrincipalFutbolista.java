package boletin4ejercicio3;

import java.util.ArrayList;

public class PrincipalFutbolista {
	public static void main(String[] args) {
		
		ArrayList<Futbolista> listaFutbolista = new ArrayList<>();
		
		Futbolista f1 = new Futbolista(1, "Nimo", 102, 10000);
		Futbolista f2 = new Futbolista(2, "Aldo", 43, 1);
		Futbolista f3 = new Futbolista(3, "Ferrari", 1, 20);
		Futbolista f4 = new Futbolista(4, "Pundon", 200, 10000);
		listaFutbolista.add(f1);
		listaFutbolista.add(f2);
		listaFutbolista.add(f3);
		listaFutbolista.add(f4);
		
		System.out.println("orden por defecto\n" + listaFutbolista);
		
		listaFutbolista.sort(Futbolista.edadAscendente);
		System.out.println("Orden por edad ascendente\n" + listaFutbolista);
		
		listaFutbolista.sort(Futbolista.golesDesc);
		System.out.println("Orden por goles descendente\n" + listaFutbolista);

	}
	
}
