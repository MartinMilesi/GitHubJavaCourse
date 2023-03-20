package operaciones;

public class Ejercicio01c {
	
	public static void main(String[] args) {
		
		int numeroInicio = 5;
		int numeroFin = 14;
		int contador = numeroInicio;
		boolean mostrarPares = false;
	
		while(contador <= numeroFin) {
			
			if(mostrarPares == true) {
				if(contador % 2 == 0) {
					System.out.println(contador);
				}
			}
			
			else {
				if (contador % 2 != 0) {
					System.out.println(contador);	
				}
			}
			
			contador = contador + 1;	
		}	
	}
}