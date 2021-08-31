package exercicio_pedido_sumario.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import enumeracao.enums.StatusPedido;
import exercicio_pedido_sumario.entidades.Cliente;
import exercicio_pedido_sumario.entidades.Pedido;
import exercicio_pedido_sumario.entidades.PedidoItem;
import exercicio_pedido_sumario.entidades.Produto;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		PedidoItem pedidoItem = null;
		
		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento: ");
		Date dataNascimento = sdf.parse(sc.next());
		Cliente cliente = new Cliente(nome, email, dataNascimento);
		
		Date momento = new Date();
		sdf2.format(momento);
		
		System.out.println("Entre com os dados do pedido:");
		System.out.print("Status: ");
		StatusPedido sp = StatusPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(momento, sp);
		
		System.out.print("Quantos itens tera esse pedido? ");
		int quantidade = sc.nextInt();
		
		for(int i=1; i<=quantidade; i++) {
			System.out.println("Entre com os dados do item #"+i);
			System.out.print("Nome do produto: ");
			String nomeProduto = sc.next();
			System.out.print("Preco do produto: ");
			Double precoProduto = sc.nextDouble();
			System.out.println("Quantidade: ");
			Integer quantidadeProduto = sc.nextInt();
			
			pedidoItem = new PedidoItem(quantidadeProduto, precoProduto);
			pedido.adicionarItem(pedidoItem);
			Produto produto = new Produto(nomeProduto, precoProduto);
		}
		
		System.out.println("Sumario do pedido: ");
		System.out.println(pedido);
		System.out.println(cliente);
		System.out.println(pedidoItem);
		// Falta implementar o nome do produto e o preço total na saída
		sc.close();
	}

}
