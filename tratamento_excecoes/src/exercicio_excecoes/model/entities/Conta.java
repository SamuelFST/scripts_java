package exercicio_excecoes.model.entities;

import exercicio_excecoes.model.exceptions.DomainException;

public class Conta {
	Integer numero;
	String titular;
	Double saldo;
	Double limiteSaque;
	
	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
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

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void deposito(Double quantidade) {
		saldo = saldo + quantidade;
	}
	
	public void saque(Double quantidade) {
		if(quantidade > limiteSaque) {
			throw new DomainException("O valor ultrapassa o limite de saque");
		}
		else if(quantidade > saldo) {
			throw new DomainException("Saldo insuficiente");
		}
		else {
			saldo = saldo - quantidade;
			System.out.println("Novo saldo: "+String.format("%.2f", saldo));
		}
	}
}
