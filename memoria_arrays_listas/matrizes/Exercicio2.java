package matrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/* Fazer um programa para ler dois números inteiros M e N, e depois ler
		uma matriz de M linhas por N colunas contendo números inteiros,
		podendo haver repetições. Em seguida, ler um número inteiro X que
		pertence à matriz. Para cada ocorrência de X, mostrar os valores à
		esquerda, acima, à direita e abaixo de X, quando houver, conforme
		exemplo. */
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de linhas da matriz: ");
		int M = read.nextInt();
		System.out.print("Digite a quantidade de colunas da matriz: ");
		int N = read.nextInt();
		
		int[][] matriz = new int[M][N];
		
		for(int i=0; i<M; i++) {
			System.out.printf("\nDigite os %d valores para a linha %d: ", N, i+1);
			for(int j=0; j<N; j++) {
				matriz[i][j] = read.nextInt();
			}
		}
		
		System.out.print("\nDigite um numero que está na matriz: ");
		int buscaMatriz = read.nextInt();
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(matriz[i][j] == buscaMatriz) {
					System.out.printf("\nNumero %d encontrado na posicao [%d] [%d]", buscaMatriz, i+1, j+1);
					if(j > 0) {
						System.out.printf("\nEsquerda: %d", matriz[i][j-1]);
					}
					
					if(i > 0) {
						System.out.printf("\nAcima: %d", matriz[i-1][j]);
					}
					
					if(j < matriz[i].length-1) {
						System.out.printf("\nDireita: %d", matriz[i][j+1]);
					}
		
					if(i < matriz.length-1) {
						System.out.printf("\nAbaixo: %d\n", matriz[i+1][j]);
					}
				}
			}
		}
		
		read.close();
	}

}
