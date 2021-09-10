package sobreposicao.entidades;

// O final é usado quando a classe não pode ser herdada por outras classes
public final class ContaPoupanca extends Conta {
	
	private Double taxaJuros;
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaJuros) {
		super(numero, titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public void atualizarSaldo() {
		saldo = saldo + saldo*taxaJuros;
	}
	
	// O Override serve para informar que essa é uma função já usada em outra classe, e que está sendo sobrescrita
	// E o final no método serve para não deixar esse método ser sobrescrito
	// Convém colocar final nos métodos já sobrescritos para evitar inconsistências
	@Override
	public final void saque(Double quantidade) {
		saldo = saldo - quantidade;
	}
}
