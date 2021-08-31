package exercicio_pedido_sumario.entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enumeracao.enums.StatusPedido;

public class Pedido {
	private Date momento;
	private StatusPedido status;
	
	private Cliente cliente;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	List<PedidoItem> itens = new ArrayList<>();
	
	public Pedido() {
	}

	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<PedidoItem> getItens() {
		return itens;
	}

	public void adicionarItem(PedidoItem item) {
		itens.add(item);
	}
	
	public void removerItem(PedidoItem item) {
		itens.remove(item);
	}
	
	public Double total() {
		Double soma=0.0;
		for(PedidoItem PI : itens) {
			soma = soma + PI.subTotal();
		}
		return soma;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: "+sdf.format(momento));
		sb.append("\nStatus do pedido: "+status);
		sb.append("\nCliente: "+cliente);
		sb.append("\n\nItens no pedido: \n");
		for(PedidoItem item : itens) {
			sb.append(item +"\n");
		}
		sb.append("Preco total: $"+String.format("%.2f", total()));
		return sb.toString();
	}
	
}
