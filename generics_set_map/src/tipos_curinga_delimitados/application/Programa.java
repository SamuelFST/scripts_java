package tipos_curinga_delimitados.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		// Cria uma lista j� com elementos que podem ser modiicados
		List<Integer> inteiros = Arrays.asList(1, 2, 3, 4);
		List<Double> doubles = Arrays.asList(3.14, 6.28);
		
		// Cria uma lista com o tipo gen�rico Object 
		List<Object> meusObjs = new ArrayList<Object>();
		
		copiar(inteiros, meusObjs);
		imprimirLista(meusObjs);
		copiar(doubles, meusObjs);
		imprimirLista(meusObjs);
	}
	
	/* O m�todo recebe como par�metro uma lista de qualquer tipo que extenda o tipo gen�rico Number
	 * e tamb�m uma outra lista de qualquer tipo que seja um supertipo de Number */
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
