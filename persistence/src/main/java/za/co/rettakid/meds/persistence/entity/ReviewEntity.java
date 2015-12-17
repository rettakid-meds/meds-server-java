package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;
import org.hibernate.envers.Audited;
import java.util.Date;

@Entity
@Audited
@Table(name = "MEDS_REVIEW")
public class ReviewEntity    {

    private Long reviewId;
    private DoctorEntity doctor;
    private UserEntity user;
    private Integer rating;
    private String comment;
    private Date effFrm;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name="REVIEW_ID" , length=15 , nullable=false)
    public Long getReviewId()   {
        return this.reviewId;
    }

    public void setReviewId(Long reviewId)   {
        this.reviewId = reviewId;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DOCTOR_ID", referencedColumnName="DOCTOR_ID")
    public DoctorEntity getDoctor()   {
        return this.doctor;
    }

    public void setDoctor(DoctorEntity doctor)   {
        this.doctor = doctor;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USER_ID", referencedColumnName="USER_ID")
    public UserEntity getUser()   {
        return this.user;
    }

    public void setUser(UserEntity user)   {
        this.user = user;
    }

    @Basic
    @Column(name="RATING" , length=1 , nullable=false)
    public Integer getRating()   {
        return this.rating;
    }

    public void setRating(Integer rating)   {
        this.rating = rating;
    }

    @Basic
    @Column(name="COMMENT" , length=255 , nullable=false)
    public String getComment()   {
        return this.comment;
    }

    public void setComment(String comment)   {
        this.comment = comment;
    }

    @Basic
    @Column(name="EFF_FRM" , length=0 , nullable=false)
    public Date getEffFrm()   {
        return this.effFrm;
    }

    public void setEffFrm(Date effFrm)   {
        this.effFrm = effFrm;
    }


}