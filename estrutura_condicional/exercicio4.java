import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int horaInicio, horaFim, total;
		
		System.out.print("Digite a hora de inicio do jogo: ");
		horaInicio = read.nextInt();
		System.out.print("Digite a hora final do jogo: ");
		horaFim = read.nextInt();
		
		if (horaInicio < horaFim) {
			total = horaFim - horaInicio;
		}
		else {
			total = 24 - horaInicio + horaFim;
		}
		
		System.out.printf("O jogo durou %d hora(s).", total);
		
		read.close();
	}
}
