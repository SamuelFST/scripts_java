package exercicio_interface.model.services;

import java.util.Calendar;
import java.util.Date;

import exercicio_interface.model.entities.Contrato;
import exercicio_interface.model.entities.Parcela;

public class ServicoContrato {
	
	private Pagamento pagamento;
	
	public ServicoContrato(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public void processarContrato(Contrato contrato, int meses) {
		double pagamentoBase = contrato.getValorTotal() / meses;
		for(int i=1; i<=meses; i++) {
			Date data = adicionarMeses(contrato.getData(), i);
			double pagamentoAtualizado = pagamentoBase + pagamento.juros(pagamentoBase, i);
			double pagamentoTotal = pagamentoAtualizado + pagamento.taxaPagamento(pagamentoAtualizado);
			contrato.adicionarParcela(new Parcela(data, pagamentoTotal));
		}
	}
	
	private Date adicionarMeses(Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
