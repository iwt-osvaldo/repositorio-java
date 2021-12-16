package teste;

public class Animal{
	
	private int codigo;
	private String nome;
	
	Animal(int codigo,String nome){
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return codigo+" - "+nome;
	}
	
	public int compareTo(Animal a) {
		return this.codigo - a.codigo;
	}
}
