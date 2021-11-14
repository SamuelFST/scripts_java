package exercicio_set2.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		
		System.out.print("Quantos estudantes para o curso A? ");
		int quantidadeEstudantes = sc.nextInt();
		for(int i=1; i<=quantidadeEstudantes; i++) {
			System.out.printf("ID do estudante %d: ", i);
			int idEstudante = sc.nextInt();
			set.add(idEstudante);
		}
		
		System.out.print("Quantos estudantes para o curso B? ");
		quantidadeEstudantes = sc.nextInt();
		for(int i=1; i<=quantidadeEstudantes; i++) {
			System.out.printf("ID do estudante %d: ", i);
			int idEstudante = sc.nextInt();
			set.add(idEstudante);
		}
		
		System.out.print("Quantos estudantes para o curso C? ");
		quantidadeEstudantes = sc.nextInt();
		for(int i=1; i<=quantidadeEstudantes; i++) {
			System.out.printf("ID do estudante %d: ", i);
			int idEstudante = sc.nextInt();
			set.add(idEstudante);
		}
		
		System.out.println("Quantidade total de alunos diferentes cadastrados: " +set.size());
		
		sc.close();
	}

}
