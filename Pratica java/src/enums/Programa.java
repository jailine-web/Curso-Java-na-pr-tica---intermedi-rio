package enums;
public class Programa {

	public static void main(String[] args) {
		
		final String raca = "Branco";
		System.out.println(raca);
		System.out.println();
		
		
		Raca r = Raca.BRANCO;
		Raca r2 = Raca.AMARELO;
		System.out.println(r);
		
		System.out.println();
		
		char z = r2.getOp();
		System.out.println(z);
		
	}
	
	
}
