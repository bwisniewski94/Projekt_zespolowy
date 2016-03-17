package DTO;

import javax.management.relation.Role;
import java.util.List;

/**
 * Created by Bartek on 2016-03-16.
 */
public class UprawnieniaDTO extends IDDTO
{

    private String nazwa;
    private List<RoleDTO> role;


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<RoleDTO> getRole() {
        return role;
    }

    public void setRole(List<RoleDTO> role) {
        this.role = role;
    }

    public UprawnieniaDTO(int id, String nazwa, List<RoleDTO> role) {
        super(id);
        this.nazwa=nazwa;
        this.role=role;
    }
}
