package vetores.ExercicioVetor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Quartos[] quarto = new Quartos[10];
		
		System.out.println("Quantos quartos serao alugados? ");
		int quantidade = read.nextInt();
		
		for(int i=0; i<quantidade; i++) {
			System.out.println();
			read.nextLine();
			System.out.printf("Aluguel #%d: ", i+1);
			System.out.print("\nNome: ");
			String nome = read.nextLine();
			System.out.print("Email: ");
			String email = read.nextLine();
			System.out.print("Quarto: ");
			int numeroQuarto = read.nextInt();
			quarto[numeroQuarto] = new Quartos(nome, email);
		}
		
		System.out.println("Quartos ocupados: ");
		
		for(int i=0; i<10; i++) {
			if(quarto[i] != null) {
				System.out.printf("\nQuarto %d: %s, %s", i, quarto[i].getNome(), quarto[i].getEmail());
			}
		}
		
		read.close();
	}

}
