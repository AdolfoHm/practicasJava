package polimorfismo;

public class ClasePrincipal {
	public static void main(String args[]) {
		
		Operaciones_clasePadre mensajeroSuma = new Suma_claseHija();
		mensajeroSuma.pedirDatos();
		mensajeroSuma.operaciones();
		mensajeroSuma.mostrarResultado();
		
		Operaciones_clasePadre mensajeroResta = new Resta_claseHija();
		mensajeroResta.pedirDatos();
		mensajeroResta.operaciones();
		mensajeroResta.mostrarResultado();
		
	}

}
