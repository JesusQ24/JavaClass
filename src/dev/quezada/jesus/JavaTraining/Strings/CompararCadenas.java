package dev.quezada.jesus.JavaTraining.Strings;

public class CompararCadenas {

	public static void main(String[] args) {
		// Comparar cadenas
		
	String cadena1 = "HOLA";	
	String cadena2 = "hola";
	
	boolean resultado =cadena2.toUpperCase().equals(cadena1.toUpperCase());
	System.out.println(resultado);
	
	resultado = cadena1.equalsIgnoreCase(cadena2);
	System.out.println(resultado);

	}

}
