package cajeroClases;

public class ClaseHija_Deposito extends ClasePadre_Abstracta {
	
	@Override
	public void transacciones() {
		System.out.println("Cuanto desea depositar?: ");
		deposito();
		
		transacciones = getSaldo();
		setSaldo(transacciones + deposito);
		System.out.println("---------------------------------");
		System.out.println("Depositaste :" + deposito);
		System.out.println("Su saldo actual es : " + getSaldo());
		System.out.println("---------------------------------");
	}

}
