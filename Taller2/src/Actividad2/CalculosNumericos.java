package Actividad2;

public class CalculosNumericos {
	
	public static void RaizCuadrada(double valor) {
		if(valor>=0) {
			double resultado = Math.sqrt(valor);
			System.out.println("el numero ingresado es: "+valor);
			System.out.println("la raiz cuadrada es: "+resultado);
		}
		if(valor<=0)
			throw new ArithmeticException("El valor debe ser positivo");
	}
	
	public static void PendienteRecta(double x1,double x2, double y1, double y2) {
		double m = (y2-y1)/(x2-x1);
		System.out.println("La pendiente de la recta es: "+m);
	}
	public static void PuntoMedioRecta(double x1,double x2, double y1, double y2) {
		double m = ((x1+x2/2)+(y1+y2/2));
		System.out.println("El punto medio de la recta es: "+m);
	}
	
	public static void RaicesEcuacionCuadratica(double a, double b, double c) {
		double x1=(-b+(Math.sqrt(Math.pow(b, 2)-4*a*c)))/2*a;
		double x2=(-b-(Math.sqrt(Math.pow(b, 2)-4*a*c)))/2*a;
		
		System.out.println("El resultado de la ecuacion en x1 es: "+x1);
		System.out.println("El resultado de la ecuacion en x2 es: "+x2);
	}
	
	public static void Conversion(int numero1, int numero2) {
		int residuo;
		int cociente;
		residuo=numero1/numero2;
		cociente = numero1 % numero2;
		while( cociente>=numero2)
		{
			residuo=residuo/numero2;
		    cociente = residuo%numero2;
		}
		System.out.println("el residuo es: "+residuo);
		System.out.println("el cociente es: "+ cociente);
	}
	
}
