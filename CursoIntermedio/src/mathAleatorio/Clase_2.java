package mathAleatorio;

import java.util.Random;

public class Clase_2 {
	public static void main(String args[]) {
		
		int aleatorio = 0;
		
		Random r = new Random();
		aleatorio = (int) (r.nextDouble() * 100);
		
		System.out.println(aleatorio);
		
	}

}
