package listas.exercicio_lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		System.out.print("Quantos funcionarios serao registrados? ");
		int numeroFucionarios = read.nextInt();
		List<Funcionario> lista = new ArrayList<>();
		
		for(int i=0; i<numeroFucionarios; i++) {
			System.out.println("\nFuncionario #"+(i+1));
			System.out.print("ID: ");
			Integer id = read.nextInt();
			read.nextLine();
			System.out.print("Nome: ");
			String nome = read.nextLine();
			System.out.print("Salario: ");
			double salario = read.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, nome, salario);
			lista.add(funcionario);
		}
		
		System.out.print("\nDigite o ID do funcionario que tera o aumento salarial: ");
		int procuraID = read.nextInt();
		
		Funcionario func = lista.stream().filter(x -> x.getId() == procuraID).findFirst().orElse(null);
		
		if(func == null) {
			System.out.println("Esse ID não existe!");
		}else {
			System.out.print("Digite a porcentagem de aumento: ");
			double porcentagem = read.nextDouble();
			func.aumentoSalarial(porcentagem);
		}
		
		System.out.println("\nLista de funcionarios: ");
		for(Funcionario funcionario : lista) {
			System.out.println(funcionario);
		}
		
		read.close();
	}

}
