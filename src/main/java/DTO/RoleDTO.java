package DTO;

import java.util.List;

/**
 * Created by Bartek on 2016-03-16.
 */
public class RoleDTO extends IDDTO{

    private String nazwa;
    private List<UprawnieniaDTO> uprawnienia;


    public String getNazwa()
    {
        return nazwa;
    }

    public void setNazwa(String nazwa)
    {
        this.nazwa = nazwa;
    }

    public List<UprawnieniaDTO> getUprawnienia() {
        return uprawnienia;
    }

    public void setUprawnienia(List<UprawnieniaDTO> uprawnienia) {
        this.uprawnienia = uprawnienia;
    }

    public RoleDTO(int id, String nazwa, List<UprawnieniaDTO> uprawnienia)
    {
        super(id);
        this.uprawnienia=uprawnienia;
        this.nazwa=nazwa;
    }
}
