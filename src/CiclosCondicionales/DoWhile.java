package CiclosCondicionales;

public class DoWhile {

	public static void main(String[] args) {
		// Do while
		int contador = 10;
		
		// While -> 1.- Se evalúa 2.- Se ejecuta el bloque
		// Do While -> 1.- Se ejecuta el bloque 2.- Se ejecuta el bloque
		
		while (contador < 10) {
			System.out.println(contador);
			contador++;
		}
		
		do {
			System.out.println(contador);
			contador++;
		} while(contador < 10);

	}

}
