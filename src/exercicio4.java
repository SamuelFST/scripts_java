import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		int numFuncionario, horasTrab;
		double valorHora;
		
		System.out.print("Digite seu numero: ");
		numFuncionario = read.nextInt();
		System.out.print("Digite seu numero de horas trabalhadas: ");
		horasTrab = read.nextInt();
		read.nextLine();
		System.out.print("Digite seu valor por hora: ");
		valorHora = read.nextDouble();
		System.out.printf("%nNumero do funcionario: %d%n", numFuncionario);
		System.out.printf("Salario: %.2f", (horasTrab*valorHora));
		
		
	}

}