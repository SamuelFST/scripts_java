package demonstracaoStringBuilder.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import demonstracaoStringBuilder.entidades.Comentario;
import demonstracaoStringBuilder.entidades.Postagem;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario comentario1 = new Comentario("Have a nice trip!");
		Comentario comentario2 = new Comentario("Wow that's awesome!");
		
		// Criando uma nova postagem passando os parametros
		Postagem postagem1 = new Postagem(sdf.parse("21/06/2021 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
		// Associando os comentarios a postagem
		postagem1.adicionarComentario(comentario1);
		postagem1.adicionarComentario(comentario2);
		
		Comentario comentario3 = new Comentario("Good night");
		Comentario comentario4 = new Comentario("May the force be with you");
		
		Postagem postagem2 = new Postagem(sdf.parse("28/06/2021 23:14:19"), "Good night guys", "See you tomorrow", 5);
		postagem2.adicionarComentario(comentario3);
		postagem2.adicionarComentario(comentario4);
		
		System.out.println(postagem1);
		System.out.println(postagem2);
	}

}
