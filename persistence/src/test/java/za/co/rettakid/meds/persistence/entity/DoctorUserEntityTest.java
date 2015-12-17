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
public class DoctorUserEntityTest {

    private DoctorUserEntity doctorUserEntity = new DoctorUserEntity();


    @Test
    public void testGetDoctorUserId() throws Exception {
        Long expected = 512L;
        doctorUserEntity.setDoctorUserId(expected);
        Assert.assertEquals(expected,doctorUserEntity.getDoctorUserId());
    }

    @Test
    public void testSetDoctorUserId() throws Exception {
        Long expected = 512L;
        doctorUserEntity.setDoctorUserId(expected);
        Assert.assertEquals(expected,doctorUserEntity.getDoctorUserId());
    }


    @Test
    public void testGetUser() throws Exception {
        UserEntity expected = new UserEntity();
        doctorUserEntity.setUser(expected);
        Assert.assertEquals(expected,doctorUserEntity.getUser());
    }

    @Test
    public void testSetUser() throws Exception {
        UserEntity expected = new UserEntity();
        doctorUserEntity.setUser(expected);
        Assert.assertEquals(expected,doctorUserEntity.getUser());
    }


    @Test
    public void testGetDoctor() throws Exception {
        DoctorEntity expected = new DoctorEntity();
        doctorUserEntity.setDoctor(expected);
        Assert.assertEquals(expected,doctorUserEntity.getDoctor());
    }

    @Test
    public void testSetDoctor() throws Exception {
        DoctorEntity expected = new DoctorEntity();
        doctorUserEntity.setDoctor(expected);
        Assert.assertEquals(expected,doctorUserEntity.getDoctor());
    }



}