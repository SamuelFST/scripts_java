package exercicio_pedido_sumario.entidades;

public class PedidoItem {
	private Integer quantidade;
	private Double preco;
	
	public PedidoItem() {
	}

	public PedidoItem(Integer quantidade, Double preco) {
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double subTotal() {
		return quantidade * preco;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("NOME PRODUTO" +" , "+getPreco() +", "+getQuantidade() +", "+subTotal());
		return sb.toString();
	}
	
	
}
