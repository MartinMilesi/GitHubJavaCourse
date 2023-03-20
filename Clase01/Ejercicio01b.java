package operaciones;

public class Ejercicio01b {
	
	public static void main(String[] args) {
		
		int numeroInicio = 5;
		int numeroFin = 14;
		int contador = numeroInicio;
	
		while(contador <= numeroFin) {
			
			if(contador % 2 == 0) {
				System.out.println(contador);
			}
			
			contador = contador + 1;
		}
	}
}