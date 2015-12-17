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
public class MedicalAidEntityTest {

    private MedicalAidEntity medicalAidEntity = new MedicalAidEntity();


    @Test
    public void testGetMedicalAidId() throws Exception {
        Long expected = 512L;
        medicalAidEntity.setMedicalAidId(expected);
        Assert.assertEquals(expected,medicalAidEntity.getMedicalAidId());
    }

    @Test
    public void testSetMedicalAidId() throws Exception {
        Long expected = 512L;
        medicalAidEntity.setMedicalAidId(expected);
        Assert.assertEquals(expected,medicalAidEntity.getMedicalAidId());
    }


    @Test
    public void testGetMedicalAidName() throws Exception {
        Long expected = 512L;
        medicalAidEntity.setMedicalAidName(expected);
        Assert.assertEquals(expected,medicalAidEntity.getMedicalAidName());
    }

    @Test
    public void testSetMedicalAidName() throws Exception {
        Long expected = 512L;
        medicalAidEntity.setMedicalAidName(expected);
        Assert.assertEquals(expected,medicalAidEntity.getMedicalAidName());
    }



    @Test
    public void testGetUserMedicalAidMedicalAids() throws Exception {
        medicalAidEntity.setUserMedicalAidMedicalAids(new ArrayList());
        Assert.assertEquals(new ArrayList(),medicalAidEntity.getUserMedicalAidMedicalAids());
    }

    @Test
    public void testSetUserMedicalAidMedicalAids() throws Exception {
        medicalAidEntity.setUserMedicalAidMedicalAids(new ArrayList());
        Assert.assertEquals(new ArrayList(),medicalAidEntity.getUserMedicalAidMedicalAids());
    }


    @Test
    public void testGetPracticeMedicalAidMedicalAids() throws Exception {
        medicalAidEntity.setPracticeMedicalAidMedicalAids(new ArrayList());
        Assert.assertEquals(new ArrayList(),medicalAidEntity.getPracticeMedicalAidMedicalAids());
    }

    @Test
    public void testSetPracticeMedicalAidMedicalAids() throws Exception {
        medicalAidEntity.setPracticeMedicalAidMedicalAids(new ArrayList());
        Assert.assertEquals(new ArrayList(),medicalAidEntity.getPracticeMedicalAidMedicalAids());
    }


}