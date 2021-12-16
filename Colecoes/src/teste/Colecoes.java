package teste;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Colecoes {

	public static void main(String[] args) {
		Queue<String> banco = new LinkedList<>();
		
		banco.add("Luiza");
		
		Set<String> lista = new HashSet<>();
		
		LinkedHashSet<String> lista2 = new LinkedHashSet<>();
		
		TreeSet<String> lista3 = new TreeSet<>();
		
		Iterator<String> iterator = banco.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
