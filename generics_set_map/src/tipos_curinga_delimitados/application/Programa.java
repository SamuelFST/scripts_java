package tipos_curinga_delimitados.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		// Cria uma lista já com elementos que podem ser modiicados
		List<Integer> inteiros = Arrays.asList(1, 2, 3, 4);
		List<Double> doubles = Arrays.asList(3.14, 6.28);
		
		// Cria uma lista com o tipo genérico Object 
		List<Object> meusObjs = new ArrayList<Object>();
		
		copiar(inteiros, meusObjs);
		imprimirLista(meusObjs);
		copiar(doubles, meusObjs);
		imprimirLista(meusObjs);
	}
	
	/* O método recebe como parâmetro uma lista de qualquer tipo que extenda o tipo genérico Number
	 * e também uma outra lista de qualquer tipo que seja um supertipo de Number */
	public static void copiar(List<? extends Number> origem, List<? super Number> destino) {
		for(Number numero : origem) {
			destino.add(numero);
		}
	}

	public static void imprimirLista(List<?> lista) {
		for(Object obj : lista) {
			System.out.print(obj +" ");
		}
		System.out.println();
	}
}
