package collections.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Questao1 {

	public static void main(String[] args) {
		
		List<String> LinguagemDeProgramacao = new ArrayList<>();
		
		LinguagemDeProgramacao.add("Java");
		LinguagemDeProgramacao.add("JavaScript");
		LinguagemDeProgramacao.add("Python");
		LinguagemDeProgramacao.add("PHP");
		LinguagemDeProgramacao.add("C#");
		LinguagemDeProgramacao.add("Lua");
		
		System.out.println(LinguagemDeProgramacao.size());
		LinguagemDeProgramacao.sort(null);
		LinguagemDeProgramacao.add("Ruby");
		LinguagemDeProgramacao.remove("C#");
		System.out.println(LinguagemDeProgramacao.contains("Python"));
		System.out.println(LinguagemDeProgramacao.get(4));
		System.out.println(LinguagemDeProgramacao.isEmpty());
		System.out.println(LinguagemDeProgramacao.indexOf("JavaScript"));
		System.out.println(LinguagemDeProgramacao.remove("PHP"));
		System.out.println(LinguagemDeProgramacao.toString());
		
		for (String string : LinguagemDeProgramacao) {
			System.out.println(string);
		}
	}
}