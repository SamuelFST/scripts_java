import java.util.*;

public class operador_bitwise {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Digite um numero: ");
		n1 = read.nextInt();
		System.out.println("Digite um segundo numero: ");
		n2 = read.nextInt();
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		read.close();
	}

}
