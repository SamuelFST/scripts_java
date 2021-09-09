package heranca.entidades;

public class Conta {
	private Integer numero;
	private String titular;
	protected Double saldo=0.0;
	
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

	public void saque(Double quantidade) {
		saldo = saldo - quantidade;
	}
	
	public void deposito(Double quantidade) {
		saldo = saldo + quantidade;
	}
}
