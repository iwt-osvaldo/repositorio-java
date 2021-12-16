package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> filaBanco = new LinkedList<>();
		
		filaBanco.add("Maria");
		filaBanco.add("Pedro");
		filaBanco.add("João");
		filaBanco.add("Carlos");
		filaBanco.add("Ana");
		
		System.out.println(filaBanco.peek());
		
		System.out.println(filaBanco.poll());
		
		System.out.println(filaBanco.peek());
		
		Iterator<String> iterator = filaBanco.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("iterator: "+iterator.next());
		}
		
		for(String cliente : filaBanco) {
			System.out.println("for melhorado: "+cliente);
		}
	}
}
