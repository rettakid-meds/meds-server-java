package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "userdto")
public class UserDto    {

    private Long userId;
    private String email;
    private String password;
    private String name;
    private String surname;
    private String phone;
    private String gender;
    private Integer age;
    private Boolean userAllowPush;
    private UserPermissionListDto userPermissionUsers;
    private UserDeviceListDto userDeviceUsers;
    private UserMedicalAidListDto userMedicalAidUsers;
    private PracticeUserListDto practiceUserUsers;
    private DoctorListDto doctorUsers;
    private DoctorUserListDto doctorUserUsers;
    private AppointmentListDto appointmentUsers;
    private PrescriptionListDto prescriptionUsers;

    public Long getUserId()   {
        return this.userId;
    }

    @XmlElement(name = "userid" , required = false)
    public void setUserId(Long userId)   {
        this.userId = userId;
    }

    public String getEmail()   {
        return this.email;
    }

    @XmlElement(name = "email")
    public void setEmail(String email)   {
        this.email = email;
    }

    public String getPassword()   {
        return this.password;
    }

    @XmlElement(name = "password")
    public void setPassword(String password)   {
        this.password = password;
    }

    public String getName()   {
        return this.name;
    }

    @XmlElement(name = "name" , required = false)
    public void setName(String name)   {
        this.name = name;
    }

    public String getSurname()   {
        return this.surname;
    }

    @XmlElement(name = "surname" , required = false)
    public void setSurname(String surname)   {
        this.surname = surname;
    }

    public String getPhone()   {
        return this.phone;
    }

    @XmlElement(name = "phone" , required = false)
    public void setPhone(String phone)   {
        this.phone = phone;
    }

    public String getGender()   {
        return this.gender;
    }

    @XmlElement(name = "gender" , required = false)
    public void setGender(String gender)   {
        this.gender = gender;
    }

    public Integer getAge()   {
        return this.age;
    }

    @XmlElement(name = "age" , required = false)
    public void setAge(Integer age)   {
        this.age = age;
    }

    public Boolean getUserAllowPush()   {
        return this.userAllowPush;
    }

    @XmlElement(name = "userallowpush")
    public void setUserAllowPush(Boolean userAllowPush)   {
        this.userAllowPush = userAllowPush;
    }


    public UserPermissionListDto getUserPermissionUsers()   {
        return this.userPermissionUsers;
    }

    public void setUserPermissionUsers(UserPermissionListDto userPermissionUsers)   {
        this.userPermissionUsers = userPermissionUsers;
    }

    public UserDeviceListDto getUserDeviceUsers()   {
        return this.userDeviceUsers;
    }

    public void setUserDeviceUsers(UserDeviceListDto userDeviceUsers)   {
        this.userDeviceUsers = userDeviceUsers;
    }

    public UserMedicalAidListDto getUserMedicalAidUsers()   {
        return this.userMedicalAidUsers;
    }

    public void setUserMedicalAidUsers(UserMedicalAidListDto userMedicalAidUsers)   {
        this.userMedicalAidUsers = userMedicalAidUsers;
    }

    public PracticeUserListDto getPracticeUserUsers()   {
        return this.practiceUserUsers;
    }

    public void setPracticeUserUsers(PracticeUserListDto practiceUserUsers)   {
        this.practiceUserUsers = practiceUserUsers;
    }

    public DoctorListDto getDoctorUsers()   {
        return this.doctorUsers;
    }

    public void setDoctorUsers(DoctorListDto doctorUsers)   {
        this.doctorUsers = doctorUsers;
    }

    public DoctorUserListDto getDoctorUserUsers()   {
        return this.doctorUserUsers;
    }

    public void setDoctorUserUsers(DoctorUserListDto doctorUserUsers)   {
        this.doctorUserUsers = doctorUserUsers;
    }

    public AppointmentListDto getAppointmentUsers()   {
        return this.appointmentUsers;
    }

    public void setAppointmentUsers(AppointmentListDto appointmentUsers)   {
        this.appointmentUsers = appointmentUsers;
    }

    public PrescriptionListDto getPrescriptionUsers()   {
        return this.prescriptionUsers;
    }

    public void setPrescriptionUsers(PrescriptionListDto prescriptionUsers)   {
        this.prescriptionUsers = prescriptionUsers;
    }

}