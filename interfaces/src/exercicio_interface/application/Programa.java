package exercicio_interface.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercicio_interface.model.entities.Contrato;
import exercicio_interface.model.entities.Parcela;
import exercicio_interface.model.services.Paypal;
import exercicio_interface.model.services.ServicoContrato;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Dados do contrato: ");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/mm/aaaa): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor do contrato: ");
		double valor = sc.nextDouble();
		Contrato contrato = new Contrato(numero, data, valor);
		
		System.out.print("Numero de parcelas: ");
		int quantidadeParcelas = sc.nextInt();
		ServicoContrato servicoContrato = new ServicoContrato(new Paypal());
		servicoContrato.processarContrato(contrato, quantidadeParcelas);
		
		System.out.println("Parcelas: ");
		for(Parcela parcela : contrato.getListaParcelas()) {
			System.out.println(parcela);
		}
		
		sc.close();
	}

}
