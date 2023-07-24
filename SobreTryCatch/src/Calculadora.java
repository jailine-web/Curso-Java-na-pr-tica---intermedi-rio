
public class Calculadora {

	private double soma, sub, mult, div;
	int valor1, valor2;
	
	public double setSoma(double valor1, double valor2) {
		soma = valor1 + valor2;
		return soma;
	}
	public double setSub(double valor1, double valor2) {
		sub = valor1 - valor2;
		return sub;
	}
	public double setMult(double valor1, double valor2) {
		mult = valor1 * valor2;
		return mult;
	}
	
	public double setDiv(int valor1, int valor2) {
		
		try {
					
				this.div = valor1/ valor2;
			}
		
		catch (Exception e) {
			System.out.println("Exceção divisão por zero");
			System.out.println(e.getMessage());
		}
		
		return div;
	}
	
}
