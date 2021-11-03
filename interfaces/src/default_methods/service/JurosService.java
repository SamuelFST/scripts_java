package default_methods.service;

import java.security.InvalidParameterException;

public interface JurosService {
	
	double getTaxaJuros();
	
	// Um método deve ser default na interface quando o corpo dele pode ser o mesmo para todas as classes que vão implementar essa interface
	// Todas as classes que implementarem a interface, terão acesso automaticamente a esse método, sem precisar implementar e sobrescrever
	default double pagamento(double quantia, int meses) {
		if(meses < 1) {
			throw new InvalidParameterException("Os meses devem ser maior que 0");
		}
		return quantia * Math.pow(1.0 + getTaxaJuros() /100, meses);
	}
	
}
