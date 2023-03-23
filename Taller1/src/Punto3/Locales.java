package Punto3;

public class Locales extends Inmuebles {
	String localizacion;

	public Locales(int idInmobiliario, int area, String direccion, String localizacion) {
		super(idInmobiliario, area, direccion);
		this.localizacion = localizacion;
	}
}

	class LocalesComerciales extends Locales{
		String NombreCentroComercial;
		int valorMetroCuadrado=3000000;
		public LocalesComerciales(int idInmobiliario, int area, String direccion, String localizacion,
				String nombreCentroComercial) {
			super(idInmobiliario, area, direccion, localizacion);
			NombreCentroComercial = nombreCentroComercial;
		Valor();
		}
		public void Valor() {
			int ValorInmueble=valorMetroCuadrado*area;
			System.out.println("El valor del local comercial es: "+ValorInmueble);  
		}
	}
	
	class Oficinas extends Locales{
		boolean PropiedadGobierno;
		int valorMetroCuadrado=3500000;
		
		public Oficinas(int idInmobiliario, int area, String direccion, String localizacion,
				boolean propiedadGobierno) {
			super(idInmobiliario, area, direccion, localizacion);
			PropiedadGobierno = propiedadGobierno;
			Valor();
		}
		public void Valor() {
			int ValorInmueble=valorMetroCuadrado*area;
			System.out.println("El valor de la oficina es: "+ValorInmueble);  
		}
	}
