package default_methods.service;

public class JurosEuaService implements JurosService {
	private double taxaJuros;

	public JurosEuaService(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public double getTaxaJuros() {
		return taxaJuros;
	}

}
