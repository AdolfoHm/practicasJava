package hilosClases;

public class Proceso2 implements Runnable {

	@Override
	public void run() {
		for (int j = 0; j <= 5; j++) {
			System.out.println("Proceso 2: " + j);
		}
	}

}
