package collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<String> sala = new ArrayList<>();
		
		sala.add("pedro");
		sala.add("iana");
		sala.add("zuleide");
		sala.add("alana");
		
		//sala.sort(null);
		//sala.clear();
		sala.add(1, "Milena");
		sala.remove(3);
		System.out.println(sala.get(2));
		System.out.println(sala.contains("pedro"));
		System.out.println(sala.size());
		System.out.println(sala);
		System.out.println(sala.indexOf("zuleide"));
	}
}
