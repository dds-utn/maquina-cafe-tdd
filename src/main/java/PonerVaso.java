
public class PonerVaso implements Accion {

	private Tamanio tamanio;

	public PonerVaso(Tamanio tamanio) {
		this.tamanio = tamanio;
	}

	public void ejecutar(Pedido pedido) {
		pedido.setTamanio(tamanio);
	}

}
