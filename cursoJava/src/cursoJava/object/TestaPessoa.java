package cursoJava.object;

import java.time.LocalDate;

public class TestaPessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Paulo",LocalDate.of(1988, 10, 5));
		
		System.out.println(p1.getNome());
		System.out.println(p1.getDataNascimento());
	}

}
