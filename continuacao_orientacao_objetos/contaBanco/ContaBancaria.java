package contaBanco;

public class ContaBancaria {
	
	private int numero;
	private String titular;
	private double balanco;
	
	public ContaBancaria(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public ContaBancaria(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		deposito(depositoInicial);
	}

	public void deposito(double quantidade) {
		balanco = balanco + quantidade;	
	}
	
	public void saque(double quantidade) {
		balanco = balanco - (quantidade + 5.0);
	}
	 
	public int getNumero() {
		return numero;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setCorrentista(String titular) {
		this.titular = titular;
	}
	
	public double getBalanco() {
		return balanco;
	}
	
	public String toString() {
		return "Conta "
			+numero
			+", titular: "
			+titular
			+", balanco: $ "
			+String.format("%.2f", balanco);
	}
}
