package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "MEDS_DATA_CONTENT")
public class DataContentEntity    {

    private Long dataContentId;
    private String data;


    @Id
    @GeneratedValue
    @Basic
    @Column(name="DATA_CONTENT_ID" , length=15 , nullable=false)
    public Long getDataContentId()   {
        return this.dataContentId;
    }

    public void setDataContentId(Long dataContentId)   {
        this.dataContentId = dataContentId;
    }

    @Basic
    @Column(name="DATA" , nullable=false)
    public String getData()   {
        return this.data;
    }

    public void setData(String data)   {
        this.data = data;
    }

}