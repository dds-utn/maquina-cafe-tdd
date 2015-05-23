package cafe2;

public class PonerLeche implements AccionDispenser {

   @Override
   public void ejecutar(DispenserAdapter dispenser) {
      dispenser.ponerLeche();
   }

}
