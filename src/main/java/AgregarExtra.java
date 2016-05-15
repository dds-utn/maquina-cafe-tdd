
public class AgregarExtra implements Accion {

	private ContenidoExtra extra;

	public AgregarExtra(ContenidoExtra extra) {
		this.extra = extra;
	}

	public void ejecutar(Pedido pedido) {
		pedido.getExtras().add(extra);
	}

}
