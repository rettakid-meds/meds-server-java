package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "MEDS_PRACTICE_FIELD")
public class PracticeFieldEntity    {

    private Long practiceFieldId;
    private FieldEntity fieldEntity;
    private PracticeEntity practiceEntity;


    @Id
    @GeneratedValue
    @Basic
    @Column(name="PRACTICE_FIELD_ID" , length=15 , nullable=false)
    public Long getPracticeFieldId()   {
        return this.practiceFieldId;
    }

    public void setPracticeFieldId(Long practiceFieldId)   {
        this.practiceFieldId = practiceFieldId;
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
    @JoinColumn(name="PRACTICE_ID", referencedColumnName="PRACTICE_ID")
    public PracticeEntity getPracticeEntity()   {
        return this.practiceEntity;
    }

    public void setPracticeEntity(PracticeEntity practiceEntity)   {
        this.practiceEntity = practiceEntity;
    }

}