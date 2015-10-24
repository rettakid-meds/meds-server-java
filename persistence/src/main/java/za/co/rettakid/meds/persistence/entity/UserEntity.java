package za.co.rettakid.meds.persistence.entity;

import javax.persistence.*;

@Entity
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


    @Id
    @GeneratedValue
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
    @Column(name="PASSWORD" , length=20 , nullable=false)
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
    @Column(name="USER_ALLOW_PUSH" , nullable=false)
    public Boolean getUserAllowPush()   {
        return this.userAllowPush;
    }

    public void setUserAllowPush(Boolean userAllowPush)   {
        this.userAllowPush = userAllowPush;
    }

}