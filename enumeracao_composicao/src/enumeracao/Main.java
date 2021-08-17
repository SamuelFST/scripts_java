package enumeracao;

import java.util.Date;
import enumeracao.enums.StatusPedido;

public class Main {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(1234, new Date(), StatusPedido.PAGAMENTO_PENDENTE);
		
		System.out.println(pedido);
		
		// Buscando valor pela variavel ENVIADO do enum
		StatusPedido sp1 = StatusPedido.ENVIADO;
		
		// Buscando pela palavra ENVIADO no enum
		StatusPedido sp2 =  StatusPedido.valueOf("ENVIADO");
	}

}
