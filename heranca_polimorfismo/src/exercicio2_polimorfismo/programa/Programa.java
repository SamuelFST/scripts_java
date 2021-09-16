package exercicio2_polimorfismo.programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio2_polimorfismo.entidades.Produto;
import exercicio2_polimorfismo.entidades.ProdutoImportado;
import exercicio2_polimorfismo.entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> listaProdutos = new ArrayList<>();
		
		System.out.print("Digite o numero de produtos: ");
		int numeroProdutos = sc.nextInt();
		
		for(int i=0; i<numeroProdutos; i++) {
			System.out.println("\nDados do produto #"+(i+1));
			System.out.print("O produto é comum, usado ou importado (c/u/i)? ");
			char tipoProduto = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome do produto: ");
			String nome = sc.nextLine();
			System.out.print("Preco: ");
			double preco = sc.nextDouble();
			
			if(tipoProduto == 'i') {
				System.out.print("Valor da taxa alfandegaria: ");
				double taxaAlfandegaria = sc.nextDouble();
				Produto produtoImportado = new ProdutoImportado(nome, preco, taxaAlfandegaria);
				listaProdutos.add(produtoImportado);
			}
			else if(tipoProduto == 'u') {
				System.out.print("Data da fabricacao: ");
				Date dataFabricacao = sdf.parse(sc.next());
				Produto produtoUsado = new ProdutoUsado(nome, preco, dataFabricacao);
				listaProdutos.add(produtoUsado);
			}
			else {
				Produto produto = new Produto(nome, preco);
				listaProdutos.add(produto);
			}
		}
		
		System.out.println("\nEtiquetas de preco: ");
		for(Produto produtos : listaProdutos) {
			System.out.println(produtos.etiquetaPreco());
		}
			
		sc.close();
	}

}
