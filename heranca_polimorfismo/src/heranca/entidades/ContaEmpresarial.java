package heranca.entidades;

public class ContaEmpresarial extends Conta {
	
	private Double limiteEmprestimo;
	
	public ContaEmpresarial() {
	}
	
	public ContaEmpresarial(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo(Double quantidade) {
		if(quantidade <= limiteEmprestimo) {
			saldo = saldo + quantidade - 10.0; // o emprestimo tem uma taxa de 10.0
		}
	}
}
