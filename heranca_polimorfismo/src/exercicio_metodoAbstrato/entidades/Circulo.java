package exercicio_metodoAbstrato.entidades;

import exercicio_metodoAbstrato.enums.Cor;

public final class Circulo extends Formato {
	private Double raio;

	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}
	
	@Override
	public final Double area() {
		return Math.PI * raio * raio;
	}
}
