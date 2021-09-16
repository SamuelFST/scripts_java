package exercicio2_polimorfismo.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class ProdutoUsado extends Produto {
	private Date dataFabricacao;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public final String etiquetaPreco() {
		return getNome() +" (usado) $" +getPreco() +" (Data de fabricacao: "+sdf.format(getDataFabricacao())+")";
	}
}
