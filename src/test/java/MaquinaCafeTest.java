import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import externo.DispenserAutomatico;
import externo.TamanioVaso;
import externo.TipoLeche;


public class MaquinaCafeTest {
	
	private DispenserAutomatico dispenser;
	private MaquinaCafe maquina;

	@Before
	public void init() {
		dispenser = Mockito.mock(DispenserAutomatico.class);
		maquina = new MaquinaCafe(dispenser, getAcciones()); 
	}
	
	private Map<String, Accion> getAcciones() {
		HashMap<String, Accion> acciones = new HashMap<>();
		acciones.put("grande", new PonerVaso(new TamanioGrande()));
		acciones.put("venti", new PonerVaso(new TamanioVenti()));
		acciones.put("syrupFlavoredLatte", new PonerBebida(new SyrupFlavoredLatte()));
		acciones.put("aceptar", new Aceptar());
		acciones.put("azucar", new AgregarExtra(new AgregarAzucar()));
		return acciones;
	}

	@Test
	public void hacerUnSyrupFlavoredLatteGrandeConAzucarYCacao() {
		maquina.pulsar("grande");
		maquina.pulsar("syrupFlavoredLatte");
		maquina.pulsar("azucar");
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
		maquina.pulsar("venti");
		maquina.pulsar("syrupFlavoredLatte");
		maquina.pulsar("azucar");
		maquina.pulsar("azucar");
		maquina.pulsar("aceptar");
		
		Mockito.verify(dispenser).ponerVaso(TamanioVaso.Venti); 
		Mockito.verify(dispenser).dispensarSyrup(1);
		Mockito.verify(dispenser).dispensarLeche(TipoLeche.Descremada, 1);
		Mockito.verify(dispenser, Mockito.times(2)).dispensarAzucar(1);
		Mockito.verify(dispenser).dispensarCafe("colombiano", 10);
		Mockito.verify(dispenser).dispensarEspecia(0, 1);
		
	}
	
}
