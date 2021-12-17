package cursoJava.object;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
	
	private String nome;
	private LocalDate dataNascimento;

	public Pessoa(String nome, LocalDate dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		
		 DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return dt.format(dataNascimento);
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
