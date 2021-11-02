package interface_comparable.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interface_comparable.entities.Funcionario;

public class Programa {

	public static void main(String[] args) {
		List<Funcionario> lista = new ArrayList<>();
		String caminho = "C:\\TEMP\\in.txt";
		
		try(BufferedReader bf = new BufferedReader(new FileReader(caminho))){
			
			String funcionarioCsv = bf.readLine();
			while(funcionarioCsv != null) {
				// Separando os dados pela vírgula e adicionando ao vetor
				String[] campos = funcionarioCsv.split(",");
				lista.add(new Funcionario(campos[0], Double.parseDouble(campos[1])));
				funcionarioCsv = bf.readLine();
			}
			
			// Se não for implementado o compareTo na classe funcionario, o sort apresenta um erro pois tem mais de um tipo de dado na lista
			Collections.sort(lista);
			for(Funcionario funcionario : lista) {
				System.out.println(funcionario.getNome() +", "+funcionario.getSalario());
			}
			
		}
		catch(IOException e) {
			System.out.println("Erro: " +e.getMessage());
		}

	}

}
