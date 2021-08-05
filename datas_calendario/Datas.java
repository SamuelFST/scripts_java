import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.TimeZone;
import java.util.Date;
import java.time.Instant;

public class Datas {

	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); // Instanciação de uma formatação de data do tipo: dia/mes/ano
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // Instanciação de uma formatação como a anterior mas incluindo hora/minutos/segundos
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); // Setando o sdf3 para o fuso horário ser o GMT, e não o GMT-3 do Brasil
		
		Date x1 = new Date(); // Pega o horário atual do sistema e atribui a x1
		Date x2 = new Date(System.currentTimeMillis()); // Pega os milisegundos do horario atual do sistema e atribui a x2
		Date x3 = new Date(0L); // Passando 0 milisegundos como parâmetro, que vai atribuir a x3 a data e horário inicial que a API começou a registrar
		Date x4 = new Date(1000L * 60L * 60L * 5L); // 1000L = 1 segundo * 60L = 1 minuto * 60L = 1 hora * 60L = 5 horas
		Date y1 = sdf1.parse("25/06/2018"); // Atribuindo a y1 uma data na formatação do sdf1
		Date y2 = sdf2.parse("25/06/2018 15:42:07"); // Atribuindo a y2 uma data e horario na formatação do sdf2
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // Atribuindo uma data no padrão ISO 8601, o Z significa que a data estará em UTC (3 horas a menos)
		
		// Imprimindo na tela as variáveis com a formatação padrão 
		System.out.println("x1: " + x1); 
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("-------------");
		
		// Imprimindo na tela as variáveis com a formatação: dia/mes/ano | hora/minutos/segundos
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("-------------");
		
		// Imprimindo na tela as variáveis com a formatação: dia/mes/ano | hora/minutos/segundos, mas com fuso horário GMT
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		
	}

}
