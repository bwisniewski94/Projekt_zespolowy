package DTO;

import java.util.Date;
import java.util.List;

/**
 * Created by Bartek on 2016-03-17.
 */
public class ZgloszenieWewDTO extends IDDTO{


    private ZgloszeniaDTO zgloszenie;
    private String opis;
    private PriorytetDTO priorytet;
    private ProjektyDTO projekt;
    private List<HistoriaDTO> historia;
    private List<ZalacznikiDTO> zalaczniki;



    public ZgloszeniaDTO getZgloszenie() {
        return zgloszenie;
    }

    public void setZgloszenie(ZgloszeniaDTO zgloszenie) {
        this.zgloszenie = zgloszenie;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public PriorytetDTO getPriorytet() {
        return priorytet;
    }

    public void setPriorytet(PriorytetDTO priorytet) {
        this.priorytet = priorytet;
    }

    public ProjektyDTO getProjekt() {
        return projekt;
    }

    public void setProjekt(ProjektyDTO projekt) {
        this.projekt = projekt;
    }

    public List<HistoriaDTO> getHistoria() {
        return historia;
    }

    public void setHistoria(List<HistoriaDTO> historia) {
        this.historia = historia;
    }

    public List<ZalacznikiDTO> getZalaczniki() {
        return zalaczniki;
    }

    public void setZalaczniki(List<ZalacznikiDTO> zalaczniki) {
        this.zalaczniki = zalaczniki;
    }

    public ZgloszenieWewDTO(int id, ZgloszeniaDTO zgloszenie, String opis, PriorytetDTO prio, ProjektyDTO projekt, List<HistoriaDTO> histo, List<ZalacznikiDTO> zalacznik) {
        super(id);
        this.zgloszenie=zgloszenie;
        this.opis=opis;
        this.priorytet=prio;
        this.projekt=projekt;
        this.historia=histo;
        this.zalaczniki=zalacznik;
    }
}
