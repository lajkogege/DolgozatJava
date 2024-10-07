
package vezerlo;

import modell.Emberek;
import nezet.KonzolNezet;

public class KonzolVezerlo {
    private Emberek modell;
    
    private KonzolVezerlo(Emberek modell,KonzolNezet nezet){
        nezet.megjelenit(modell.alapBemuatkozas());
    }
}
