package uso_interface.model.services;

import uso_interface.model.entities.AluguelCarro;
import uso_interface.model.entities.Fatura;

public class ServicoAluguel {
	
	private Double precoPorDia;
	private Double precoPorHora;
	private TaxaServico taxaServico;
	
	public ServicoAluguel(Double precoPorDia, Double precoPorHora, TaxaServico taxaServico) {
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.taxaServico = taxaServico;
	}
	
	public void processarFatura(AluguelCarro aluguelCarro) {
		long t1 = aluguelCarro.getInicio().getTime();
		long t2 = aluguelCarro.getFim().getTime();
		// Convertendo milisegundos para horas
		double horas = (double)(t2 - t1) /1000 /60 /60;
		
		double pagamentoBase;
		if(horas <= 12) {
			// O Math.ceil arredonda um valor para cima
			pagamentoBase = Math.ceil(horas)*precoPorHora;
		}
		else {
			pagamentoBase = Math.ceil(horas/24)*precoPorDia;
		}
		
		double taxa = taxaServico.taxa(pagamentoBase);
		aluguelCarro.setFatura(new Fatura(pagamentoBase, taxa));
	}
}
