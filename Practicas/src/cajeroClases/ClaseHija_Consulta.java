package cajeroClases;

public class ClaseHija_Consulta extends ClasePadre_Abstracta{
	
	@Override
	public void transacciones() {
		System.out.println("---------------------------------");
		System.out.println("Su saldo es: " + getSaldo());
		System.out.println("---------------------------------");
	}

}
