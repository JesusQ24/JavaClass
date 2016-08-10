package dev.quezada.jesus.JavaTraining.Strings;

public class MetodosFormato2 {

	public static void main(String[] args) {
		// Metodos de formato Parte 2
		
	String mensaje = "";
	String curso = "Java";
	
	float valor = 10.872040f;
	
	mensaje = String.format("El total de %d artículos es %.2f %s", 3, valor, "MX");
	
	System.out.println(mensaje);
	System.out.printf("El total de %d artículos es %.2f %s", 3, valor, "MX");	

	}

}
