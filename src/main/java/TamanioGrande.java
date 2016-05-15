import externo.DispenserAutomatico;
import externo.TamanioVaso;


public class TamanioGrande implements Tamanio {

	@Override
	public void ponerVaso(DispenserAutomatico dispenser) {
		dispenser.ponerVaso(TamanioVaso.Grande);
	}

}
