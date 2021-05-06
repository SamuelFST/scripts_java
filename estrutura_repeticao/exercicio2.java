import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int X, Y;
		
		System.out.print("\nDigite o numero da coordenada de X: ");
		X = read.nextInt();
		System.out.print("Digite o numero da coordenada de Y: ");
		Y = read.nextInt();
		
		while(X != 0 && Y != 0) {
			
			if(X < 0 && Y < 0) {
				System.out.println("Terceiro quadrante");
			}
			else if(X < 0 && Y > 0) {
				System.out.println("Segundo quadrante");
			}
			else if(X > 0 && Y > 0) {
				System.out.println("Primeiro quadrante");
			}
			else {
				System.out.println("Quarto quadrante");
			}
			System.out.print("\nDigite o numero da coordenada de X: ");
			X = read.nextInt();
			System.out.print("Digite o numero da coordenada de Y: ");
			Y = read.nextInt();
		}
		read.close();
	}

}
