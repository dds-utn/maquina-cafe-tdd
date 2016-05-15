import externo.DispenserAutomatico;
import externo.TamanioVaso;


public class TamanioVenti implements Tamanio {

	@Override
	public void ponerVaso(DispenserAutomatico dispenser) {
		dispenser.ponerVaso(TamanioVaso.Venti);
	}

}
