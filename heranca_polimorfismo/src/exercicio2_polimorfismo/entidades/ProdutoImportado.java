package exercicio2_polimorfismo.entidades;

public final class ProdutoImportado extends Produto {
	private Double taxaAlfandegaria;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandegaria) {
		super(nome, preco);
		this.taxaAlfandegaria = taxaAlfandegaria;
	}

	public Double getTaxaAlfandegaria() {
		return taxaAlfandegaria;
	}

	public void setTaxaAlfandegaria(Double taxaAlfandegaria) {
		this.taxaAlfandegaria = taxaAlfandegaria;
	}
	
	@Override
	public final String etiquetaPreco() {
		//return getNome() +" $ "+getPreco();
		return getNome() +" $ " +(getPreco() + getTaxaAlfandegaria()) + " (Taxa alfandegaria: $ "+getTaxaAlfandegaria()+")";
	}
}
