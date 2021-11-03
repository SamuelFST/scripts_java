package intro_generics.application;

import java.util.Scanner;

import intro_generics.services.PrintService;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Como a classe PrintService foi parametrizada com um tipo genérico, a instanciação da classe pode ser feita em diversos tipos de dados   
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("Quantidade de valores para ler: ");
		int quantidadeValores = sc.nextInt();
		
		for(int i=0; i<quantidadeValores; i++) {
			int valor = sc.nextInt();
			ps.adicionarValor(valor);
		}
		
		ps.print();
		Integer x = ps.primeiro();
		System.out.println("\nPrimeiro numero da lista: " +x);
		
		sc.close();
	}

}
