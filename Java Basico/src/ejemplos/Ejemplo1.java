package ejemplos;

public class Ejemplo1 {
	public static void main(String[] args) {
		System.out.print("Hola Mundo");
		System.out.print("\n");
		
		String nombre = "Stephen";
		String apellido = "King";
		
		String nombreCompleto = nombre + " " + apellido;
		System.out.print(nombreCompleto);
		System.out.print("\n");
		
		int numero1 = 5;
		int numero2 = 3;
		
		int resultado = numero1 + numero2;
		System.out.print(resultado);
		System.out.print("\n");
		
		resultado = numero1 - numero2;
		System.out.print(resultado);
		System.out.print("\n");
		
		resultado = numero1 * numero2;
		System.out.print(resultado);
		System.out.print("\n");
		
		resultado = numero1 / numero2;
		System.out.print(resultado);
		System.out.print("\n");
		
		System.out.print(numero1++);
		System.out.print("\n");
		System.out.print(numero1);
		System.out.print("\n");
		
		System.out.print(numero2--);
		System.out.print("\n");
		System.out.print(numero2);
		System.out.print("\n");
		
		
		System.out.print("prueba " + 5 + 4);
		System.out.print("\n");
		System.out.print("prueba " + (5 + 4));
	}

}
