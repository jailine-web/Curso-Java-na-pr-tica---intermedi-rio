import java.text.DateFormat;
import java.util.Date;

public class DataAtual {

	Date data = new Date();						  //Data sem formatação
	DateFormat df = DateFormat.getDateInstance(); // Método que define o formato da data
	String dataFormatada = df.format(data);		  // Retorna uma string no formato especificado pelo método getDateInstance
	
	public String toString() {
		return dataFormatada;
	}
}
