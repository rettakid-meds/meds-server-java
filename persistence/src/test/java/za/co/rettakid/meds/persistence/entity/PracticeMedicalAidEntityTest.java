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
public class PracticeMedicalAidEntityTest {

    private PracticeMedicalAidEntity practiceMedicalAidEntity = new PracticeMedicalAidEntity();


    @Test
    public void testGetPracticeMedicalAidId() throws Exception {
        Long expected = 512L;
        practiceMedicalAidEntity.setPracticeMedicalAidId(expected);
        Assert.assertEquals(expected,practiceMedicalAidEntity.getPracticeMedicalAidId());
    }

    @Test
    public void testSetPracticeMedicalAidId() throws Exception {
        Long expected = 512L;
        practiceMedicalAidEntity.setPracticeMedicalAidId(expected);
        Assert.assertEquals(expected,practiceMedicalAidEntity.getPracticeMedicalAidId());
    }


    @Test
    public void testGetPractice() throws Exception {
        PracticeEntity expected = new PracticeEntity();
        practiceMedicalAidEntity.setPractice(expected);
        Assert.assertEquals(expected,practiceMedicalAidEntity.getPractice());
    }

    @Test
    public void testSetPractice() throws Exception {
        PracticeEntity expected = new PracticeEntity();
        practiceMedicalAidEntity.setPractice(expected);
        Assert.assertEquals(expected,practiceMedicalAidEntity.getPractice());
    }


    @Test
    public void testGetMedicalAid() throws Exception {
        MedicalAidEntity expected = new MedicalAidEntity();
        practiceMedicalAidEntity.setMedicalAid(expected);
        Assert.assertEquals(expected,practiceMedicalAidEntity.getMedicalAid());
    }

    @Test
    public void testSetMedicalAid() throws Exception {
        MedicalAidEntity expected = new MedicalAidEntity();
        practiceMedicalAidEntity.setMedicalAid(expected);
        Assert.assertEquals(expected,practiceMedicalAidEntity.getMedicalAid());
    }



}