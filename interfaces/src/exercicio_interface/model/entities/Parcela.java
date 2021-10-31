package exercicio_interface.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dataVencimento;
	private Double quantia;
	
	public Parcela() {
	}

	public Parcela(Date dataVencimento, Double quantia) {
		this.dataVencimento = dataVencimento;
		this.quantia = quantia;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getQuantia() {
		return quantia;
	}

	public void setQuantia(Double quantia) {
		this.quantia = quantia;
	}

	@Override
	public String toString() {
		return "Data de vencimento: " +sdf.format(dataVencimento)+ " - Valor: " +String.format("%.2f", quantia);
	}
}
