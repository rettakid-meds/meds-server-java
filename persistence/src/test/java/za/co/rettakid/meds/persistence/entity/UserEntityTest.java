package za.co.rettakid.meds.persistence.entity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/persistence-context-test.xml"})
@Transactional
public class UserEntityTest {

    private UserEntity userEntity = new UserEntity();


    @Test
    public void testGetUserId() throws Exception {
        Long expected = 512L;
        userEntity.setUserId(expected);
        Assert.assertEquals(expected,userEntity.getUserId());
    }

    @Test
    public void testSetUserId() throws Exception {
        Long expected = 512L;
        userEntity.setUserId(expected);
        Assert.assertEquals(expected,userEntity.getUserId());
    }


    @Test
    public void testGetEmail() throws Exception {
        String expected = "One Thousand";
        userEntity.setEmail(expected);
        Assert.assertEquals(expected,userEntity.getEmail());
    }

    @Test
    public void testSetEmail() throws Exception {
        String expected = "One Thousand";
        userEntity.setEmail(expected);
        Assert.assertEquals(expected,userEntity.getEmail());
    }


    @Test
    public void testGetPassword() throws Exception {
        String expected = "One Thousand";
        userEntity.setPassword(expected);
        Assert.assertEquals(expected,userEntity.getPassword());
    }

    @Test
    public void testSetPassword() throws Exception {
        String expected = "One Thousand";
        userEntity.setPassword(expected);
        Assert.assertEquals(expected,userEntity.getPassword());
    }


    @Test
    public void testGetName() throws Exception {
        String expected = "One Thousand";
        userEntity.setName(expected);
        Assert.assertEquals(expected,userEntity.getName());
    }

    @Test
    public void testSetName() throws Exception {
        String expected = "One Thousand";
        userEntity.setName(expected);
        Assert.assertEquals(expected,userEntity.getName());
    }


    @Test
    public void testGetSurname() throws Exception {
        String expected = "One Thousand";
        userEntity.setSurname(expected);
        Assert.assertEquals(expected,userEntity.getSurname());
    }

    @Test
    public void testSetSurname() throws Exception {
        String expected = "One Thousand";
        userEntity.setSurname(expected);
        Assert.assertEquals(expected,userEntity.getSurname());
    }


    @Test
    public void testGetPhone() throws Exception {
        String expected = "One Thousand";
        userEntity.setPhone(expected);
        Assert.assertEquals(expected,userEntity.getPhone());
    }

    @Test
    public void testSetPhone() throws Exception {
        String expected = "One Thousand";
        userEntity.setPhone(expected);
        Assert.assertEquals(expected,userEntity.getPhone());
    }


    @Test
    public void testGetGender() throws Exception {
        String expected = "One Thousand";
        userEntity.setGender(expected);
        Assert.assertEquals(expected,userEntity.getGender());
    }

    @Test
    public void testSetGender() throws Exception {
        String expected = "One Thousand";
        userEntity.setGender(expected);
        Assert.assertEquals(expected,userEntity.getGender());
    }


    @Test
    public void testGetAge() throws Exception {
        Integer expected = 256;
        userEntity.setAge(expected);
        Assert.assertEquals(expected,userEntity.getAge());
    }

    @Test
    public void testSetAge() throws Exception {
        Integer expected = 256;
        userEntity.setAge(expected);
        Assert.assertEquals(expected,userEntity.getAge());
    }


    @Test
    public void testGetUserAllowPush() throws Exception {
        Boolean expected = false;
        userEntity.setUserAllowPush(expected);
        Assert.assertEquals(expected,userEntity.getUserAllowPush());
    }

    @Test
    public void testSetUserAllowPush() throws Exception {
        Boolean expected = false;
        userEntity.setUserAllowPush(expected);
        Assert.assertEquals(expected,userEntity.getUserAllowPush());
    }



    @Test
    public void testGetUserPermissionUsers() throws Exception {
        userEntity.setUserPermissionUsers(new ArrayList());
        Assert.assertEquals(new ArrayList(),userEntity.getUserPermissionUsers());
    }

