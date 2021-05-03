
import java.util.Scanner;
import java.util.Locale;

public class exercicio5 {
	
	public static void main(String[] args) {	
	Locale.setDefault(Locale.US);
	Scanner read = new Scanner(System.in); 
	
	int codigo1, numeroPecas1, codigo2, numeroPecas2;
	double precoUni1, precoUni2, total;
	
	System.out.println("Codigo, numero de pecas e valor unitario da primeira peca em ordem: ");
	codigo1 = read.nextInt();
	numeroPecas1 = read.nextInt();
	precoUni1 = read.nextDouble();
	System.out.println("Codigo, numero de pecas e valor unitario da segunda peca em ordem: ");
	codigo2 = read.nextInt();
	numeroPecas2 = read.nextInt();
	precoUni2 = read.nextDouble();
	
	total = ((numeroPecas1 * precoUni1) + (numeroPecas2 * precoUni2));
	System.out.printf("VALOR A PAGAR: R$ %.2f", total);
	read.close();
	}
}