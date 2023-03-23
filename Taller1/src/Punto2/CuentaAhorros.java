package Punto2;

class CuentaAhorros extends Cuenta {
	
	boolean CuentaActiva = false;
	
	
	public CuentaAhorros(float saldo, float tasanual) {
		super(saldo, tasanual);
		if(saldo <10000) {
			CuentaActiva= false;
		}
		else {
			CuentaActiva = true;
		}
		
	}
	
	@Override //Me permite Redefinir el metodo
	public void Consignar(float consignacion)
	{
		if(CuentaActiva) {
			super.Consignar(consignacion);
		}
		else
		{
			System.out.println("Cuenta inactiva no se puede consignar");
		}
	}
	
	@Override //Me permite Redefinir el metodo
	public void Retirar(float retiro) {
		if(CuentaActiva)
		{
			super.Retirar(retiro);
		}
		else {
			System.out.println("Cuenta inactiva no se puede retirar");
		}
	}
	
	@Override
	public void ExtractoMensual(float comisionMensual)
	{
		int eComisionMensual=0;
		if(nretiros>=4)
		{
			 eComisionMensual = (nretiros-4)*1000;
		}
		else
		{
			 eComisionMensual = 0;
		}
		super.ExtractoMensual(comisionmesual);
		super.comisionmesual=comisionmesual+eComisionMensual;
		if(saldo < 10000)
		{
			CuentaActiva = false;
		}
		else
		{
			CuentaActiva = true;
		}
		if(CuentaActiva==true)
		{
			System.out.println("la cuenta esta activa");
		}
		if(CuentaActiva==false)
		{
			System.out.println("la cuenta esta inactiva");
		}
	}

	@Override
	public void imprimir()
	{
		int ntransacciones =0;
		ntransacciones=nconsignacion+nretiros;
		System.out.println("El saldo es: "+saldo);
		System.out.println("La comision mensual es: "+super.comisionmesual);
		System.out.println("El numero de tansacciones es: "+ntransacciones);
	}
}
	
