package excecoes_personalizadas.model.exceptions;

// A classe de tratamento de exce��es pode extender a classe Exception ou RuntimeException
// Exception s�o as exce��es em que o tratamento � obrigat�rio
// A RuntimeException s�o as excess�es de tempo de execu��o, em que n�o � obrigat�rio o tratamento
public class DomainException extends RuntimeException {
	// Como a classe Exception � uma classe serializ�vel, � preciso definir o n�mero da vers�o
	private static final long serialVersionUID = 1L;

	// Esse construtor est� sendo criado para que quando a DomainException seja instanciada, ela receba uma mensagem
	public DomainException(String mensagem) {
		super(mensagem);
	}
}
