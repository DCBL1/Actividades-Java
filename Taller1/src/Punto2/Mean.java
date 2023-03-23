package Punto2;

import Punto2.Cuenta;

public class Mean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c1=new Cuenta(1000,500);
		CuentaAhorros ca = new CuentaAhorros(19000,50);
		ca.Consignar(5000);
		//c1.Consignar(15000);
		ca.Retirar(500);
		ca.Retirar(500);
		ca.Retirar(500);
		ca.Retirar(500);
		//c1.ExtractoMensual(100);
				
		//c1.imprimir();
		ca.imprimir();
		
		
		
		
	}

}
