package operaciones;

public class Ejercicio01a {

	public static void main(String[] args) {
		
		int numeroInicio = 5;
		int numeroFin = 14;
		
		int contador = numeroInicio;
		
		while(contador <= numeroFin) {
			
			System.out.println(contador);
			contador = contador + 1;
		}
	}
}