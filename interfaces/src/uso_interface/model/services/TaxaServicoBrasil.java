package uso_interface.model.services;

public class TaxaServicoBrasil implements TaxaServico {
	
	public double taxa(double quantia) {
		if(quantia <= 100.0) {
			return quantia * 0.2;
		}
		else {
			return quantia * 0.15;
		}
	}
}
