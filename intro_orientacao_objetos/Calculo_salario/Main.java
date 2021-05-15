package Calculo_salario;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		Funcionario funcionario;
		funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = read.nextLine();
		System.out.print("Salario bruto: ");
		funcionario.salarioBruto = read.nextDouble();
		System.out.println("Valor do imposto: ");
		funcionario.imposto = read.nextDouble();
		
		System.out.printf("\nFuncionario: %s, $%.2f", funcionario.nome, funcionario.salarioLiquido());
		System.out.println("\nQual porcentagem deseja aumentar para o salario? ");
		double aumento = read.nextDouble();
		System.out.printf("\nDados atualizados: %s, $%.2f", funcionario.nome, funcionario.aumentoSalario(aumento));
		read.close();
	}

}
