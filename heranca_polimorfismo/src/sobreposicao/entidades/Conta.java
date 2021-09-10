package sobreposicao.entidades;

public class Conta {
	private Integer numero;
	private String titular;
	protected Double saldo;
	
	public Conta() {
	}
	
	public Conta(Integer numero, String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	// Na conta comum, o saque tem uma taxa de 5.0, já na conta poupança o saque não terá taxas
	public void saque(Double quantidade) {
		saldo = saldo - quantidade - 5.0;
	}
	
	public void deposito(Double quantidade) {
		saldo = saldo + quantidade;
	}
}
