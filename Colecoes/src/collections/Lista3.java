package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Lista3 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lista3 = new LinkedHashSet<>();
		
		lista3.add("primeiro");
		lista3.add("segundo");
		lista3.add("segundo");
		lista3.add("terceiro");
		lista3.add("quarto");
		lista3.add("quinto");
		lista3.add("sexto");
		lista3.add("setimo");
		lista3.add("oitavo");
		
		Iterator<String> iterator =  lista3.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
