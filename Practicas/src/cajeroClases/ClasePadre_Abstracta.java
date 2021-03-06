package cajeroClases;

import java.util.Scanner;

public abstract class ClasePadre_Abstracta {
	
	protected int transacciones, retiro, deposito;
	private static int saldo;
	Scanner entrada = new Scanner(System.in);
	
	public void operaciones() {
		int bandera = 0;
		int seleccion = 0;

		do {
			do {
				System.out.println("Por favor seleccione una opcion: ");
				System.out.println("     1. Consulta de Saldo.");
				System.out.println("     2. Retiro de efecitvo.");
				System.out.println("     3 Deposito de efectivo.");
				System.out.println("     4. Salir.");
				System.out.println("");

				seleccion = entrada.nextInt();
				
				if (seleccion >= 1 && seleccion <= 4) {
					bandera = 1;
				} else {
					System.out.println("--------------------------------------------------");
					System.out.println("Opcion no disponible, vuelva a intentar por favor.");
					System.out.println("--------------------------------------------------");
					System.out.println("");
				}

			} while (bandera == 0);

			if (seleccion == 1) {
				ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
				mensajero.transacciones();
			} else if (seleccion == 2) {
				ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
				mensajero.transacciones();
			} else if (seleccion == 3) {
				ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
				mensajero.transacciones();
			} else if (seleccion == 4) {
				System.out.println("-------------------------");
				System.out.println(" Gracias, vuelva pronto! ");
				System.out.println("-------------------------");
				bandera = 2;
			}

		} while (bandera != 2);

	}
	
	//Metoodo para solicitar cantidad de retiro
	public void retiro() {		
		retiro = entrada.nextInt();		
	}
	
	//Metodo para solicitar deposito
	public void deposito() {
		deposito = entrada.nextInt();
	}
	
	//Metodo abstracto para polimorfismo
	public abstract void transacciones();

	
	//Metodos getter y setter
	public static int getSaldo() {
		return saldo;
	}
	
	public static void setSaldo(int saldo) {
		ClasePadre_Abstracta.saldo = saldo;
	}
	

}
