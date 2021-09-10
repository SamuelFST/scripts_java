package sobreposicao.entidades;

// O final � usado quando a classe n�o pode ser herdada por outras classes
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
	
	// O Override serve para informar que essa � uma fun��o j� usada em outra classe, e que est� sendo sobrescrita
	// E o final no m�todo serve para n�o deixar esse m�todo ser sobrescrito
	// Conv�m colocar final nos m�todos j� sobrescritos para evitar inconsist�ncias
	@Override
	public final void saque(Double quantidade) {
		saldo = saldo - quantidade;
	}
}
