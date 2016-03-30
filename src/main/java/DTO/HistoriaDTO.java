package DTO;

import org.apache.catalina.User;
import org.omg.CORBA.ULongSeqHelper;

import java.util.Date;
import java.util.List;

/**
 * Created by Bartek on 2016-03-17.
 */
public class HistoriaDTO extends IDDTO{

    private TypZgloszenia typ;
    private UserDTO uzytkownik;
    private ZgloszeniaDTO idZgloszenia;
    private UserDTO idUser;
    private String opis;
    private Date data;
    private List<ZalacznikiDTO> zalaczniki;

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



    public HistoriaDTO(int id, TypZgloszenia typ, ZgloszeniaDTO zglo, UserDTO idU, String opis, Date data){
        super(id);
        this.idZgloszenia=zglo;
        this.typ=typ;
        this.idUser=idU;
        this.opis=opis;
        this.data=data;


    }
}