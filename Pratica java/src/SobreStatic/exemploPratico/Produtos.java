package SobreStatic.exemploPratico;

public class Produtos {

	private String nome;
	private double peso;
	private int contadorElementos;
	private static int contadorObjetos;
	
	
	public void produtos(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
		contadorElementos ++;
		contadorObjetos ++; // É permitido acessar uma variável estática em um método não estático
	}

	public int getContadorElementos() {
		return contadorElementos;
	}

	public static int getContadorObjetos() {
		return contadorObjetos; //Não é possível acessar uma variável não estática em um método estático
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
}
