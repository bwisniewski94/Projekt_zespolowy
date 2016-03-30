package DTO;

import java.util.List;

/**
 * Created by Bartek on 2016-03-30.
 */
public class Opis_PriorytetuDTO extends IDDTO{

    private priorytet typ;
    private Jednostka jednostka;
    private int ilosc;
    private ProjektyDTO listaProjektow;

    public ProjektyDTO getListaProjektow() {
        return listaProjektow;
    }

    public void setListaProjektow(ProjektyDTO listaProjektow) {
        this.listaProjektow = listaProjektow;
    }

    public priorytet getTyp() {
        return typ;
    }

    public void setTyp(priorytet typ) {
        this.typ = typ;
    }

    public Jednostka getJednostka() {
        return jednostka;
    }

    public void setJednostka(Jednostka jednostka) {
        this.jednostka = jednostka;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public Opis_PriorytetuDTO(int i, priorytet prio,Jednostka jed,int ilosc, ProjektyDTO lista) {
        super(i);
        this.typ=prio;
        this.jednostka=jed;
        this.ilosc=ilosc;
        this.listaProjektow=lista;
    }

}
