package enumeracao;

import java.util.Date;
import enumeracao.enums.StatusPedido;

public class Pedido {
	
	private Integer id;
	private Date momento;
	private StatusPedido status;
	
	public Pedido(Integer id, Date momento, StatusPedido status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido id=" + id + ", momento=" + momento + ", status=" + status;
	}
	
	
}
