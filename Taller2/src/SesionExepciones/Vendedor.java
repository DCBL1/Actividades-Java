package SesionExepciones;

public class Vendedor {
	String nombre;
	String apellido;
	int edad;
	public Vendedor(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		//this.edad = edad;
	}
	void imprimir() {
		System.out.println("El nombre del vendedor es: "+nombre);
		System.out.println("Los apellidos del vendedor son: "+apellido);
		System.out.println("La edad del vendedor es: "+edad);
	}
	
	void verificarEdad(int edad) {
		if(edad<18) {
			throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años");
		}
		if(edad>=0 && edad <120)
		{
			this.edad=edad;
		}
		else {
			throw new IllegalArgumentException("La edad no debe de ser negativa ni superar los 120 años");
		}
	}
}
