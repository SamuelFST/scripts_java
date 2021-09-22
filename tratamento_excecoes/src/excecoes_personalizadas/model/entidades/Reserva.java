package excecoes_personalizadas.model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import excecoes_personalizadas.model.exceptions.DomainException;

public class Reserva {
	private Integer numeroDoQuarto;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	// Com o DomainException sendo do tipo RuntimeException, não é preciso o uso do throws
	public Reserva(Integer numeroDoQuarto, Date checkIn, Date checkOut) /*throws DomainException*/ {
		if(!checkOut.after(checkIn)) {
			throw new DomainException("data de check-out deve ser apos a data de check-in");
	    }
		this.numeroDoQuarto = numeroDoQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getNumeroDoQuarto() {
		return numeroDoQuarto;
	}

	public void setNumeroDoQuarto(Integer numeroDoQuarto) {
		this.numeroDoQuarto = numeroDoQuarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duracao() {
		// O getTime() retorna os milisegundos da data salva na variavel
		// O comando abaixo pega a diferença em milisegundos entre a data de saída e entrada
		long diferenca = checkOut.getTime() - checkIn.getTime();
		// O comando abaixo converte os milisegundos salvos na variável diferenca em dias
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}
	
	public void atualizarDatas(Date checkIn, Date checkOut) /*throws DomainException*/ {
		Date agora = new Date();
	    // o before checa se uma data é anteior a outra 
	    if(checkIn.before(agora) || checkOut.before(agora)) {
	    	// Essa classe de exceção pode ser utilizada quando tiver algum argumento inválido
	    	throw new DomainException("As datas para atualizacao de reserva devem ser futuras") ;
		 }
		if(!checkOut.after(checkIn)) {
			throw new DomainException("data de check-out deve ser apos a data de check-in");
	    }
	    this.checkIn = checkIn;
	    this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Reserva: Quarto "+getNumeroDoQuarto());
		sb.append(", check-in: "+sdf.format(getCheckIn()));
		sb.append(", check-out: "+sdf.format(getCheckOut()));
		sb.append(", "+duracao() +" noites");
		return sb.toString();
	}
	
}
