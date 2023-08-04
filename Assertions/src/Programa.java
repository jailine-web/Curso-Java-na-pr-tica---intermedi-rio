
public class Programa {

	public static void main(String[] args) {
		idade (30);
		
	}
	
	private static void idade(int idade) {
		
		assert idade > 0 : "Erro, número negativo";
		System.out.println(idade);
		
	}
}
