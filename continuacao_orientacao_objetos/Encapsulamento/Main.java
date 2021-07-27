package Encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		int opcao;
		Produto dados;
		
		System.out.print("Entre com os dados do produto: ");
		System.out.print("\nNome: ");
		String nome = read.nextLine();
		System.out.print("Preco: ");
		double preco = read.nextDouble();
		read.nextLine();
		System.out.print("Quantidade no estoque: ");
		int quantidade = read.nextInt();
		dados = new Produto(nome, preco, quantidade);
		
		do {
			System.out.println("\n\nEscolha uma opcao: ");
			System.out.println("1 - Adicionar mais unidades do produto");
			System.out.println("2 - Remover produtos do estoque");
			System.out.println("3 - Consultar o total no estoque");
			System.out.println("4 - Sair do programa");
			opcao = read.nextInt();
			
			if(opcao == 1) {
				System.out.print("Digite a quantidade de produtos a serem adicionados ao estoque: ");
				quantidade = read.nextInt();
				dados.adicionarProdutos(quantidade);
			}
			
			if(opcao == 2) {
				System.out.print("Digite a quantidade de produtos a serem removidos do estoque: ");
				quantidade = read.nextInt();
				dados.removerProdutos(quantidade);
			}
		
			if(opcao == 3) {
				System.out.print(dados);
			}
			
		}while(opcao != 4);
		read.close();

	}

}
