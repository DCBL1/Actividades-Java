package Actividad2;
import Actividad2.CalculosNumericos;

public class Main {

	public static void main(String[] args) {
		CalculosNumericos raizcua = new CalculosNumericos();
		CalculosNumericos penrecta = new CalculosNumericos();
		CalculosNumericos puntomediarecta = new CalculosNumericos();
		CalculosNumericos raices = new CalculosNumericos();
		CalculosNumericos convertir = new CalculosNumericos();
		raizcua.RaizCuadrada(25);
		penrecta.PendienteRecta(1, 6, 9, 15);
		puntomediarecta.PuntoMedioRecta(2,5,9,10);
		raices.RaicesEcuacionCuadratica(2, 9, 10);
		convertir.Conversion(25, 2);
	}

}
