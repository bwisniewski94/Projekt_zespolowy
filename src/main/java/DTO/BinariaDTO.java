package DTO;

/**
 * Created by Bartek on 2016-03-17.
 */
public class BinariaDTO extends IDDTO {
    private ZalacznikiDTO zalacznik;

    public ZalacznikiDTO getZalcznik() {
        return zalacznik;
    }

    public void setZalcznik(ZalacznikiDTO zalcznik) {
        this.zalacznik = zalcznik;
    }

    public BinariaDTO(int id, ZalacznikiDTO zalacznik) {
       super(id);
        this.zalacznik=zalacznik;
    }
}
