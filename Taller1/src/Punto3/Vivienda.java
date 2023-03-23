package Punto3;

public class Vivienda extends Inmuebles {
	int numeroHabitaciones;
	int numeroBaños;
	
	public Vivienda(int idInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
		super(idInmobiliario, area, direccion);
		this.numeroHabitaciones = numeroHabitaciones;
		this.numeroBaños = numeroBaños;
	}
}

	class Casa extends Vivienda{
		int numeroPisos;

		public Casa(int idInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños,
				int numeroPisos) {
			super(idInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
			this.numeroPisos = numeroPisos;
		}
	}
	
	class CasaRural extends Casa{
		int distancia;
		int altitud;
		int valorMetroCuadrado=1500000;
		public CasaRural(int idInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños,
				int numeroPisos, int distancia, int altitud) {
			super(idInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
			this.distancia = distancia;
			this.altitud = altitud;
		Valor();
		}
		public void Valor() {
			int ValorInmueble=valorMetroCuadrado*area;
			System.out.println("El valor de la casa rural es: "+ValorInmueble);  
		}
	}
	class CasaUrbana extends Casa{

		public CasaUrbana(int idInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños,
				int numeroPisos) {
			super(idInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
	}
}
	class ConjuntoCerrado extends CasaUrbana{
		int ValorAdministracion;
		boolean AreasComunes;
		int valorMetroCuadrado=2500000;
		public ConjuntoCerrado(int idInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños,
				int numeroPisos, int valorAdministracion, boolean areasComunes) {
			super(idInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
			ValorAdministracion = valorAdministracion;
			AreasComunes = areasComunes;
			Valor();
		}
		public void Valor() {
			int ValorInmueble=valorMetroCuadrado*area;
			System.out.println("El valor de la casa en conjunto cerrado es: "+ValorInmueble);  
		}
}
	class CasaIndependiente extends Casa{
		int valorMetroCuadrado=3000000;
		public CasaIndependiente(int idInmobiliario, int area, String direccion, int numeroHabitaciones,
				int numeroBaños, int numeroPisos) {
			super(idInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
			Valor();
		}
		public void Valor() {
			int ValorInmueble=valorMetroCuadrado*area;
			System.out.println("El valor de la casa independiente es: "+ValorInmueble);  
		}
	}
	
	class Apartamentos extends Vivienda{
	
		public Apartamentos(int idInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
			super(idInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
		}
	}
	class Apartaestudio extends Apartamentos{
		int valorMetroCuadrado=1500000;
		public Apartaestudio(int idInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
			super(idInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
			numeroHabitaciones=1;
			Valor();
		}
		public void Valor() {
			int ValorInmueble=valorMetroCuadrado*area;
			System.out.println("El valor del Apartaestudio es: "+ValorInmueble);  
		}
	}
	
	class ApartamentoFamiliar extends Apartamentos{
		int administracion;
		int valorMetroCuadrado=2000000;
		public ApartamentoFamiliar(int idInmobiliario, int area, String direccion, int numeroHabitaciones,
				int numeroBaños, int administracion) {
			super(idInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
			this.administracion = administracion;
			Valor();
	 }
		public void Valor() {
			int ValorInmueble=valorMetroCuadrado*area;
			System.out.println("El valor del Apartamento Familiar es: "+ValorInmueble);  
		}
	}


	
	
	