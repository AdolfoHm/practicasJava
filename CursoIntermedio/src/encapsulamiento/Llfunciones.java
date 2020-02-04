/*
 * Clase para las funciones lógicas de una lavadora
 */
package encapsulamiento;

public class Llfunciones {
	
	private int kilos = 0, llenadoCompleto = 0, tipoRopa = 0, lavadoCompleto = 0, secadoCompleto = 0;
	
	public Llfunciones(int kilos, int tipoRopa) {
		
		this.kilos = kilos;
		this.tipoRopa = tipoRopa;
	}
	
	private void Llenado() {
		if(kilos <= 12) {
			llenadoCompleto = 1;
			System.out.println("Llenando...");
			System.out.println("Llenado Completo.");
		} else {
			System.out.println("La carga de ropa es muy pesada, reduce la carga");
		}
	}
	
	/**
	 * Este metodo sirve para lavar.
	 **/
	
	private void Lavado() {
		Llenado();
		
		if(llenadoCompleto == 1) {
			if(tipoRopa == 1) {
				System.out.println("Ropa Blanca / Lavado Suave");
				System.out.println("Lavando...");
				lavadoCompleto = 1;
			} else if(tipoRopa == 2) {
				System.out.println("Ropa de Color / Lavado Intenso");
				System.out.println("Lavando...");
				lavadoCompleto = 1;
			} else {
				System.out.println("El tipo de ropa no esta disponible");
				System.out.println("Se lavará como ropa de color / Lavado Intenso");
				System.out.println("Lavando...");
				lavadoCompleto = 1;
			}
			
		} else {
			System.out.println("No se llenó la lavadora");
		}
	}
	
	
	private void Secado(){
		Lavado();
		
		if(lavadoCompleto ==1) {
			System.out.println("Secando...");
			secadoCompleto = 1;
		}
	}
	
	
	public void CicloFinalizado() {
		Secado();
		
		if(secadoCompleto == 1) {
			System.out.println("Tu ropa esta lista!");
		}
	}
	
}
