import java.util.Random;
import java.util.Scanner;

public abstract class Caixa {

	public static void main(String[] args) throws Exception {
		
		String nome;
		double inicial = 0;
		
		Scanner ler = new Scanner(System.in);
		Random r = new Random();
		
		int conta = 1 + r.nextInt(9999); 		 // gera um número aleatório de 1 a 9999
		int conta_poupanca = 1 + r.nextInt(499); // gera um núemro aleatório de 1 a 499
		DataAtual data = new DataAtual();
		
		System.out.println("Cadastrando nova conta!");
		System.out.print("Nome do titular da conta: ");
		nome = ler.nextLine();
		System.out.println("Tipo de conta: ");
		System.out.println("Digite 1 para conta corrente");
		System.out.println("Digite 2 para conta poupança");
		int x = 0;
		
		try {
			x = Integer.parseInt(ler.nextLine());
		}
		catch(NumberFormatException e) {
			System.out.println("Você digitou texto, sistema encerrado!");
			System.out.println(e.getMessage());
		}
		
		if(x == 1) {
			System.out.println("Conta corrente: "+conta);
			System.out.println("Data: "+data.toString());
			System.out.print("Entre con o valor inicial: ");
			inicial = ler.nextDouble();
			
			Conta minhaConta = new Conta(nome, conta_poupanca, x);
			minhaConta.iniciar();
		}
		
		if(x == 2) {
			System.out.println("Conta poupança: "+conta_poupanca);
			System.out.println("Data: "+data.toString());
			
			inicial = 50.00;
			
			Conta minhaConta = new Conta(nome, conta_poupanca);
			minhaConta.iniciar();
		}
		
	}
}
