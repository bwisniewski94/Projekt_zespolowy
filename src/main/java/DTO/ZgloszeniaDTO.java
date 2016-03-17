package DTO;

import java.util.List;

/**
 * Created by Bartek on 2016-03-16.
 */
public class ZgloszeniaDTO extends IDDTO{

    private String opis;
    private PriorytetDTO priorytet;
    private ProjektyDTO projekt;
    private List<HistoriaDTO> historia;
    private List<ZalacznikiDTO> zalaczniki;


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

    public ZgloszeniaDTO(int id, String opis,ProjektyDTO projekt,PriorytetDTO prio, List<HistoriaDTO> historia, List<ZalacznikiDTO> zalaczniki) {
      super(id);
        this.opis=opis;
        this.priorytet=prio;
        this.projekt=projekt;
        this.zalaczniki=zalaczniki;
    }
}
