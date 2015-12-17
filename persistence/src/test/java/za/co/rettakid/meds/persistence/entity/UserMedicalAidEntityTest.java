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
public class UserMedicalAidEntityTest {

    private UserMedicalAidEntity userMedicalAidEntity = new UserMedicalAidEntity();


    @Test
    public void testGetUserMedicalAidId() throws Exception {
        Long expected = 512L;
        userMedicalAidEntity.setUserMedicalAidId(expected);
        Assert.assertEquals(expected,userMedicalAidEntity.getUserMedicalAidId());
    }

    @Test
    public void testSetUserMedicalAidId() throws Exception {
        Long expected = 512L;
        userMedicalAidEntity.setUserMedicalAidId(expected);
        Assert.assertEquals(expected,userMedicalAidEntity.getUserMedicalAidId());
    }


    @Test
    public void testGetUser() throws Exception {
        UserEntity expected = new UserEntity();
        userMedicalAidEntity.setUser(expected);
        Assert.assertEquals(expected,userMedicalAidEntity.getUser());
    }

    @Test
    public void testSetUser() throws Exception {
        UserEntity expected = new UserEntity();
        userMedicalAidEntity.setUser(expected);
        Assert.assertEquals(expected,userMedicalAidEntity.getUser());
    }


    @Test
    public void testGetMedicalAid() throws Exception {
        MedicalAidEntity expected = new MedicalAidEntity();
        userMedicalAidEntity.setMedicalAid(expected);
        Assert.assertEquals(expected,userMedicalAidEntity.getMedicalAid());
    }

    @Test
    public void testSetMedicalAid() throws Exception {
        MedicalAidEntity expected = new MedicalAidEntity();
        userMedicalAidEntity.setMedicalAid(expected);
        Assert.assertEquals(expected,userMedicalAidEntity.getMedicalAid());
    }



}