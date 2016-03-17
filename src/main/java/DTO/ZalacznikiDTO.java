package DTO;

import javax.activation.MimeType;

/**
 * Created by Bartek on 2016-03-17.
 */
public class ZalacznikiDTO extends IDDTO{

    private ZgloszeniaDTO idZgloszenia;
    private String nazwa;
    private String nazwaPliku;
    private MimeType mimetype;
    private BinariaDTO binaria;



    public ZgloszeniaDTO getIdZgloszenia() {
        return idZgloszenia;
    }

    public void setIdZgloszenia(ZgloszeniaDTO idZgloszenia) {
        this.idZgloszenia = idZgloszenia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwaPliku() {
        return nazwaPliku;
    }

    public void setNazwaPliku(String nazwaPliku) {
        this.nazwaPliku = nazwaPliku;
    }

    public MimeType getMimetype() {
        return mimetype;
    }

    public void setMimetype(MimeType mimetype) {
        this.mimetype = mimetype;
    }

    public BinariaDTO getBinaria() {
        return binaria;
    }

    public void setBinaria(BinariaDTO binaria) {
        this.binaria = binaria;
    }

    public ZalacznikiDTO(int id, ZgloszeniaDTO idZ, String nazwa, String nazwaPliku, MimeType mim, BinariaDTO binaria) {
        super(id);
        this.idZgloszenia=idZ;
        this.nazwa=nazwa;
        this.nazwaPliku=nazwaPliku;
        this.mimetype=mim;
        this.binaria=binaria;
    }
}
