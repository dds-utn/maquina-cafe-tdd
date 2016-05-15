import java.util.HashMap;
import java.util.Map;

import externo.DispenserAutomatico;

public class MaquinaCafe {

	private Pedido pedido;
	private Map<String, Accion> acciones;

	public MaquinaCafe(DispenserAutomatico dispenser) {
		super();
		this.pedido = new Pedido(dispenser);
		this.inicializarAcciones();
	}

	private void inicializarAcciones() {
		acciones = new HashMap<>();
		acciones.put("grande", new PonerVaso(new TamanioGrande()));
		acciones.put("venti", new PonerVaso(new TamanioVenti()));
		acciones.put("syrupFlavoredLatte", new PonerBebida(new SyrupFlavoredLatte()));
		acciones.put("aceptar", new Aceptar());
		acciones.put("azucar", new AgregarExtra(new AgregarAzucar()));		
	}

	public void pulsar(String accion) {
		this.acciones.get(accion).ejecutar(pedido);
	}

}
