package com.senati.eti;

public class Caso12 {

	public static void main(String[] args) {
		String frase="ESCUELA DE TECNOLOGÍA E INFORMÁTICA";
		String pl1= frase.substring(0, 7); //ESCUELA
		String pl2= frase.substring(11, 21); //TECNOLOGÍA
		String pl3= frase.substring(24, 35); //INFORMÁTICA
		
		System.out.println("\n====== Resultados ======");
		System.out.println("Palabra 1: "+ pl1);
		System.out.println("Palabra 2: "+ pl2);
		System.out.println("Palabra 3: "+ pl3);
		
	
		

	}

}
