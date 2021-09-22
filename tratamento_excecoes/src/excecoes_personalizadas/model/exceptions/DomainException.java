package excecoes_personalizadas.model.exceptions;

// A classe de tratamento de exceções pode extender a classe Exception ou RuntimeException
// Exception são as exceções em que o tratamento é obrigatório
// A RuntimeException são as excessões de tempo de execução, em que não é obrigatório o tratamento
public class DomainException extends RuntimeException {
	// Como a classe Exception é uma classe serializável, é preciso definir o número da versão
	private static final long serialVersionUID = 1L;

	// Esse construtor está sendo criado para que quando a DomainException seja instanciada, ela receba uma mensagem
	public DomainException(String mensagem) {
		super(mensagem);
	}
}
