
public class SobreStatic {

	int contadorObjetos;
	
	public SobreStatic() {
		contadorObjetos ++;
	}
	
	public static void main(String[] args) {
		
		SobreStatic ss1 = new SobreStatic();
		SobreStatic ss2 = new SobreStatic();
		
		//A variável pertence aos objetos ss1 e ss2
		System.out.println("Número de classes criadas: "+ss1.contadorObjetos);
		System.out.println("Número de classes criadas: "+ss2.contadorObjetos);
	}
}
