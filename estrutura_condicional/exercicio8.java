import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		double salario, imposto;
		
		System.out.print("Digite seu salario: ");
		salario = read.nextDouble();
		
		if(salario >= 0.00 && salario <=2000.00) {
			imposto = 0;
		}
		else if(salario > 2000.00 && salario <=3000.00) {
			imposto = (salario - 2000) * 0.08;
		}
		else if(salario > 3000 && salario <= 4500.00) {
			imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
		}
		else {
			imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		}
		
		if(imposto == 0) {
			System.out.println("Voce esta isento do imposto de renda.");
		}
		else {
			System.out.printf("O valor do seu imposto de renda e de R$ %.2f", imposto);
		}
		read.close();
	}

}
