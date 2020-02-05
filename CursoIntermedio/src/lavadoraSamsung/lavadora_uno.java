package lavadoraSamsung;

import encapsulamiento.Llfunciones;
import java.util.Scanner;

public class lavadora_uno {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("La ropa es blanca o de color?");
		System.out.println("1: Ropa Blanca / 2: Ropa de Color");
		int tipoDeRopa = entrada.nextInt();
		
		System.out.println("Cuantos kilos de ropa?");
		int kilos = entrada.nextInt();
		
		Llfunciones mensajero = new Llfunciones(kilos, tipoDeRopa);
		mensajero.setTipoDeRopa(2);
		System.out.println("El tipo de Ropa es: " + mensajero.getTipoDeRopa());
		mensajero.CicloFinalizado();

	}

}
