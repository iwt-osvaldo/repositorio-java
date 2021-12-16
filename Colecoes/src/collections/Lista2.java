package collections;

import java.util.HashSet;
import java.util.Set;

public class Lista2 {

	public static void main(String[] args) {
		
		Set<String> lista2 = new HashSet<>();
		
		lista2.add("primeiro");
		lista2.add("segundo");
		lista2.add("segundo");
		lista2.add("terceiro");
		lista2.add("quarto");
		lista2.add("quinto");
		lista2.add("sexto");
		lista2.add("setimo");
		lista2.add("oitavo");
				
		System.out.println(lista2);
		
		System.out.println(lista2.contains("nono"));
		System.out.println(lista2.isEmpty());
		System.out.println(lista2.size());
		lista2.clear();
		System.out.println(lista2.isEmpty());
	}
}
