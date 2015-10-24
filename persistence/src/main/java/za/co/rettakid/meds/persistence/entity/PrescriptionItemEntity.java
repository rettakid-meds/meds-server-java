package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "MEDS_PRESCRIPTION_ITEM")
public class PrescriptionItemEntity    {

    private Long prescriptionItemId;
    private PrescriptionEntity prescriptionEntity;
    private String name;


    @Id
    @GeneratedValue
    @Basic
    @Column(name="PRESCRIPTION_ITEM_ID" , length=15 , nullable=false)
    public Long getPrescriptionItemId()   {
        return this.prescriptionItemId;
    }

    public void setPrescriptionItemId(Long prescriptionItemId)   {
        this.prescriptionItemId = prescriptionItemId;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PRESCRIPTION_ID", referencedColumnName="PRESCRIPTION_ID")
    public PrescriptionEntity getPrescriptionEntity()   {
        return this.prescriptionEntity;
    }

    public void setPrescriptionEntity(PrescriptionEntity prescriptionEntity)   {
        this.prescriptionEntity = prescriptionEntity;
    }

    @Basic
    @Column(name="NAME" , length=50 , nullable=false)
    public String getName()   {
        return this.name;
    }

    public void setName(String name)   {
        this.name = name;
    }

}