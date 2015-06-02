package cafe;

public interface DispenserAutomatico {

   public boolean tieneCafe(String tipo, float gramos);

   public boolean tieneLeche(TipoLeche tipo, int centilitros);

   public boolean tieneAzucar(float cucharadas);

   public boolean tieneEdulcorante(float cucharadasEquiv);

   public void ponerVaso(TamanioVaso tamanio);

   public void dispensarCafe(String tipo, float gramos);

   public void dispensarAgua(int onzas);

   public void dispensarLeche(TipoLeche tipo, int onzas);

   // 0=chocolate, 1=canela, 2=componenteJamaiquino
   public void dispensarEspecia(int container, int onzas);

   public void dispensarSyrup(int medidas);

   public void dispensarAzucar(float cucharadas);

   public void dispensarEdulcorante(float cucharadasEquiv);

   public void cancelar();

}