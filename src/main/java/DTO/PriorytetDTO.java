package DTO;

import java.sql.Time;
import java.util.List;

/**
 * Created by Bartek on 2016-03-16.
 */
public class PriorytetDTO extends IDDTO{

    private  String nazwa;
    private Time czasReakcji;
    private List<ProjektyDTO> projekty;
    private ZgloszeniaDTO zgloszenie;


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Time getCzasReakcji() {
        return czasReakcji;
    }

    public void setCzasReakcji(Time czasReakcji) {
        this.czasReakcji = czasReakcji;
    }

    public List<ProjektyDTO> getProjekty() {
        return projekty;
    }

    public void setProjekty(List<ProjektyDTO> projekty) {
        this.projekty = projekty;
    }

    public ZgloszeniaDTO getZgloszenie() {
        return zgloszenie;
    }

    public void setZgloszenie(ZgloszeniaDTO zgloszenie) {
        this.zgloszenie = zgloszenie;
    }

    public PriorytetDTO(int id, String nazwa, Time czasR, List<ProjektyDTO> lp, ZgloszeniaDTO zglo) {
        super(id);
        this.nazwa=nazwa;
        this.czasReakcji=czasR;
        this.projekty=lp;
        this.zgloszenie=zglo;
    }
}
