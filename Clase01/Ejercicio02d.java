package operaciones;

public class Ejercicio02d {
	
	public static void main(String[] args) {
	
	float ingresosMensuales = 656987;
	int cantidadVehiculos = 3;
	int antiguedadVehiculos = 3;
	int cantidadInmuebles = 3;
	boolean enbAerLujo = true;
	
		if (ingresosMensuales >= 489083 || (cantidadVehiculos >= 3 && antiguedadVehiculos <= 5) || cantidadInmuebles >= 3 || enbAerLujo == true) {
			System.out.println("Pertenece a ingresos altos");
		}
		else {
			System.out.println("No pertenece a ingresos altos");
		}
	}
}