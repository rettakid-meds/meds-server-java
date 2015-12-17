package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;
import org.hibernate.envers.Audited;

@Entity
@Audited
@Table(name = "MEDS_PRACTICE_FIELD")
public class PracticeFieldEntity    {

    private Long practiceFieldId;
    private FieldEntity field;
    private PracticeEntity practice;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    public FieldEntity getField()   {
        return this.field;
    }

    public void setField(FieldEntity field)   {
        this.field = field;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PRACTICE_ID", referencedColumnName="PRACTICE_ID")
    public PracticeEntity getPractice()   {
        return this.practice;
    }

    public void setPractice(PracticeEntity practice)   {
        this.practice = practice;
    }


}