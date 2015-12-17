package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;
import org.hibernate.envers.Audited;

@Entity
@Audited
@Table(name = "MEDS_DATA_CONTENT")
public class DataContentEntity    {

    private Long dataContentId;
    private String data;
    private List<PracticeEntity> practiceBios;
    private List<DoctorEntity> doctorBios;
    private List<AppointmentEntity> appointmentNotes;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name="DATA_CONTENT_ID" , length=15 , nullable=false)
    public Long getDataContentId()   {
        return this.dataContentId;
    }

    public void setDataContentId(Long dataContentId)   {
        this.dataContentId = dataContentId;
    }

    @Basic
    @Column(name="DATA" , length=0 , nullable=false)
    public String getData()   {
        return this.data;
    }

    public void setData(String data)   {
        this.data = data;
    }


    @OneToMany(mappedBy = "bio", fetch = FetchType.LAZY)
    public List<PracticeEntity> getPracticeBios()   {
        return this.practiceBios;
    }

    public void setPracticeBios(List<PracticeEntity> practiceBios)   {
    this.practiceBios = practiceBios;
    }

    @OneToMany(mappedBy = "bio", fetch = FetchType.LAZY)
    public List<DoctorEntity> getDoctorBios()   {
        return this.doctorBios;
    }

    public void setDoctorBios(List<DoctorEntity> doctorBios)   {
    this.doctorBios = doctorBios;
    }

    @OneToMany(mappedBy = "note", fetch = FetchType.LAZY)
    public List<AppointmentEntity> getAppointmentNotes()   {
        return this.appointmentNotes;
    }

    public void setAppointmentNotes(List<AppointmentEntity> appointmentNotes)   {
    this.appointmentNotes = appointmentNotes;
    }

}