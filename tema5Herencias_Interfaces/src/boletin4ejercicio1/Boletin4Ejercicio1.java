package boletin4ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Boletin4Ejercicio1 {
	
	public static void main(String[] args) {
		/*
		 * 
		 * Implementar una clase comparadora que permita ordenar números enteros en sentido decreciente.
		 *  Crear una tabla de 20 números aleatorios comprendidos entre 1 y 100 y ordenarla en sentido decreciente.
		 */
		Random rd = new Random();
		ArrayList<Integer>ListaNumeros= new ArrayList<>();
		
		for(int i = 0; i<20; i++) {
			ListaNumeros.add(rd.nextInt(1,101));
		}
		
		System.out.println("La lista desordenada es \n" + ListaNumeros);
		
		Comparator<Integer> ordenDecreciente = (integer1, integer2) ->  -Integer.compare(integer1, integer2);
		
		ListaNumeros.sort(ordenDecreciente);
		System.out.println("La lista ordenada de forma decreciente es \n" + ListaNumeros);
		
		

		
	}

}
