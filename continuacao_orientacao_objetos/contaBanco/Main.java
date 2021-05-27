package contaBanco;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		int numero;
		String correntista;
		double balanco;
		
		System.out.println("Digite o numero da conta: ");
		numero = read.nextInt();
		read.nextLine();
		System.out.println("Digite o numero do corretista: ");
		correntista = read.nextLine();
		
		read.close();
	}

}
