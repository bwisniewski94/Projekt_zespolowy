package DTO;

import javax.activation.MimeType;

/**
 * Created by Bartek on 2016-03-17.
 */
public class ZalacznikiDTO extends IDDTO{

    private ZgloszeniaDTO idZgloszenia;
    private UserDTO uzytkownik;
    private String nazwa;
    private String nazwaPliku;
    private MimeType mimetype;
    private int idbinaria;


    public UserDTO getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(UserDTO uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

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

    public int getIdbinaria() {
        return idbinaria;
    }

    public void setIdbinaria(int idbinaria) {
        this.idbinaria = idbinaria;
    }

    public ZalacznikiDTO(int id, UserDTO uzytkownik, ZgloszeniaDTO idZ, String nazwa, String nazwaPliku, MimeType mim, int binaria) {
        super(id);
        this.uzytkownik=uzytkownik;
        this.idZgloszenia=idZ;
        this.nazwa=nazwa;
        this.nazwaPliku=nazwaPliku;
        this.mimetype=mim;
        this.idbinaria=binaria;

    }
}
