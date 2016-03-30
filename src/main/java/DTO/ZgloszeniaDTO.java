package DTO;

import java.util.List;

/**
 * Created by Bartek on 2016-03-16.
 */
public class ZgloszeniaDTO extends IDDTO{

    private String opis;
    private Typ rodzajZgloszenia;
    private TypZgloszenia typ;
    private ProjektyDTO projekt;
    private List<HistoriaDTO> historia;
    private List<ZalacznikiDTO> zalaczniki;

    public TypZgloszenia getTyp() {
        return typ;
    }

    public void setTyp(TypZgloszenia typ) {
        this.typ = typ;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
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

    public void setZalaczniki(List<ZalacznikiDTO> zalaczniki)
    {
        this.zalaczniki = zalaczniki;
    }

    public Typ getRodzajZgloszenia() {
        return rodzajZgloszenia;
    }

    public void setRodzajZgloszenia(Typ rodzajZgloszenia) {
        this.rodzajZgloszenia = rodzajZgloszenia;
    }

    public ZgloszeniaDTO(int id, String opis,Typ rodzajZgloszenia, ProjektyDTO projekt, TypZgloszenia typz, List<HistoriaDTO> historia, List<ZalacznikiDTO> zalaczniki) {
      super(id);
        this.typ=typz;
        this.rodzajZgloszenia=rodzajZgloszenia;
        this.opis=opis;
        this.historia=historia;
        this.projekt=projekt;
        this.zalaczniki=zalaczniki;
    }
}
