import externo.DispenserAutomatico;
import externo.TipoLeche;


public class SyrupFlavoredLatte implements Bebida {

	@Override
	public void preparar(DispenserAutomatico dispenser) {
		dispenser.dispensarSyrup(1);
		dispenser.dispensarLeche(TipoLeche.Descremada, 1);
		dispenser.dispensarCafe("colombiano", 10);
		dispenser.dispensarEspecia(0, 1);
	}

}
