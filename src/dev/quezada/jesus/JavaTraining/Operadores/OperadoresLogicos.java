package dev.quezada.jesus.JavaTraining.Operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		
		// Operadores l�gicos
		
		boolean resultado;
		
		resultado = 5 >= 5 && true && 10 > 9;
		System.out.println(resultado);
		
		resultado = false || false || false || true;
		System.out.println(resultado);
		
		resultado = (5 >= (2*3) || true) && (true && 10 > 5);
		System.out.println(resultado);
		
		System.out.println(!true);
		
	}

}
