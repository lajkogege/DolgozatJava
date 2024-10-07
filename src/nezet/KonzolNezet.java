package nezet;
import java.util.Scanner;
import modell.Emberek;

public class KonzolNezet {
    Scanner src = new Scanner(System.in);
    public void bekeres(){
        Emberek.nyelvtanulas()
        megjelenit(uzenet);
        
    }
    
      public void megjelenit(String uzenet) {
        System.out.println(uzenet);

    }
}
