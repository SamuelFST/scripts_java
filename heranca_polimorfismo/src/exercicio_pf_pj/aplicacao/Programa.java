package exercicio_pf_pj.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio_pf_pj.entidades.Pessoa;
import exercicio_pf_pj.entidades.PessoaFisica;
import exercicio_pf_pj.entidades.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> listaContribuintes = new ArrayList<>();
		
		System.out.print("Digite a quantidade de contribuintes: ");
		int quantidadeContribuintes = sc.nextInt();
		
		for(int i=1; i<=quantidadeContribuintes; i++) {
			System.out.println("\nDados do contribuinte #"+i);
			sc.nextLine();
			System.out.print("Pessoa fisica ou juridica (PF/PJ)? ");
			String opcao = sc.nextLine().toUpperCase();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			Double rendaAnual = sc.nextDouble();
			if(opcao.equals("PF")) {
				System.out.print("Gastos com saude no ano: ");
				Double gastoSaude = sc.nextDouble();
				Pessoa pessoaFisica = new PessoaFisica(nome, rendaAnual, gastoSaude);
				listaContribuintes.add(pessoaFisica);
			}
			else if(opcao.equals("PJ")) {
				System.out.print("Numero de funcionarios: ");
				int numeroFuncionarios = sc.nextInt();
				Pessoa pessoaJuridica = new PessoaJuridica(nome, rendaAnual, numeroFuncionarios);
				listaContribuintes.add(pessoaJuridica);
			}
		}
		
		System.out.println("\nImpostos pagos: ");
		
		Double impostoTotal = 0.0;
		for(Pessoa pessoa : listaContribuintes) {
			System.out.println(pessoa.getNome()+": $ " +String.format("%.2f", pessoa.determinarImposto()));
			impostoTotal = impostoTotal + pessoa.determinarImposto();
		}
		
		System.out.println("Total dos impostos: " +String.format("%.2f", impostoTotal));
		
		sc.close();
	}

}
