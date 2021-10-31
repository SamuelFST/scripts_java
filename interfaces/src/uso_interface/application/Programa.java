package uso_interface.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import uso_interface.model.entities.AluguelCarro;
import uso_interface.model.entities.Veiculo;
import uso_interface.model.services.ServicoAluguel;
import uso_interface.model.services.TaxaServicoBrasil;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Dados do aluguel");
		System.out.print("Modelo do carro: ");
		String modeloCarro = sc.nextLine();
		System.out.print("Data de retirada (dd/mm/aaaa hh:ss): ");
		Date inicio = sdf.parse(sc.nextLine());
		System.out.print("Data de retorno (dd/mm/aaaa hh:ss): ");
		Date fim = sdf.parse(sc.nextLine());
		
		AluguelCarro aluguelCarro = new AluguelCarro(inicio, fim, new Veiculo(modeloCarro));
		
		System.out.print("Digite o preco por hora: ");
		double precoPorHora = sc.nextDouble();
		System.out.print("Digite o preco por dia: ");
		double precoPorDia = sc.nextDouble();
		
		/* O construtor abaixo faz uma injeção de dependência de TaxaServicoBrasil na classe ServicoAluguel, que como parâmetro recebe
		 * um TaxaServico */
		ServicoAluguel servicoAluguel = new ServicoAluguel(precoPorDia, precoPorHora, new TaxaServicoBrasil());
		servicoAluguel.processarFatura(aluguelCarro);
		
		System.out.println("Fatura:");
		System.out.println("Pagamento base: "+String.format("%.2f", aluguelCarro.getFatura().getPagamentoBase()));
		System.out.println("Taxa: "+String.format("%.2f", aluguelCarro.getFatura().getTaxa()));
		System.out.println("Pagamento total: "+String.format("%.2f", aluguelCarro.getFatura().getPagamentoTotal()));
		
		sc.close();
	}

}
