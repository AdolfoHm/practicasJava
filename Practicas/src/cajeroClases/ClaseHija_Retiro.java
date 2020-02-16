package cajeroClases;

public class ClaseHija_Retiro extends ClasePadre_Abstracta {
	
	@Override
	public void transacciones() {
		System.out.print("Cuanto desea retirar? ");
		retiro();
		if(retiro <= getSaldo()) {
			transacciones = getSaldo();
			setSaldo(transacciones - retiro);
			System.out.println("---------------------------------");
			System.out.println("Retiro : " + retiro);
			System.out.println("El saldo actual es : " + getSaldo());
			System.out.println("---------------------------------");
		} else {
			System.out.println("---------------------------------");
			System.out.println("Saldo insuficiente! :(");
			System.out.println("---------------------------------");
		}
		
	}

}
