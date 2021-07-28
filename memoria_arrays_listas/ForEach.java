import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String[] vetor = new String[3];
		
		System.out.println("Digite 3 nomes: ");
		for(int i=0; i<vetor.length; i++) {
			vetor[i] = read.nextLine();
		}
		
		System.out.println("-----------------------");
		
		for(String nome : vetor) {
			System.out.println(nome);
		}
		read.close();
	}

}
