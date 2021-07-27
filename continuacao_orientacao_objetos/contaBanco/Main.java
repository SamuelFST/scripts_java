package contaBanco;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		ContaBancaria conta;
		
		System.out.print("Digite o numero da conta: ");
		int numero = read.nextInt();
		System.out.print("Digite o titular da conta: ");
		read.nextLine();
		String titular = read.nextLine();
		
		System.out.print("A conta tera um deposito inicial? (s/n)");
		char opcao = read.next().charAt(0);
		
		if(opcao == 's') {
			System.out.print("Digite o valor do deposito inicial: ");
			double depositoInicial = read.nextDouble();
			conta = new ContaBancaria(numero, titular, depositoInicial);
		}
		else {
			conta = new ContaBancaria(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite um valor para deposito: ");
		double valorDeposito = read.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados atualizados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Digite um valor para saque: ");
		double valorSaque = read.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Dados atualizados da conta: ");
		System.out.println(conta);
		
		read.close();
	}

}
