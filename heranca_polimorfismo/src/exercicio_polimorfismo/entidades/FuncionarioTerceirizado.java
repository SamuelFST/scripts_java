package exercicio_polimorfismo.entidades;

public final class FuncionarioTerceirizado extends Funcionario {
	private double custoAdicional;
	
	public FuncionarioTerceirizado(){
		super();
	}

	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, double custoAdicional) {
		super(nome, horas, valorPorHora);
		this.custoAdicional = custoAdicional;
	}

	public double getCustoAdicional() {
		return custoAdicional;
	}

	public void setCustoAdicional(double custoAdicional) {
		this.custoAdicional = custoAdicional;
	}
	
	@Override
	public final Double pagamento() {
		return super.pagamento() + custoAdicional*1.10;
	}
	
}
