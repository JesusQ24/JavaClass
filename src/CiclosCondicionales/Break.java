package CiclosCondicionales;

public class Break {

	public static void main(String[] args) {
		// Break: para terminar una secuencia o un ciclo
		// Continue: para que el ciclo salte a la siguiente iteración
		
		for(int i = 0; i < 3; i++) {
			System.out.print("Siguiuente " + i + ": ");
			
			for(int j = 0; j<100; j++) {
				
				if (j == 10) {
					break;
				}
		
			System.out.print(j + " ");
			}
		
			System.out.println();
		}
		System.out.println("Ciclo completado !");
		
	}
	
}
