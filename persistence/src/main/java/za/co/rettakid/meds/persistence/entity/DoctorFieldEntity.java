package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "MEDS_DOCTOR_FIELD")
public class DoctorFieldEntity    {

    private Long doctorFieldId;
    private FieldEntity fieldEntity;
    private DoctorEntity doctorEntity;


    @Id
    @GeneratedValue
    @Basic
    @Column(name="DOCTOR_FIELD_ID" , length=15 , nullable=false)
    public Long getDoctorFieldId()   {
        return this.doctorFieldId;
    }

    public void setDoctorFieldId(Long doctorFieldId)   {
        this.doctorFieldId = doctorFieldId;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FIELD_ID", referencedColumnName="FIELD_ID")
    public FieldEntity getFieldEntity()   {
        return this.fieldEntity;
    }

    public void setFieldEntity(FieldEntity fieldEntity)   {
        this.fieldEntity = fieldEntity;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DOCTOR_ID", referencedColumnName="DOCTOR_ID")
    public DoctorEntity getDoctorEntity()   {
        return this.doctorEntity;
    }

    public void setDoctorEntity(DoctorEntity doctorEntity)   {
        this.doctorEntity = doctorEntity;
    }

}