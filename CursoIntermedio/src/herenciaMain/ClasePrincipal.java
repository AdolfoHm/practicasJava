package herenciaMain;

import herenciaOperaciones.claseHija_Suma;
import herenciaOperaciones.claseHija_Resta;

public class ClasePrincipal {
	public static void main(String args[]) {
		
		claseHija_Suma mensajeroSuma = new claseHija_Suma();		
		mensajeroSuma.pedirDatos();
		mensajeroSuma.sumar();
		System.out.print("El resultado es: ");
		mensajeroSuma.mostrarResultado();
		
		
		claseHija_Resta mensajeroResta  = new claseHija_Resta();
		mensajeroResta.pedirDatos();
		mensajeroResta.restar();
		System.out.print("El resultado de tu resta es: ");
		mensajeroResta.mostrarResultado();
		
	}
	

}
