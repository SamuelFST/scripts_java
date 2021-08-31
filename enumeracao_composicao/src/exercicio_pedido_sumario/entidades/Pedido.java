package exercicio_pedido_sumario.entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enumeracao.enums.StatusPedido;

public class Pedido {
	private Date momento;
	private StatusPedido status;
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	List<PedidoItem> pedidos = new ArrayList<>();
	
	public Pedido() {
	}

	public Pedido(Date momento, StatusPedido status) {
		this.momento = momento;
		this.status = status;
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
	
	public void adicionarItem(PedidoItem item) {
		pedidos.add(item);
	}
	
	public void removerItem(PedidoItem item) {
		pedidos.remove(item);
	}
	
	public Double total() {
		Double soma=0.0;
		for(PedidoItem PI : pedidos) {
			soma = soma + PI.subTotal();
		}
		return soma;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: "+sdf2.format(getMomento()));
		sb.append("\nStatus do pedido: "+getStatus());
		return sb.toString();
	}
	
}
