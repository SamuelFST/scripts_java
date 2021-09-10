package exercicio_polimorfismo.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio_polimorfismo.entidades.Funcionario;
import exercicio_polimorfismo.entidades.FuncionarioTerceirizado;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> listaFuncionarios = new ArrayList<>();
		
		System.out.print("Digite o numero de empregados: ");
		int numeroEmpregados = sc.nextInt();
		
		for(int i=0; i<numeroEmpregados; i++) {
			System.out.println("Dados do funcionario #"+(i+1));
			System.out.print("Funcionario terceirizado (s/n)? ");
			char opcaoFuncionario = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas de trabalho: ");
			int horasTrabalho = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			
			if(opcaoFuncionario == 's') {
				System.out.print("Custo adicional: ");
				double custoAdicional = sc.nextDouble();
				Funcionario funcionarioTerceirizado = new FuncionarioTerceirizado(nome, horasTrabalho, valorPorHora, custoAdicional);
				listaFuncionarios.add(funcionarioTerceirizado);
			}
			else {
				Funcionario funcionario = new Funcionario(nome, horasTrabalho, valorPorHora);
				listaFuncionarios.add(funcionario);
			}
		}
		
		System.out.println("\nPAGAMENTOS:");
		
		for(Funcionario funcionario : listaFuncionarios) {
				System.out.println(funcionario.getNome() +" - $"+funcionario.pagamento());
		}
		
		sc.close();
	}

}
