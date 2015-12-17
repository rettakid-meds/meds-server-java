package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;
import org.hibernate.envers.Audited;

@Entity
@Audited
@Table(name = "MEDS_FIELD")
public class FieldEntity    {

    private Long fieldId;
    private String name;
    private String mapColor;
    private List<PracticeFieldEntity> practiceFieldFields;
    private List<DoctorFieldEntity> doctorFieldFields;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name="FIELD_ID" , length=15 , nullable=false)
    public Long getFieldId()   {
        return this.fieldId;
    }

    public void setFieldId(Long fieldId)   {
        this.fieldId = fieldId;
    }

    @Basic
    @Column(name="NAME" , length=20 , nullable=false)
    public String getName()   {
        return this.name;
    }

    public void setName(String name)   {
        this.name = name;
    }

    @Basic
    @Column(name="MAP_COLOR" , length=6 , nullable=false)
    public String getMapColor()   {
        return this.mapColor;
    }

    public void setMapColor(String mapColor)   {
        this.mapColor = mapColor;
    }


    @OneToMany(mappedBy = "field", fetch = FetchType.LAZY)
    public List<PracticeFieldEntity> getPracticeFieldFields()   {
        return this.practiceFieldFields;
    }

    public void setPracticeFieldFields(List<PracticeFieldEntity> practiceFieldFields)   {
    this.practiceFieldFields = practiceFieldFields;
    }

    @OneToMany(mappedBy = "field", fetch = FetchType.LAZY)
    public List<DoctorFieldEntity> getDoctorFieldFields()   {
        return this.doctorFieldFields;
    }

    public void setDoctorFieldFields(List<DoctorFieldEntity> doctorFieldFields)   {
    this.doctorFieldFields = doctorFieldFields;
    }

}