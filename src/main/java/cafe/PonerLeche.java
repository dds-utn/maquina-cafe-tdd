package cafe;

public class PonerLeche implements AccionDispenser {

   @Override
   public void ejecutar(DispenserAdapter dispenser) {
      dispenser.ponerLeche();
   }

}
