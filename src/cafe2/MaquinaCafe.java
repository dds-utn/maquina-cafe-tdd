package cafe2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaquinaCafe {

   private DispenserAdapter dispenser;

   private List<AccionDispenser> acciones = new ArrayList<>();
   private Map<String, AccionDispenser> comandos = new HashMap<>();

   public MaquinaCafe(DispenserAdapter dispenser) {
      this.dispenser = dispenser;
      comandos.put("cafeLatte", new PonerLeche());
      comandos.put("short", new PonerShort());
      comandos.put("whiteMocha", new AccionNula());
      comandos.put("tail", new AccionNula());
   }

   public void pulsar(String comando) {
      if (comando.equals("aceptar")) {
         if (acciones.isEmpty())
            throw new RuntimeException();
         else
            acciones.forEach(a -> a.ejecutar(dispenser));
      } else if (comando.equals("cancelar")) {
         acciones.clear();
      } else if (comandos.containsKey(comando)) {
         acciones.add(comandos.get(comando));
      } else {
         throw new RuntimeException("Comando invalido");
      }
   }

   public boolean preparoCafe() {
      return acciones.size() > 0;
   }

}
