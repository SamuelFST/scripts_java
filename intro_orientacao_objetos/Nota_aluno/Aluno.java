package Nota_aluno;

public class Aluno {
	public String nome;
	public double nota1, nota2, nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double checarAprovacao(double notaFinal) {
		if(notaFinal < 60.00) {
			System.out.print("\nReprovado");
			System.out.printf("\nFaltou %.2f pontos para a aprovacao", 60 - notaFinal);
		}
		else {
			System.out.print("\nAprovado");
		}
		return 0;
	}
}
