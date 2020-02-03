package area;

public class Rectangulo {
	
	private int base, altura, area;
	
	public Rectangulo(int base, int altura) {
		
		this.base = base;
		this.altura = altura;
		
	}
	
	public  void calculoArea() {
		area = base * altura;
	}
	
	public void imprimir() {
		calculoArea();
		System.out.println("El área es: " + area);
	}

}
