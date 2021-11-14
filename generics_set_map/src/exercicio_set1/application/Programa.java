package exercicio_set1.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import exercicio_set1.entities.LogEntrada;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o caminho do arquivo: ");
		String caminho = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			Set<LogEntrada> set = new HashSet<>();
			String linha = br.readLine();
			
			while(linha != null) {
				String[] campos = linha.split(" ");
				String nomeUsuario = campos[0];
				Date momento = Date.from(Instant.parse(campos[1]));
				set.add(new LogEntrada(nomeUsuario, momento));
				linha = br.readLine();
			}
			
			System.out.println("Total de usuarios: " +set.size());
		}
		catch(IOException e) {
			System.out.println("Erro: " +e.getMessage());
		}
		sc.close();
	}

}
