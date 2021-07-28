import java.util.Locale;
import java.util.Scanner;

public class MediaAltura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
	
		System.out.print("Quantidade de alturas para serem feitas a media: ");
		int quantidade = read.nextInt();
		double[] vetor = new double[quantidade];
		double aux=0;
		
		for(int i=0; i<quantidade; i++) {
			System.out.println();
			System.out.printf("Digite a altura %d: ", i+1);
			vetor[i] = read.nextDouble();
			aux = aux + vetor[i];
		}
		
		double media = aux/quantidade;
		
		System.out.printf("\nMedia das alturas = %.2f", media);
		
		read.close();
	}

}
