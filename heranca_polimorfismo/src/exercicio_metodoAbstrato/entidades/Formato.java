package exercicio_metodoAbstrato.entidades;

import exercicio_metodoAbstrato.enums.Cor;

public abstract class Formato {
	private Cor cor;

	public Formato() {
	}
	
	public Formato(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	public abstract Double area();
}
