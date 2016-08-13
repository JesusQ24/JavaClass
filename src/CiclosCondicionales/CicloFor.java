package CiclosCondicionales;

public class CicloFor {

	public static void main(String[] args) {
		//Ciclo for

		// for (Inicialización; Condición; Iteración) {}
		int numero = 9, x = 1; 
		
		for (; x < 11 ;) {
			
			int resultado = numero * x;
			String mensaje = numero + " * " + x + " = " + resultado;
			
			System.out.println(mensaje);
			x++;
			
		}
	
	}
		
}
