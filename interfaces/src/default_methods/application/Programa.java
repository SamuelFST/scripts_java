package default_methods.application;

import java.util.Locale;
import java.util.Scanner;

import default_methods.service.JurosEuaService;
import default_methods.service.JurosService;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantia: ");
		double quantia = sc.nextDouble();
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		
		JurosService juros = new JurosEuaService(1.0);
		double pagamento = juros.pagamento(quantia, meses);
		
		System.out.println("Valor apos "+meses +" meses: "+String.format("%.2f", pagamento));
		
		sc.close();
	}

}
