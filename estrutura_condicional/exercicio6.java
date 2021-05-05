import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		double valor;
		
		System.out.print("Digite um valor qualquer entre 0 e 100: ");
		valor = read.nextDouble();
		
		if(valor >=0 && valor <=25) {
			System.out.println("Este valor esta no intervalo [0,25]");
		}
		else if(valor >25 && valor <=50) {
			System.out.println("Este valor esta no intervalo (25,50]");
		}
		else if(valor >50 && valor <=75) {
			System.out.println("Este valor esta no intervalo (50,75]");
		}
		else if(valor >75 && valor <=100) {
			System.out.println("Este valor esta no intervalo (75,100]");
		}
		else {
			System.out.println("Este valor esta fora dos intervalos.");
		}
		read.close();
	}

}
