package cafe2;

public class PonerShort implements AccionDispenser {

   @Override
   public void ejecutar(DispenserAdapter dispenser) {
      dispenser.ponerShort();
   }

}
