package operaciones;

public class Ejercicio01d {
	
	public static void main(String[] args) {
		
		int numeroInicio = 5;
		int numeroFin = 14;
		int contador = numeroInicio;
	
		for( contador = numeroFin ; contador >= numeroInicio ; contador -- ) {
			
			if(contador % 2 == 0) {
				System.out.println(contador);
			}
		}
	}
}