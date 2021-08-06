import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendario {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // Instanciando a formata��o da data e hor�rio
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // d recebendo a data no padr�o ISO 8601
		System.out.println(sdf.format(d)); // Imprimindo na tela o conte�do da vari�vel d com a formata��o do sdf
		
		Calendar cal = Calendar.getInstance(); // Criando um calend�rio
		cal.setTime(d); // Colocando a data salva na var�vel d dentro do calend�rio
		cal.add(Calendar.HOUR_OF_DAY, 4); // Adicionando ao calend�rio mais horas do dia, e passando como argumento o n�mero 4 (ent�o ser� adicionado 4 horas)
		d = cal.getTime(); // Vari�vel d recebe a data salva no calend�rio
		System.out.println(sdf.format(d)); // Imprimindo na tela o conte�do da vari�vel d com a formata��o do sdf
		int minutos = cal.get(Calendar.MINUTE); // Vari�vel minutos recebendo os minutos do horario salvo no calendario 
		int mes = 1 + cal.get(Calendar.MONTH); // Vari�vel mes recebendo o mes da data salva no calendario
		int dia = cal.get(Calendar.DAY_OF_MONTH); // Vari�vel dia recebendo o dia do mes da data salva no calendario
		System.out.println("Minutos: " + minutos);
		System.out.println("Mes: " + mes);
		System.out.println("Dia: "+dia);
	}

}
