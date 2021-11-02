package interface_comparable.entities;

// a interface Comparable é usada para poder comparar os objetos de uma classe e é preciso implementar o método compareTo
public class Funcionario implements Comparable<Funcionario> {
	private String nome;
	private Double salario;
	
	public Funcionario(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public int compareTo(Funcionario outro) {
		return nome.compareTo(outro.getNome());
	}
}
