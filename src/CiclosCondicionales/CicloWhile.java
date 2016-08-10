package CiclosCondicionales;

public class CicloWhile {

	public static void main(String[] args) {
		// Ciclo While
		int contador = 0;
		int numero = 123;

		// 100/10 = 10
		// 250/10 = 25
		
		while( numero > 0) {
			numero = numero /10;
			contador++;
		}
		System.out.println("El número posee " + contador + " dígitos");
	}

}
