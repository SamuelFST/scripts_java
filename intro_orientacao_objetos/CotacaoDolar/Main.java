package CotacaoDolar;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		System.out.print("Qual e o valor da cotacao do dolar? ");
		ConversorMoeda.precoDolar = read.nextDouble();
		System.out.print("Quantos dolares serao comprados? ");
		ConversorMoeda.valor = read.nextDouble();
		System.out.printf("\nValor a ser pago em reais: %.2f", ConversorMoeda.calculoValor());
		
		read.close();
	}

}
