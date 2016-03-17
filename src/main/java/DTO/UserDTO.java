package DTO;

import javax.management.relation.Role;
import java.util.List;

/**
 * Created by Bartek on 2016-03-16.
 */
public class UserDTO extends IDDTO
{

    private String nazwa;
    private String email;
    private String MD5Pass;
    private aktywnosc status;
    private List<RoleDTO> role;


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMD5Pass() {
        return MD5Pass;
    }

    public void setMD5Pass(String MD5Pass) {
        this.MD5Pass = MD5Pass;
    }

    public aktywnosc getStatus() {
        return status;
    }

    public void setStatus(aktywnosc status) {
        this.status = status;
    }

    public List<RoleDTO> getRole() {
        return role;
    }

    public void setRole(List<RoleDTO> role) {
        this.role = role;
    }

    public UserDTO(int id, String nazwa, String email, String MD5Pass, aktywnosc akty, List<RoleDTO> role)
    {
        super(id);
        this.nazwa=nazwa;
        this.email=email;
        this.MD5Pass=MD5Pass;
        this.status=akty;
        this.role=role;
    }
}
