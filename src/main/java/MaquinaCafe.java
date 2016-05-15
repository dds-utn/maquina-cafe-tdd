import java.util.Map;

import externo.DispenserAutomatico;

public class MaquinaCafe {

	private Pedido pedido;
	private Map<String, Accion> acciones;

	public MaquinaCafe(DispenserAutomatico dispenser, Map<String, Accion> acciones) {
		super();
		this.acciones = acciones;
		this.pedido = new Pedido(dispenser);
	}

	public void pulsar(String accion) {
		this.acciones.get(accion).ejecutar(pedido);
	}

}
