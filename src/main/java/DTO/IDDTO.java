package DTO;

import org.springframework.data.annotation.LastModifiedDate;

import javax.print.attribute.standard.DateTimeAtCreation;
import java.util.Date;

/**
 * Created by Bartek on 2016-03-16.
 */
public class IDDTO
{
    private int id;
    private Date dataUtworzenia;
    private Date dataModyfikacji;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IDDTO(int i)
    {
        this.id=i;

    }
}
