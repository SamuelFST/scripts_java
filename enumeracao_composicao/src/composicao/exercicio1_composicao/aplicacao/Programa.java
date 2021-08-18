package composicao.exercicio1_composicao.aplicacao;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import composicao.exercicio1_composicao.entidades.Departamento;
import composicao.exercicio1_composicao.entidades.Funcionario;
import composicao.exercicio1_composicao.enums.NivelFuncionario;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do departamento do funcionario: ");
		String departamentoFuncionario = sc.nextLine();
		System.out.println("Digite os dados do funcionario:");
		System.out.print("Nome: ");
		String nomeFuncionario = sc.nextLine();
		System.out.print("Nivel: ");
		String nivelFuncionario = sc.nextLine();
		System.out.print("Salario base: ");
		double salarioBase = sc.nextDouble();
		Funcionario funcionario = new Funcionario(nomeFuncionario, NivelFuncionario.valueOf(nivelFuncionario), salarioBase, new Departamento(departamentoFuncionario));
		
		System.out.print("\nQuantos contratos esse funcionario tera? ");
		int quantidadeContratos = sc.nextInt();
		
		for(int i=0; i<quantidadeContratos; i++) {
			System.out.printf("\nDigite os dados do contrato #%d", i+1);
			System.out.print("Data (DD/MM/AAAA): ");
			String data = sc.nextLine();
			Calendar calendario = Calendar;
			System.out.print("Valor por hora: ");
			
			System.out.print("Duracao (horas): ");
		}
		
		sc.close();
	}

}
