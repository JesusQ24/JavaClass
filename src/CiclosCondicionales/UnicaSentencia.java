package CiclosCondicionales;

public class UnicaSentencia {

	public static void main(String[] args) {
		// En ciclos, condicionales o else de una Única sentencia
		// se pueden omitir las llaves "{}"
		
		boolean valor = true;
		
		if (valor) // si valor es verdadero ?
			System.out.println("Es Verdadero !");
		 else 
			System.out.println("Es Falso !");
		
		for (int x = 0; x < 10; x++) 
			System.out.println("Mensaje !");
			
		
	}

}
