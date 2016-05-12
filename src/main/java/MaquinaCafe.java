import org.mockito.Mockito;

import externo.DispenserAutomatico;
import externo.TamanioVaso;
import externo.TipoLeche;


public class MaquinaCafe {

	private DispenserAutomatico dispenser;
	
	public MaquinaCafe(DispenserAutomatico dispenser) {
		super();
		this.dispenser = dispenser;
	}

	public void pulsar(String accion) {
		if (accion.equals("aceptar")) {
			dispenser.ponerVaso(TamanioVaso.Grande);
			dispenser.dispensarSyrup(1);
			dispenser.dispensarLeche(TipoLeche.Descremada, 1);
			dispenser.dispensarCafe("colombiano", 10);
			dispenser.dispensarAzucar(1);
			dispenser.dispensarEspecia(0, 1);
		}

	}

}
