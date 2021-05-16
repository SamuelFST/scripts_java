package EstoqueProdutosComConstrutor;

import java.util.Scanner;

public class Produto {
	Scanner read = new Scanner(System.in);
	public String nome;
	public double preco;
	public int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double valorTotalEmEstoque() {
		return quantidade*preco;
	}
	
	public void adicionarProdutos(int a) {
		System.out.print("Digite a quantidade de produtos a serem adicionados ao estoque: ");
		int aux = read.nextInt();
		quantidade = quantidade + aux;
	}
	
	public void removerProdutos(int a) {
		System.out.print("Digite a quantidade de produtos a serem removidos do estoque: ");
		int aux = read.nextInt();
		quantidade = quantidade - aux;
	}
}
