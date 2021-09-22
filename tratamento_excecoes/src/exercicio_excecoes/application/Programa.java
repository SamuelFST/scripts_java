package exercicio_excecoes.application;

import java.util.Locale;
import java.util.Scanner;

import exercicio_excecoes.model.entities.Conta;
import exercicio_excecoes.model.exceptions.DomainException;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite os dados da conta");
			System.out.print("Numero: ");
			int numero = sc.nextInt();
			System.out.print("Titular: ");
			String titular = sc.nextLine();
			sc.nextLine();
			System.out.print("Saldo inicial: ");
			double saldo = sc.nextDouble();
			System.out.print("Limite de saque: ");
			double limiteSaque = sc.nextDouble();
			Conta conta = new Conta(numero, titular, saldo, limiteSaque);

			System.out.println();
			System.out.print("Digite o valor para saque: ");
			double valorSaque = sc.nextDouble();
			conta.saque(valorSaque);
		} 
		catch (DomainException e) {
			System.out.println("Erro de saque: "+e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro inesperado");
		}
		sc.close();
	}

}
