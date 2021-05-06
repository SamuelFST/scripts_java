import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int escolha, alcool = 0, gasolina = 0, diesel = 0;
		
		System.out.println("Digite o codigo do combustivel abastecido: 1- Alcool 2- Gasolina 3- Diesel 4- Sair");
		escolha = read.nextInt();
		
		while(escolha != 4) {
			if(escolha == 1) {
				alcool++;
			}
			else if(escolha == 2) {
				gasolina++;
			}
			else if(escolha == 3) {
				diesel++;
			}
			else {
				System.out.println("Codigo invalido, digite outro codigo: ");
			}
			System.out.println("Digite o codigo do combustivel abastecido: 1- Alcool 2- Gasolina 3- Diesel 4- Sair");
			escolha = read.nextInt();
		}
		
		System.out.println("Muito obrigado");
		System.out.printf("Alcool: %d%n Gasolina: %d%n Diesel: %d%n", alcool, gasolina, diesel);
		
		read.close();
	}

}
