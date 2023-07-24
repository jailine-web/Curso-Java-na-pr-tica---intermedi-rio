
public enum Raca {

	BRANCO('B'),
	NEGRO('N'),
	PARDO('P'),
	AMARELO('A'),
	INDIO('I');
	
	char op;
	
	private Raca(char x) {
		op = x;
	}
	
	public char getOp() {
		return op;
	}
	
}
