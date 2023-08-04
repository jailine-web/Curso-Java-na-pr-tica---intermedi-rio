import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Conta {

	private String titular;
	private int conta, saques;
	private double saldo;
	private boolean conta_poupanca = false;
	
	DataAtual da = new DataAtual();
	
	Scanner ler = new Scanner(System.in);
	
	public Conta(String titular, int conta, double saldo) {
		this.titular = titular;
		this.conta = conta;
		this.saldo = saldo;
		this.saques = 0;
		
	}
	public Conta(String titular, int conta) {
		conta_poupanca = true;
		this.titular = titular;
		this.conta = conta;
		this.saldo = 50.00;
		this.saques = 0;
		
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getSaques() {
		return saques;
	}

	public void setSaques(int saques) {
		this.saques = saques;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isConta_poupanca() {
		return conta_poupanca;
	}

	public void setConta_poupanca(boolean conta_poupanca) {
		this.conta_poupanca = conta_poupanca;
	}

	public DataAtual getDa() {
		return da;
	}

	public void saldo() {
		System.out.println("Saldo: ");
		System.out.println("Nome: "+this.saldo);
		System.out.println("Número da conta: "+ this.conta);
		System.out.println("Saldo atual: "+this.saldo);
		System.out.println("Saques realizados: " +this.saques);
		System.out.println("data: "+ da.toString());
		System.out.println("");
	}
	
	public void sacar(double valor) throws Exception{
		
		try {
			if(saques == 3) {
				throw new Exception("Limite de saques diários atingido");
			}else {
				if(this.saldo >= valor && valor > 0 && this.saques <= 3 ) {
					this.saques = this.saques +1;
					saldo -= valor;
					System.out.println("Sacado: " +valor);
					System.out.println("Novo saldo: "+ this.saldo);
					System.out.println("data: "+da.toString());
					System.out.println("Saques: "+ this.saques);
				}
				else {
					throw new Exception("Saldo insuficiente ou o valor digitado é negativo");
				}
			}
				
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	public void depositar(double valor) throws Exception {
		
		if(valor > 0) {
			saldo += valor;
			
			System.out.println("Depositado: " +valor);
			System.out.println("Saldo: "+saldo);
			System.out.println("Data: "+ da.toString()+"\n");
			
			}
		else {
			throw new Exception("O valor digitado é inválido, digite um valor maior que 0!\n");
		}
	}
	
	public void iniciar() throws Exception {
		int op=0;
		
		while(op != 5) {
			exibirMenu();
			
			op = ler.nextInt();
			
			
			escolhaOpcao(op);
		}
	}
	
	private void escolhaOpcao(int op) throws Exception {

		double valor;
		switch(op) {
		
		case 1: 
			saldo();
			System.out.println();
			break;
		
		case 2: 
			
			try {
				System.out.print("Quanto deseja sacar? ");
				valor = ler.nextDouble();
				sacar(valor);
				
			}
			catch(InputMismatchException e) { //Exceção que ocorre quando um int recebe uma string
				System.out.println("Digite apenas números! ");
				System.out.println(e.getMessage());
				System.out.println();
			}
			
			break;
			
		case 3: 
			System.out.print("Digite o valor do deposito: ");
			valor = ler.nextDouble();
			depositar(valor);
			System.out.println();
			break;
			
		case 4: 
			try {
				gravarArquivo();
				System.out.println("Dados gravados com sucesso! \n");
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
			System.out.println();
			break;
			
		case 5: 
			System.out.println("Sistema encerrado!");
			break;
			
		default: 
			System.out.println("Opção inválida!");
			System.out.println();
			
		}
		
	}
	private void exibirMenu() {
		
		System.out.println("Escolha uma opção!");
		System.out.println("1- Saldo: ");
		System.out.println("2- Sacar: ");
		System.out.println("3- Depositar: ");
		System.out.println("4- Salvar dados: ");
		System.out.println("5- sair: ");
		System.out.print("Opção: ");
		
	}
	
	public void gravarArquivo() throws Exception{
		
		FileWriter fw = new FileWriter("C:\\Users\\Jai\\Documents\\Java na prática - intermediário\\extrato.txt"); //abre o arquivo txt para operações de saída
		
		PrintWriter arq = new PrintWriter(fw); // Permite gravar dados no arquivo
		arq.printf("Dados da conta%n%n"); // Método utilizado para a gravação dos caracteres
		arq.printf("Nome: " +titular +"%n");
		
		if(conta_poupanca == true) {
			arq.printf("Conta poupança: " +conta+ "%n");
			arq.printf("Saldo atual: " +saldo + "%n");
			arq.close();
		}
		else {
			arq.printf("Conta corrente: " +conta+ "%n");
			arq.printf("Saldo atual: " +saldo + "%n");
			arq.close();
			
		}
		
	}
	
	
	
}
