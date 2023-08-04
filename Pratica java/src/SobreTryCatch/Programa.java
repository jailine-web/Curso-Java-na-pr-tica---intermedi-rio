package SobreTryCatch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();

		
		try {
			
			Scanner ler = new Scanner(System.in);
			System.out.print("Digite o valor 1: ");
			c1.valor1 = ler.nextInt();
			System.out.print("Digite o valor 2: ");
			c1.valor2 = ler.nextInt();
			System.out.print("Resultado: " + c1.setDiv(c1.valor1, c1.valor2));
		}
		catch(InputMismatchException e) {
			System.out.println("Erro digite apenas números!");
			//e.printStackTrace();
			
		}
	}
}
