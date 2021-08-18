package composicao.exercicio1_composicao.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import composicao.exercicio1_composicao.entidades.ContratoHora;
import composicao.exercicio1_composicao.entidades.Departamento;
import composicao.exercicio1_composicao.entidades.Funcionario;
import composicao.exercicio1_composicao.enums.NivelFuncionario;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
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
			System.out.printf("\nDigite os dados do contrato #%d\n", i+1);
			System.out.print("Data (DD/MM/AAAA): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			System.out.print("Duracao (horas): ");
			int duracaoHoras = sc.nextInt();
			
			ContratoHora contrato = new ContratoHora(dataContrato, valorHora, duracaoHoras);
			// Associando o contrato ao funcionario
			funcionario.adicionarContrato(contrato);
		}
		
		System.out.print("\nDigite o mes e ano para calcular o ganho (MM/YYYY):");
		String mesAno = sc.next();
		// Recortando a string informando o inicio e o fim da posição do recorte, e convertendo para int
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		
		System.out.println("Nome: "+funcionario.getNome());
		System.out.println("Departamento: "+funcionario.getDepartamento().getNome());
		System.out.printf("Renda de %s: %.2f", mesAno, funcionario.renda(ano, mes));
		sc.close();
	}

}
