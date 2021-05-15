package Nota_aluno;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		Aluno aluno;
		aluno = new Aluno();
		
		System.out.print("Digite o nome do aluno: ");
		aluno.nome = read.nextLine();
		System.out.print("\nPrimeira nota: ");
		aluno.nota1 = read.nextDouble();
		System.out.print("\nSegunda nota: ");
		aluno.nota2 = read.nextDouble();
		System.out.print("\nTerceira nota: ");
		aluno.nota3 = read.nextDouble();
		
		System.out.printf("\nNota final = %.2f", aluno.notaFinal());
		aluno.checarAprovacao(aluno.notaFinal());
		
		read.close();
	}

}
