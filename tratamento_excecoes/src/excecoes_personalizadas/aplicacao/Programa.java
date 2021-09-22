package excecoes_personalizadas.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import excecoes_personalizadas.model.entidades.Reserva;
import excecoes_personalizadas.model.exceptions.DomainException;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Numero do quarto: ");
			int numeroDoQuarto = sc.nextInt();
			System.out.print("Data do check-in (dd/mm/aaaa): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Data do check-out (dd/mm/aaaa): ");
			Date checkOut = sdf.parse(sc.next());
		
			Reserva reserva = new Reserva(numeroDoQuarto, checkIn, checkOut);
			System.out.println(reserva);
		
			System.out.println();
			System.out.println("Digite os dados para atualizar a reserva: ");
			System.out.print("Data do check-in (dd/mm/aaaa): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data do check-out (dd/mm/aaaa): ");
			checkOut = sdf.parse(sc.next());
		
			reserva.atualizarDatas(checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
		}
		catch(ParseException e) {
			System.out.println("Formato da data invalido");
		}
		// Essa exceção foi tratada na classe Reserva
		catch(DomainException e) {
			// O e.getMessage() pega a mensagem escrita no tratamento feito na classe Reserva
			System.out.println("Erro na reserva: "+e.getMessage());
		}
		// O catch abaixo pega qualquer exceção do tipo RuntimeException que ocorra na execução e retorna a frase genérica que está dentro
		catch(RuntimeException e) {
			System.out.println("Erro inesperado");
		}
		
		sc.close();
	}

}
