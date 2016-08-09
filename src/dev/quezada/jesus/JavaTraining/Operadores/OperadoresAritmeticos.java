package dev.quezada.jesus.JavaTraining.Operadores;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int variableX = 50, variableY = 10;
		int resultado;
		
		resultado = variableX + variableY;
		System.out.println(resultado);
		resultado = variableX - variableY;
		System.out.println(resultado);
		resultado = variableX * variableY;
		System.out.println(resultado);
		resultado = variableX / variableY;
		System.out.println(resultado);
		
		//variableX++; // Incrementa en 1
		//variableX--; // Decrece en 1
	
		//variableX += 100; // Incrementa en 100: variableX = variableX + 100
		//variableX -= 100; // Decrece en 100: variableX = variableX - 100
		//variableX *= 3; // variableX = variableX *3
		variableX /= 5; // variableX = variableX / 5
		System.out.println(variableX);
		
	}

}
