package collections;

import java.util.TreeSet;

public class ArvoreBinaria {

	public static void main(String[] args) {
		
		TreeSet<Integer> lista4 = new TreeSet<>();

		lista4.add(1);
		lista4.add(2);
		lista4.add(3);
		lista4.add(4);
		lista4.add(5);
		lista4.add(6);
		lista4.add(7);
		lista4.add(8);
		lista4.add(9);
		lista4.add(10);
		
		System.out.println(lista4.ceiling(5));
		System.out.println(lista4.floor(5));
		System.out.println(lista4.first());
		System.out.println(lista4.last());
		System.out.println(lista4.higher(3));
		System.out.println(lista4.lower(3));
		System.out.println(lista4.pollFirst());
		System.out.println(lista4.pollLast());
		
		for(Integer elemento : lista4) {
			System.out.println(elemento);
		}
	}
}
