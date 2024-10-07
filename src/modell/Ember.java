package modell;

import java.time.YearMonth;
import java.util.Date;

public class Ember {

    private String nev, szulDatum;
    private int kor;
    private String [] nyelvek;

    public Ember(String nev, int kor, String szulDatum) {
        this.Ember(nev, kor, szulDatum, String [] );
        
    }
    
    public Ember (String nev, int kor, String szulDatum, String [] nyelvek){
        this.nev = nev;
        this.kor = kor;
        this.szulDatum = szulDatum;
    }

    public String getNev() {
        return nev;
    }

    public String getSzulDatum() {
        return szulDatum;
    }

    public int getKor() {
        return kor;
    }

    public String [] getNyelvek() {
        return nyelvek;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setSzulDatum(String szulDatum) {
        this.szulDatum = szulDatum;
    }

    public void setNyelvek(String [] nyelvek) {
        this.nyelvek = nyelvek;
    }

    public int setKor(int kor) {
        return kor;
    }


    }

