package arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int[] ar  = new int[4]; 	
		
		for(int i = 0; i< ar.length;i ++) {
			ar[i] = i+2;
		}
		
		for(int i = 0; i< ar.length;i ++) {
			System.out.print(ar[i]);
		}
		
		System.out.println();
		
		for(int i: ar) {
			System.out.print(i);
		}
		
		System.out.println();
		System.out.println("Arrays bidimensionais\n");
		
		int [][] arrays = new int [2][3];
		Scanner ler = new Scanner(System.in);
		
		for(int i =0; i<arrays.length; i++) {
			for(int j=0; j < arrays[i].length; j++) {
				
				System.out.printf("Digite um número [%d][%d]: ", i+1, j+1);
				arrays[i][j] = ler.nextInt();
				
			}
		}
		for(int i =0; i<arrays.length; i++) {
			for(int j=0; j < arrays[i].length; j++) {
				System.out.print( arrays[i][j] + " ");
				
			}
		}
		
		
	}
}
