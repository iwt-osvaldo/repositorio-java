package teste;

public class FuncoesAltaOrdem {

	public static void main(String[] args) {
		
		Calculo soma = (int a, int b) -> a+b;
		
		Calculo subtracao = (int a, int b) -> a - b;
		
		Calculo multiplicacao = (int a, int b) -> a*b;
		
		Calculo divisao = (int a, int b) -> (double ) a / b;
		
		System.out.println(operacao(15,20,soma));
		System.out.println(operacao(15,20,subtracao));
		System.out.println(operacao(15,20,soma));
		System.out.println(operacao(15,20,subtracao));
	}

	static double operacao(int a, int b, Calculo calc) {
		
		return calc.executar(a, b);
	}
}
interface Calculo {
	public double executar(int a, int b);
}

