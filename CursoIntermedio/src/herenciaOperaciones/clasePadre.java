package herenciaOperaciones;

import java.util.Scanner;

public class clasePadre {

	protected int valor1, valor2, resultado;
	Scanner entrada = new Scanner(System.in);

	// Metodo que solicita dos datos
	public void pedirDatos() {

		System.out.println("Dame el primer valor: ");
		valor1 = entrada.nextInt();

		System.out.println("Dame el segundo valor: ");
		valor2 = entrada.nextInt();
	}

	// Metodo que muestra resultado
	public void mostrarResultado() {

		System.out.println(resultado);
	}
}
