package exercicio_metodoAbstrato.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio_metodoAbstrato.entidades.Circulo;
import exercicio_metodoAbstrato.entidades.Formato;
import exercicio_metodoAbstrato.entidades.Retangulo;
import exercicio_metodoAbstrato.enums.Cor;

public class Programa {
	/*
	 Fazer um programa para ler os dados de N figuras e depois mostrar as areas dessas figuras na mesma ordem que foram digitadas
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Formato> listaFormatos = new ArrayList<>();
		
		System.out.print("Digite a quantidade de formatos: ");
		int quantidadeFormatos = sc.nextInt();
		
		for(int i=1; i<=quantidadeFormatos; i++) {
			System.out.println("\nDados do formato #"+i);
			System.out.print("Retangulo ou circulo (r/c)? ");
			char opcao = sc.next().charAt(0);
			System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
			Cor cor = Cor.valueOf(sc.next());
			
			if(opcao == 'r') {
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				Formato retangulo = new Retangulo(cor, altura, largura);
				listaFormatos.add(retangulo);
			}
			else {
				System.out.println("Raio do circulo: ");
				double raio = sc.nextDouble();
				Formato circulo = new Circulo(cor, raio);
				listaFormatos.add(circulo);
			}
		}
		
		System.out.println("Areas dos formatos: ");
		
		for(Formato formato : listaFormatos) {
			System.out.println(String.format("%.2f", formato.area()));
		}
		
		sc.close();
	}

}
