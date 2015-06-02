package cafe;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDriver {
   
   private DispenserMock dispenser;
   private MaquinaCafe maquinaCafe;

   @Test
   public void siApretasteCancelarNoPreparoCafe() {
      maquinaCafe.pulsar("cancelar");
      assertFalse(maquinaCafe.preparoCafe());
   }

   @Test
   public void siSoloAceptasFallaYNoHayCafe() {
      try {
         maquinaCafe.pulsar("aceptar");
         fail();
      } catch (RuntimeException e) {
         assertFalse(maquinaCafe.preparoCafe());
      }
   }

   @Test
   public void foo4() {
      maquinaCafe.pulsar("short");
      maquinaCafe.pulsar("cafeLatte");
      maquinaCafe.pulsar("aceptar");

      assertTrue(maquinaCafe.preparoCafe());
   }

   @Test
   public void foo5() {
      maquinaCafe.pulsar("short");
      maquinaCafe.pulsar("cafeLatte");
      maquinaCafe.pulsar("cancelar");

      assertFalse(maquinaCafe.preparoCafe());
   }
   

   @Test
   public void foo6() {
      maquinaCafe.pulsar("short");
      maquinaCafe.pulsar("cafeLatte");
      maquinaCafe.pulsar("aceptar");

      assertTrue(dispenser.lePidioPonerCafe());
      assertTrue(dispenser.lePidioPonerLeche());
   }
   

   @Test
   public void foo7() {
      maquinaCafe.pulsar("short");
      maquinaCafe.pulsar("whiteMocha");
      maquinaCafe.pulsar("aceptar");

      assertTrue(dispenser.lePidioPonerCafe());
      assertFalse(dispenser.lePidioPonerLeche());
   }
   
   @Test
   public void foo8() {
      maquinaCafe.pulsar("short");
      maquinaCafe.pulsar("whiteMocha");
      maquinaCafe.pulsar("aceptar");

      assertTrue(dispenser.lePidioShort());
   }

   
   @Test
   public void foo9() {
      maquinaCafe.pulsar("tail");
      maquinaCafe.pulsar("whiteMocha");
      maquinaCafe.pulsar("aceptar");

      assertFalse(dispenser.lePidioShort());
   }

   @Test(expected = RuntimeException.class)
   public void foo10() {
      maquinaCafe.pulsar("fruta");
   }
   

   @Before
   public void setup() {
      dispenser = new DispenserMock();
      maquinaCafe = new MaquinaCafe(dispenser);
   }


}
