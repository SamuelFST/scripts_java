package CotacaoDolar;

public class ConversorMoeda {
	public static double precoDolar, valor;
	
	public static double calculoValor() {
		return precoDolar * (valor + valor*0.06);
	}
}
