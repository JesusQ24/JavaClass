package CiclosCondicionales;

public class CondicionesAnidadas {

	public static void main(String[] args) {
		// Condiciones anidadas
		// El promedio mínimo para aprobar es 7
		// Si el promedio es diez = Muchas felicidades
		// Si el promedio es aprobatorio pero menor a diez = Felicidades
		// Si el promedio no es aprobatorio = Es necesario repasar bloques
		
		int promedio = 8;
		
		if (promedio >= 7) {
			
			// >El promedio es aprobatorio
			
			if (promedio == 10) {
				System.out.println("Muchas felicidades");
			} else {
				System.out.println("Felicidades");
			}
		
		} else {
			// El promedio NO es aprobatorio
			System.out.println("Es necesario repasar bloques");
		}
		
	}

}
