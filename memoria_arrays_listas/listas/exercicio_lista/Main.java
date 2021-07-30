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
		List<String> lista = new ArrayList<>();
		Funcionario funcionario;
		
		for(int i=0; i<numeroFucionarios; i++) {
			System.out.println("Funcionario #"+i+1);
			System.out.print("ID: ");
			int id = read.nextInt();
			read.nextLine();
			System.out.print("Nome: ");
			String nome = read.nextLine();
			System.out.print("Salario: ");
			double salario = read.nextDouble();
			
			lista.add(id, nome);
			funcionario = new Funcionario(id, nome, salario);
		}
		
		read.close();
	}

}
