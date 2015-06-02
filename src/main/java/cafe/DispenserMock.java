package cafe;

public class DispenserMock implements DispenserAdapter {

   private boolean tieneLeche;
   private boolean pidioShort;

   @Override
   public void ponerLeche() {
      this.tieneLeche = true;
   }

   public boolean lePidioPonerCafe() {
      return true;
   }

   public boolean lePidioPonerLeche() {
      return tieneLeche;
   }

   public boolean lePidioShort() {
      return pidioShort;
   }

   @Override
   public void ponerShort() {
      this.pidioShort = true;
   }

}