    @Test
    public void testSetUserPermissionUsers() throws Exception {
        userEntity.setUserPermissionUsers(new ArrayList());
        Assert.assertEquals(new ArrayList(),userEntity.getUserPermissionUsers());
    }


    @Test
    public void testGetUserDeviceUsers() throws Exception {
        userEntity.setUserDeviceUsers(new ArrayList());
        Assert.assertEquals(new ArrayList(),userEntity.getUserDeviceUsers());
    }

    @Test
    public void testSetUserDeviceUsers() throws Exception {
        userEntity.setUserDeviceUsers(new ArrayList());
        Assert.assertEquals(new ArrayList(),userEntity.getUserDeviceUsers());
    }


    @Test
    public void testGetUserMedicalAidUsers() throws Exception {
        userEntity.setUserMedicalAidUsers(new ArrayList());
        Assert.assertEquals(new ArrayList(),userEntity.getUserMedicalAidUsers());
    }

    @Test
    public void testSetUserMedicalAidUsers() throws Exception {
        userEntity.setUserMedicalAidUsers(new ArrayList());
        Assert.assertEquals(new ArrayList(),userEntity.getUserMedicalAidUsers());
    }


    @Test
    public void testGetPracticeUserUsers() throws Exception {
        userEntity.setPracticeUserUsers(new ArrayList());
        Assert.assertEquals(new ArrayList(),userEntity.getPracticeUserUsers());
    }

    @Test
    public void testSetPracticeUserUsers() throws Exception {
        userEntity.setPracticeUserUsers(new ArrayList());
        Assert.assertEquals(new ArrayList(),userEntity.getPracticeUserUsers());
    }


    @Test
    public void testGetDoctorUsers() throws Exception {
        userEntity.setDoctorUsers(new ArrayList());
        Assert.assertEquals(new ArrayList(),userEntity.getDoctorUsers());
    }

    @Test
    public void testSetDoctorUsers() throws Exception {
        userEntity.setDoctorUsers(new ArrayList());
        Assert.assertEquals(new ArrayList(),userEntity.getDoctorUsers());
    }


    @Test
    public void testGetDoctorUserUsers() throws Exception {
        userEntity.setDoctorUserUsers(new ArrayList());
        Assert.assertEquals(new ArrayList(),userEntity.getDoctorUserUsers());
    }

    @Test
    public void testSetDoctorUserUsers() throws Exception {
        userEntity.setDoctorUserUsers(new ArrayList());
        Assert.assertEquals(new ArrayList(),userEntity.getDoctorUserUsers());
    }


    @Test
    public void testGetReviewUsers() throws Exception {
        userEntity.setReviewUsers(new ArrayList());
        Assert.assertEquals(new ArrayList(),userEntity.getReviewUsers());
    }

    @Test
    public void testSetReviewUsers() throws Exception {
        userEntity.setReviewUsers(new ArrayList());
        Assert.assertEquals(new ArrayList(),userEntity.getReviewUsers());
    }


    @Test
    public void testGetAppointmentUsers() throws Exception {
        userEntity.setAppointmentUsers(new ArrayList());
        Assert.assertEquals(new ArrayList(),userEntity.getAppointmentUsers());
    }

    @Test
    public void testSetAppointmentUsers() throws Exception {
        userEntity.setAppointmentUsers(new ArrayList());
        Assert.assertEquals(new ArrayList(),userEntity.getAppointmentUsers());
    }


    @Test
    public void testGetPrescriptionUsers() throws Exception {
        userEntity.setPrescriptionUsers(new ArrayList());
        Assert.assertEquals(new ArrayList(),userEntity.getPrescriptionUsers());
    }

    @Test
    public void testSetPrescriptionUsers() throws Exception {
        userEntity.setPrescriptionUsers(new ArrayList());
        Assert.assertEquals(new ArrayList(),userEntity.getPrescriptionUsers());
    }


}