
public class PonerBebida implements Accion {

	private Bebida bebida;

	public PonerBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	public void ejecutar(Pedido pedido) {
		pedido.setBebida(bebida);
	}

}
