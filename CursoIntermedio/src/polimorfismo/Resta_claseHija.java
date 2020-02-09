package polimorfismo;

public class Resta_claseHija extends Operaciones_clasePadre{

	@Override
	public void operaciones() {
		resultado = valor1 - valor2;
	}
}
