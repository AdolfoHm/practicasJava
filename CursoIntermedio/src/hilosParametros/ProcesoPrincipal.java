package hilosParametros;

public class ProcesoPrincipal {
	public static void main(String args[]) {
		
		Proceso hilo1 = new Proceso(" Hilo1");
		Proceso hilo2 = new Proceso(" Hilo2");
		Proceso hilo3 = new Proceso(" Hilo3");
		
		hilo1.valorCondicion(5);
		hilo2.valorCondicion(10);
		hilo3.valorCondicion(5);
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
	}

}
