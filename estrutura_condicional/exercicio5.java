import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		int codigo, quantidade;
		
		System.out.println("CODIGO  -  ESPECIFICACAO  -  PREÇO");
		System.out.println("  1     - Cachorro quente - R$ 4.00");
		System.out.println("  2     -    X-Salada     - R$ 4.50");
		System.out.println("  3     -    X-Bacon      - R$ 5.00");
		System.out.println("  4     - Torrada simples - R$ 2.00");
		System.out.println("  5     -  Refrigerante   - R$ 1.50");
		
		System.out.println("\nCodigo do item desejado: ");
		codigo = read.nextInt();
		System.out.println("Quantidade: ");
		quantidade = read.nextInt();
		
		if (codigo == 1) {
			System.out.printf("Valor total: R$ %.2f", (quantidade * 4.00));
		}
		else if (codigo == 2) {
			System.out.printf("Valor total: R$ %.2f", (quantidade * 4.50));
		}
		else if (codigo == 3) {
			System.out.printf("Valor total: R$ %.2f", (quantidade * 5.00));
		}
		else if (codigo == 4) {
			System.out.printf("Valor total: R$ %.2f", (quantidade * 2.00));
		}
		else {
			System.out.printf("Valor total: R$ %.2f", (quantidade * 1.50));
		}
		read.close();
	}

}
