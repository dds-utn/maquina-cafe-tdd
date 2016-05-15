import java.util.ArrayList;
import java.util.List;

import externo.DispenserAutomatico;

public class Pedido {

	private Tamanio tamanio;
	private Bebida bebida;
	private List<ContenidoExtra> extras = new ArrayList<>();
	private DispenserAutomatico dispenser;

	public Pedido(DispenserAutomatico dispenser) {
		this.dispenser = dispenser;
	}

	public List<ContenidoExtra> getExtras() {
		return extras;
	}

	public void setTamanio(Tamanio tamanio) {
		this.tamanio = tamanio;
	}

	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	public void preparar() {
		tamanio.ponerVaso(dispenser);
		bebida.preparar(dispenser);
		extras.forEach(extra -> extra.agregar(dispenser));
	}

	public void agregarExtra(ContenidoExtra extra) {
		this.extras.add(extra);
	}

}
