package listas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		List li = new ArrayList<>();
		
		li.add(10);
		li.add("Curso backend");
		li.add(2.0);
		
		Iterator it = li.iterator();
		
		for(int i = 0; i<li.size(); i++) {
			System.out.print(it.next()+ " ");
		}
		System.out.println("\n");
		
		li.add(2, 1234);
		li.add(3, "listas em java");
		li.add(5, 2.5);
		
		int qtd = li.size();
		System.out.println("tamanho da lista: "+qtd);
		
		boolean t = li.contains(10);
		System.out.println(t);
		
		System.out.println(li.get(3));
		System.out.println(li.indexOf("listas em java"));
		
		System.out.println(li);
	
	}
}
