package DTO;

import java.util.Date;

/**
 * Created by Bartek on 2016-03-17.
 */
public class HistoriaDTO extends IDDTO{

    private TypZgloszenia typ;
    private ZgloszeniaDTO idZgloszenia;
    private UserDTO idUser;
    private String opis;
    private Date data;
    private ZgloszenieWewDTO zgloszenieWew;


    public TypZgloszenia getTyp() {
        return typ;
    }

    public void setTyp(TypZgloszenia typ) {
        this.typ = typ;
    }

    public ZgloszeniaDTO getIdZgloszenia() {
        return idZgloszenia;
    }

    public void setIdZgloszenia(ZgloszeniaDTO idZgloszenia) {
        this.idZgloszenia = idZgloszenia;
    }

    public UserDTO getIdUser() {
        return idUser;
    }

    public void setIdUser(UserDTO idUser) {
        this.idUser = idUser;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ZgloszenieWewDTO getZgloszenieWew() {
        return zgloszenieWew;
    }

    public void setZgloszenieWew(ZgloszenieWewDTO zgloszenieWew) {
        this.zgloszenieWew = zgloszenieWew;
    }

    public HistoriaDTO(int id, TypZgloszenia typ, ZgloszeniaDTO zglo, UserDTO idU, String opis, Date data, ZgloszenieWewDTO zgloszenie){
        super(id);
        this.idZgloszenia=zglo;
        this.typ=typ;
        this.idUser=idU;
        this.opis=opis;
        this.data=data;
        this.zgloszenieWew=zgloszenie;

    }
}