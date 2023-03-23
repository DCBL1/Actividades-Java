package Punto2;

public class Cuenta {
	float saldo;
	int nconsignacion = 0;
	int nretiros = 0;
	float tasanual;
	float comisionmesual =0;
	
	public Cuenta(float saldo, float tasanual) {
		super();
		this.saldo = saldo;
		this.tasanual = tasanual;
	}
	
	public void Consignar(float consignacion) {
		nconsignacion++; //por cada consiganacion va aumentando
		saldo+=consignacion; 
	}

	public void Retirar(float retiro) {
		if (retiro>saldo) {
			System.out.print("Error: saldo menor que retiro");
		}
		if(retiro<saldo) {
			saldo-=retiro;
			nretiros++;
		}
		
	}
	
	public void InteresMensual() {
		float TasaMensual=tasanual/12;
		float InteresMensual= saldo*TasaMensual;
		saldo+=InteresMensual;
	}
	
	public void ExtractoMensual(float comisionmensual) {
		this.comisionmesual=comisionmensual;
		saldo-=comisionmesual;
		InteresMensual();
				
	}
	
	
	
	
	public void imprimir() {
		System.out.println("El saldo es: "+saldo);
		System.out.println("El numero de consigancion es: "+nconsignacion);
		System.out.println("El numero de retiros es: "+nretiros);
		System.out.println("La tasa anual es: "+tasanual);
		System.out.println("La comision mensual es: "+comisionmesual);
	}
}



