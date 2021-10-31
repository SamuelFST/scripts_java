package exercicio_interface.model.services;

public interface Pagamento {
	Double taxaPagamento(Double quantia);
	Double juros(Double quantia, Integer meses);
}
