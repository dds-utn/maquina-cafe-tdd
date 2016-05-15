import java.util.HashMap;
import java.util.Map;

import externo.DispenserAutomatico;


public class MaquinaCafe {

	private DispenserAutomatico dispenser;
	
	private Pedido pedido;

	public MaquinaCafe(DispenserAutomatico dispenser) {
		super();
		this.pedido = new Pedido();
		this.dispenser = dispenser;
	}

	public void pulsar(String accion) {
		switch (accion) {
		case "grande":
			pedido.setTamanio(new TamanioGrande());
			break;
		case "venti":
			pedido.setTamanio(new TamanioVenti());
			break;
		case "syrupFlavoredLatte":
			pedido.setBebida(new SyrupFlavoredLatte());
			break;
		case "aceptar":
			pedido.preparar(dispenser);
			break;
		case "azucar":
			pedido.agregarExtra(new AgregarAzucar());
			break;
		default:
			throw new RuntimeException("Boton no definido");
		}
	}

}
