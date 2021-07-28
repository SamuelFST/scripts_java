package vetores.ProtutosVetor;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		double aux=0;
		
		System.out.println("Digite a quantidade de produtos a serem cadastrados: ");
		int quantidade = read.nextInt();
		Produto[] vetor = new Produto[quantidade];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println();
			read.nextLine();
			System.out.printf("Nome do produto %d: ", i+1);
			String nome = read.nextLine();
			System.out.printf("Preco do produto %d: ", i+1);
			double preco = read.nextDouble();
			vetor[i] = new Produto(nome, preco);
			aux = aux + vetor[i].getPreco();
		}
		
		double media = aux/vetor.length;
		
		System.out.printf("\nMedia dos valores: %.2f", media);
		
		read.close();

	}

}
