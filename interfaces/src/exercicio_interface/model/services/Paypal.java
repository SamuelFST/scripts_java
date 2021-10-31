package exercicio_interface.model.services;

public class Paypal implements Pagamento {
	private static final double porcentagemTaxa = 0.02;
	private static final double jurosMensais = 0.01;
	
	@Override
	public Double taxaPagamento(Double quantia) {
		return quantia * porcentagemTaxa;
	}
	
	@Override
	public Double juros(Double quantia, Integer meses) {
		return quantia * jurosMensais * meses;
	}
}
