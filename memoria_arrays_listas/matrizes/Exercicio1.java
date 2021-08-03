package matrizes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/* Fazer um programa para ler um número inteiro N e uma matriz de
		ordem N contendo números inteiros. Em seguida, mostrar a diagonal
		principal e a quantidade de valores negativos da matriz.*/
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite o valor de N: ");
		int n = read.nextInt();
		
		int[][] matriz = new int[n][n];
		int numerosNegativos = 0;
		
		for(int i=0; i<n; i++) {
			System.out.printf("Digite os %d valores para a linha %d: ", n, i+1);
			for(int j=0; j<n; j++) {
				matriz[i][j] = read.nextInt();
				if(matriz[i][j] < 0) {
					numerosNegativos++;
				}
			}
		}
		
		System.out.print("\nDiagonal principal: ");
		for(int i=0; i<n; i++) {
			System.out.print(matriz[i][i]+" ");
		}
		 
		System.out.printf("\nNumeros negativos = %d", numerosNegativos);
		
		read.close();
	}

}
