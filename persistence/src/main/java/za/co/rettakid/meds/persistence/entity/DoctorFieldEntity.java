package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "MEDS_DOCTOR_FIELD")
public class DoctorFieldEntity    {

    private Long doctorFieldId;
    private FieldEntity field;
    private DoctorEntity doctor;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    public FieldEntity getField()   {
        return this.field;
    }

    public void setField(FieldEntity field)   {
        this.field = field;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DOCTOR_ID", referencedColumnName="DOCTOR_ID")
    public DoctorEntity getDoctor()   {
        return this.doctor;
    }

    public void setDoctor(DoctorEntity doctor)   {
        this.doctor = doctor;
    }

}