import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import externo.DispenserAutomatico;
import externo.TamanioVaso;
import externo.TipoLeche;


public class MaquinaCafeTest {
	
	private DispenserAutomatico dispenser;

	@Before
	public void init() {
		dispenser =
				Mockito.
				mock(DispenserAutomatico.class);
	}
	
	@Test
	public void hacerUnSyrupFlavoredLatteGrandeConAzucarYCacao() {
		MaquinaCafe maquina = new MaquinaCafe(dispenser);
		maquina.pulsar("grande");
		maquina.pulsar("syrupFlavoredLatte");
		maquina.pulsar("azucar");
		maquina.pulsar("cacao");
		maquina.pulsar("aceptar");
		
		Mockito.verify(dispenser).ponerVaso(TamanioVaso.Grande); 
		Mockito.verify(dispenser).dispensarSyrup(1);
		Mockito.verify(dispenser).dispensarLeche(TipoLeche.Descremada, 1);
		Mockito.verify(dispenser).dispensarAzucar(1);
		Mockito.verify(dispenser).dispensarCafe("colombiano", 10);
		Mockito.verify(dispenser).dispensarEspecia(0, 1);
		
	}
	
	@Test
	public void hacerUnSyrupFlavoredLatteVentiConAzucarYCacao() {
		MaquinaCafe maquina = new MaquinaCafe(dispenser);
		maquina.pulsar("venti");
		maquina.pulsar("syrupFlavoredLatte");
		maquina.pulsar("azucar");
		maquina.pulsar("cacao");
		maquina.pulsar("aceptar");
		
		Mockito.verify(dispenser).ponerVaso(TamanioVaso.Venti); 
		Mockito.verify(dispenser).dispensarSyrup(1);
		Mockito.verify(dispenser).dispensarLeche(TipoLeche.Descremada, 1);
		Mockito.verify(dispenser).dispensarAzucar(1);
		Mockito.verify(dispenser).dispensarCafe("colombiano", 10);
		Mockito.verify(dispenser).dispensarEspecia(0, 1);
		
	}
	
}
