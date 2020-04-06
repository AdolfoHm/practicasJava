package recursividad_ejercicio;

public class Recursividad {

	public int Factorial(int parametro) {
		if (parametro > 0) {
			int valorCalculado = parametro * Factorial(parametro - 1);
			return valorCalculado;
		}
		return 1;
	}

}
