package modell;

import java.time.YearMonth;
import modell.Ember;

public class Emberek {

    public Ember[] emberek;

    public Emberek() {
        emberek = new Ember[3];
        emberek[0] = new Ember("Tajti Nóra",15, "2009.07.24" );
        emberek[1] = new Ember("Berkó Zita",20, "2004.03.24");
        emberek[2] = new Ember("Banka Soma",30, "1994.11.24");
    }
    
    public String alapBemuatkozas(){
        String szoveg= "Több ember bemutatkozása következik, hogy hivják, mikor született, és milyen nyelveken beszél:";
        int index= 1;
        for (Ember ember : emberek) {
            String nev = ember.getNev();
            int kor = ember.getKor();
            String szuldat= ember.getSzulDatum();
            String nyelv = ember.getNyelvek();
            szoveg += index +"Név: "+nev+"Kor: "+kor+"Születési idő: "+szuldat+"ismert nyelv: "+nyelv;
            index++;
        }
        return szoveg;
    }
    
    public String [] nyelvTanulas(){
        String szoveg="Adj meg egy uj tanult nyelvet: ";
        for (Ember ember : emberek) {
            ember.setNyelvek(nyelvek);
        }
    }
    
    public int oregszik(){
      String szoveg="Ha az emberünknek ma van a szülinpapja egy évet öregszik!";
      for (Ember ember : emberek) {
          if (ember.getSzulDatum())=== "2024" {
              ember.setKor(ember.getKor()+1);
          }
      }
    }
   
}
