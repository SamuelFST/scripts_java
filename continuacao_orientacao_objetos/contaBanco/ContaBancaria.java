package contaBanco;

import java.util.Scanner;

public class ContaBancaria {
	Scanner read = new Scanner(System.in);
	private int numero;
	private String correntista;
	private double balanco;
	
	public void depositar(double quantidade) {
			
	}
	
	public void saque(double quantidade) {
		
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getCorrentista() {
		return correntista;
	}
	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}
	
	public double getBalanco() {
		return balanco;
	}
	public void setBalanco(double balanco) {
		this.balanco = balanco;
	}
	
	
}
