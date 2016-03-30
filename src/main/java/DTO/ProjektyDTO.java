package DTO;

import org.apache.catalina.User;

import java.util.List;

/**
 * Created by Bartek on 2016-03-16.
 */
public class ProjektyDTO extends IDDTO {
    private String nazwa;
    private String opis;
    private String wersja;
    private List<UserDTO> users;
    private Opis_PriorytetuDTO priorytet;
    private List<ZgloszeniaDTO> listaZgloszen;

    public List<ZgloszeniaDTO> getListaZgloszen() {
        return listaZgloszen;
    }

    public void setListaZgloszen(List<ZgloszeniaDTO> listaZgloszen) {
        this.listaZgloszen = listaZgloszen;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getWersja() {
        return wersja;
    }

    public void setWersja(String wersja) {
        this.wersja = wersja;
    }

    public List<UserDTO> getUsers() {
        return users;
    }

    public void setUsers(List<UserDTO> users) {
        this.users = users;
    }

    public Opis_PriorytetuDTO getPriorytet() {
        return priorytet;
    }

    public void setPriorytet(Opis_PriorytetuDTO priorytet) {
        this.priorytet = priorytet;
    }

    public ProjektyDTO(int id, String nazwa, String opis, String wersja, List<UserDTO> users,Opis_PriorytetuDTO prio,List<ZgloszeniaDTO> listaZgloszen ) {
        super(id);
        this.nazwa=nazwa;
        this.opis=opis;
        this.wersja=wersja;
        this.users=users;
        this.priorytet=prio;
        this.listaZgloszen=listaZgloszen;
    }
}
