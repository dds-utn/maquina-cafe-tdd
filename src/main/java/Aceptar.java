

public class Aceptar implements Accion {
	
	public Aceptar() {
		super();
	}

	public void ejecutar(Pedido pedido) {
		pedido.preparar();		
	}

}
