package SobreStatic.exemploPratico;

public class TesteProdutos {

	public static void main(String[] args) {
		
		Produtos tomate = new Produtos();
		tomate.produtos("Tomate cereja", 3.5);
		tomate.produtos("Tomate caqui", 1.8);
		
		Produtos cafe = new Produtos();
		cafe.produtos("Café com leite", 4.5);
		cafe.produtos("Café com Chantilly", 2.8);
		cafe.produtos("Café", 1.8);
		
		Produtos batata = new Produtos();
		batata.produtos("batata inglesa", 3.0);
		
		System.out.println("Quantidade de tomate: "+tomate.getContadorElementos());
		System.out.println("Quantidade de café: "+cafe.getContadorElementos());
		System.out.println("Quantidade de batata: "+batata.getContadorElementos());
		System.out.println("Quantidade total de produtos : "+Produtos.getContadorObjetos());
	}
	
}
