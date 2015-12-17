package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;
import org.hibernate.envers.Audited;

@Entity
@Audited
@Table(name = "MEDS_PRACTICE_USER")
public class PracticeUserEntity    {

    private Long practiceUserId;
    private UserEntity user;
    private PracticeEntity practice;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name="PRACTICE_USER_ID" , length=15 , nullable=false)
    public Long getPracticeUserId()   {
        return this.practiceUserId;
    }

    public void setPracticeUserId(Long practiceUserId)   {
        this.practiceUserId = practiceUserId;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USER_ID", referencedColumnName="USER_ID")
    public UserEntity getUser()   {
        return this.user;
    }

    public void setUser(UserEntity user)   {
        this.user = user;
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