import externo.DispenserAutomatico;


public class AgregarAzucar implements ContenidoExtra {

	@Override
	public void agregar(DispenserAutomatico dispenser) {
		dispenser.dispensarAzucar(1);
	}

}
