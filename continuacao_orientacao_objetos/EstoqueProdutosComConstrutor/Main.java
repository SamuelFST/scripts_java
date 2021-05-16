package EstoqueProdutosComConstrutor;

import java.util.*;

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
			System.out.println("\nEscolha uma opcao: ");
			System.out.println("1 - Adicionar mais unidades do produto");
			System.out.println("2 - Remover produtos do estoque");
			System.out.println("3 - Consultar o total no estoque");
			System.out.println("4 - Sair do programa");
			opcao = read.nextInt();
			
			if(opcao == 1) {
				dados.adicionarProdutos(dados.quantidade);
			}
			
			if(opcao == 2) {
				dados.removerProdutos(dados.quantidade);
				}
		
			if(opcao == 3) {
				System.out.printf("Dados atualizados do produto: %s, $%.2f, %d unidades, total: $%.2f\n", dados.nome, dados.preco, dados.quantidade, dados.valorTotalEmEstoque());
			}
			
		}while(opcao != 4);
		read.close();

	}

}
