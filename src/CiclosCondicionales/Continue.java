package CiclosCondicionales;

public class Continue {

	public static void main(String[] args) {
		// Break: para terminar una secuencia o un ciclo
		// Continue: para que el ciclo salte a la siguiente iteración

		for (int x = 0; x < 10; x++) {
			
			if (x == 5) {
				continue;
			}
			
			System.out.println(x);
		}
		
	}

}
