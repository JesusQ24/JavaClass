package dev.quezada.jesus.JavaTraining.Strings;

public class Metodos {

	public static void main(String[] args) {
		// Metodos para cadenas

		String mensaje = "Hola, soy un String";
	
		int cantidad = mensaje.length();
		boolean contiene = mensaje.contains("Hola");
		
		boolean comienzaCon = mensaje.startsWith("H");
		boolean terminaCon = mensaje.endsWith("String");
		
		System.out.println(cantidad);
		System.out.println(contiene);
		
		System.out.println(comienzaCon);
		System.out.println(terminaCon);
		
		String nuevoString = mensaje.concat(", estamos en el curso de Java");
		System.out.println(nuevoString);
		
	}

}
