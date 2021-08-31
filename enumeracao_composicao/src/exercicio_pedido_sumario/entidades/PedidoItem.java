package exercicio_pedido_sumario.entidades;

public class PedidoItem {
	private Integer quantidade;
	private Double preco;
	
	private Produto produto;
	
	public PedidoItem() {
	}

	public PedidoItem(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
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

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Double subTotal() {
		return quantidade * preco;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(produto.getNome() +", $"+getPreco() +", Quantidade: "+getQuantidade() +", Subtotal: "+subTotal());
		return sb.toString();
	}
	
	
}
