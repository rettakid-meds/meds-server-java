package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;
import java.util.List;
import org.hibernate.envers.Audited;

@Entity
@Audited
@Table(name = "MEDS_USER")
public class UserEntity    {

    private Long userId;
    private String email;
    private String password;
    private String name;
    private String surname;
    private String phone;
    private String gender;
    private Integer age;
    private Boolean userAllowPush;
    private List<UserPermissionEntity> userPermissionUsers;
    private List<UserDeviceEntity> userDeviceUsers;
    private List<UserMedicalAidEntity> userMedicalAidUsers;
    private List<PracticeUserEntity> practiceUserUsers;
    private List<DoctorEntity> doctorUsers;
    private List<DoctorUserEntity> doctorUserUsers;
    private List<ReviewEntity> reviewUsers;
    private List<AppointmentEntity> appointmentUsers;
    private List<PrescriptionEntity> prescriptionUsers;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic
    @Column(name="USER_ID" , length=15 , nullable=false)
    public Long getUserId()   {
        return this.userId;
    }

    public void setUserId(Long userId)   {
        this.userId = userId;
    }

    @Basic
    @Column(name="EMAIL" , length=50 , nullable=false)
    public String getEmail()   {
        return this.email;
    }

    public void setEmail(String email)   {
        this.email = email;
    }

    @Basic
    @Column(name="PASSWORD" , length=255 , nullable=false)
    public String getPassword()   {
        return this.password;
    }

    public void setPassword(String password)   {
        this.password = password;
    }

    @Basic
    @Column(name="NAME" , length=20 , nullable=true)
    public String getName()   {
        return this.name;
    }

    public void setName(String name)   {
        this.name = name;
    }

    @Basic
    @Column(name="SURNAME" , length=20 , nullable=true)
    public String getSurname()   {
        return this.surname;
    }

    public void setSurname(String surname)   {
        this.surname = surname;
    }

    @Basic
    @Column(name="PHONE" , length=15 , nullable=true)
    public String getPhone()   {
        return this.phone;
    }

    public void setPhone(String phone)   {
        this.phone = phone;
    }

    @Basic
    @Column(name="GENDER" , length=9 , nullable=true)
    public String getGender()   {
        return this.gender;
    }

    public void setGender(String gender)   {
        this.gender = gender;
    }

    @Basic
    @Column(name="AGE" , length=4 , nullable=true)
    public Integer getAge()   {
        return this.age;
    }

    public void setAge(Integer age)   {
        this.age = age;
    }

    @Basic
    @Column(name="USER_ALLOW_PUSH" , length=0 , nullable=false)
    public Boolean getUserAllowPush()   {
        return this.userAllowPush;
    }

    public void setUserAllowPush(Boolean userAllowPush)   {
        this.userAllowPush = userAllowPush;
    }


    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    public List<UserPermissionEntity> getUserPermissionUsers()   {
        return this.userPermissionUsers;
    }

    public void setUserPermissionUsers(List<UserPermissionEntity> userPermissionUsers)   {
    this.userPermissionUsers = userPermissionUsers;
    }

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    public List<UserDeviceEntity> getUserDeviceUsers()   {
        return this.userDeviceUsers;
    }

    public void setUserDeviceUsers(List<UserDeviceEntity> userDeviceUsers)   {
    this.userDeviceUsers = userDeviceUsers;
    }

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    public List<UserMedicalAidEntity> getUserMedicalAidUsers()   {
        return this.userMedicalAidUsers;
    }

    public void setUserMedicalAidUsers(List<UserMedicalAidEntity> userMedicalAidUsers)   {
    this.userMedicalAidUsers = userMedicalAidUsers;
    }

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    public List<PracticeUserEntity> getPracticeUserUsers()   {
        return this.practiceUserUsers;
    }

    public void setPracticeUserUsers(List<PracticeUserEntity> practiceUserUsers)   {
    this.practiceUserUsers = practiceUserUsers;
    }

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    public List<DoctorEntity> getDoctorUsers()   {
        return this.doctorUsers;
    }

    public void setDoctorUsers(List<DoctorEntity> doctorUsers)   {
    this.doctorUsers = doctorUsers;
    }

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    public List<DoctorUserEntity> getDoctorUserUsers()   {
        return this.doctorUserUsers;
    }

    public void setDoctorUserUsers(List<DoctorUserEntity> doctorUserUsers)   {
    this.doctorUserUsers = doctorUserUsers;
    }

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    public List<ReviewEntity> getReviewUsers()   {
        return this.reviewUsers;
    }

    public void setReviewUsers(List<ReviewEntity> reviewUsers)   {
    this.reviewUsers = reviewUsers;
    }

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    public List<AppointmentEntity> getAppointmentUsers()   {
        return this.appointmentUsers;
    }

    public void setAppointmentUsers(List<AppointmentEntity> appointmentUsers)   {
    this.appointmentUsers = appointmentUsers;
    }

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    public List<PrescriptionEntity> getPrescriptionUsers()   {
        return this.prescriptionUsers;
    }

    public void setPrescriptionUsers(List<PrescriptionEntity> prescriptionUsers)   {
    this.prescriptionUsers = prescriptionUsers;
    }

}