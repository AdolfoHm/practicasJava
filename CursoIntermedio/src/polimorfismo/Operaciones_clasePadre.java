package polimorfismo;

import java.util.Scanner;

public abstract class Operaciones_clasePadre {
	
	protected int valor1, valor2, resultado;
	Scanner entrada = new Scanner(System.in);
	
	public void pedirDatos() {		
		System.out.print("Dame el primer valor:");
		valor1 = entrada.nextInt();
		System.out.print("Dame el segundo valor:");
		valor2 = entrada.nextInt();
	}
	
	public abstract void operaciones();
	
	public void mostrarResultado() {
		System.out.println(resultado);
		System.out.println("");
	}

}
