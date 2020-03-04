package hr.cnzd.prepoznajmoenasilje.kviz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pitanje {

    private String tekst;
    private String vrsta;
    private List<Odgovor> odgovori;
    private boolean daniOdgovor;


    public Pitanje() {
        this.odgovori=new ArrayList<>();
    }
    public boolean isDaniOdgovor() {
        return daniOdgovor;
    }

    public void setDaniOdgovor(boolean daniOdgovor) {
        this.daniOdgovor = daniOdgovor;
    }



    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public List<Odgovor> getOdgovori() {
        return odgovori;
    }

    public void setOdgovori(List<Odgovor> odgovori) {
        this.odgovori = odgovori;
    }

    public static List<Pitanje> getPitanja(String vrsta, int ukupno){
        List<Pitanje> pitanja ;

       // RAZREDNA
        if(vrsta.equals("razredna")){
            pitanja = PitanjaMladi.napuniPitanja();
        }else{
            pitanja= PitanjaStariji.napuniPitanja();
        }

        Collections.shuffle(pitanja);
        List<Pitanje> vrati = new ArrayList<>();
        for(int i=0;i<ukupno;i++){
            Collections.shuffle(pitanja.get(i).getOdgovori());
            vrati.add(pitanja.get(i));
        }
        return vrati;
    }
}
