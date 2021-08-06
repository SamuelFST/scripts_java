import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendario {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // Instanciando a formatação da data e horário
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // d recebendo a data no padrão ISO 8601
		System.out.println(sdf.format(d)); // Imprimindo na tela o conteúdo da variável d com a formatação do sdf
		
		Calendar cal = Calendar.getInstance(); // Criando um calendário
		cal.setTime(d); // Colocando a data salva na varável d dentro do calendário
		cal.add(Calendar.HOUR_OF_DAY, 4); // Adicionando ao calendário mais horas do dia, e passando como argumento o número 4 (então será adicionado 4 horas)
		d = cal.getTime(); // Variável d recebe a data salva no calendário
		System.out.println(sdf.format(d)); // Imprimindo na tela o conteúdo da variável d com a formatação do sdf
		int minutos = cal.get(Calendar.MINUTE); // Variável minutos recebendo os minutos do horario salvo no calendario 
		int mes = 1 + cal.get(Calendar.MONTH); // Variável mes recebendo o mes da data salva no calendario
		int dia = cal.get(Calendar.DAY_OF_MONTH); // Variável dia recebendo o dia do mes da data salva no calendario
		System.out.println("Minutos: " + minutos);
		System.out.println("Mes: " + mes);
		System.out.println("Dia: "+dia);
	}

}
