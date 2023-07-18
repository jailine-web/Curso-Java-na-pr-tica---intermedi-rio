
public class SobreStatic {

	static int contadorObjetos;
	
	public SobreStatic() {
		contadorObjetos ++;
	}
	
	public static void main(String[] args) {
		
		SobreStatic ss1 = new SobreStatic();
		SobreStatic ss2 = new SobreStatic();
		
		//Com o "static" a variável pertence a classe
		System.out.println("Número de classes \"SobreStatic\" criadas: " +ss1.contadorObjetos);
		System.out.println("Número de classes \"SobreStatic\" criadas: "+ss2.contadorObjetos);
	}
}
