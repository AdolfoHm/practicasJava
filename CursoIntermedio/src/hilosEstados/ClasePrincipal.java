package hilosEstados;

public class ClasePrincipal {
	public static void main(String args[]) {
		
		//Estado New
		Hilo_Proceso hilo1 = new Hilo_Proceso();
		Hilo_Proceso hilo2 = new Hilo_Proceso();
		
		//Estado Runnable
		hilo1.start();
		
		
		//Bloqueado o no Runnable
		try {
			hilo1.sleep(1000);
		} catch(InterruptedException e) {
			System.out.println("Error en el Hilo1 " + e);
		}
		
		//Estado Runnable
		hilo2.start();
		hilo2.stop();
		
		//Bloqueado o no Runnable
		try {
			hilo2.sleep(1000);
		} catch(InterruptedException e) {
			System.out.println("Error en el Hilo2 " + e);
		}
		
	}

}
