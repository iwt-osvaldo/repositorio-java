package teste;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambdas {
	
	public static void main(String[] args) {
	
		String nome = "Alucard";
		
		StringBuilder reverso = new StringBuilder();
		
		reverso.append(nome);
		reverso.reverse();
		
		String nome2 = reverso.toString();
		
		List<String> listaNome = Arrays.asList(nome.split(""));
		
		Collections.reverse(listaNome);
		
		System.out.println(listaNome.stream().reduce((acumulador,letra)->acumulador+letra).orElse(""));
		
		String lista = "Sara,Jessica,Peter,Maria,Carlos";
		
		List<String> listaStrings = Arrays.asList(lista.split(","));
		
		listaStrings.stream().sorted().forEach(System.out::println);
		
		
		
	}
	
			
			

}
