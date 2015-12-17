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
public class DoctorPracticeEntityTest {

    private DoctorPracticeEntity doctorPracticeEntity = new DoctorPracticeEntity();


    @Test
    public void testGetMedsDoctorPracticeId() throws Exception {
        Long expected = 512L;
        doctorPracticeEntity.setMedsDoctorPracticeId(expected);
        Assert.assertEquals(expected,doctorPracticeEntity.getMedsDoctorPracticeId());
    }

    @Test
    public void testSetMedsDoctorPracticeId() throws Exception {
        Long expected = 512L;
        doctorPracticeEntity.setMedsDoctorPracticeId(expected);
        Assert.assertEquals(expected,doctorPracticeEntity.getMedsDoctorPracticeId());
    }


    @Test
    public void testGetPractice() throws Exception {
        PracticeEntity expected = new PracticeEntity();
        doctorPracticeEntity.setPractice(expected);
        Assert.assertEquals(expected,doctorPracticeEntity.getPractice());
    }

    @Test
    public void testSetPractice() throws Exception {
        PracticeEntity expected = new PracticeEntity();
        doctorPracticeEntity.setPractice(expected);
        Assert.assertEquals(expected,doctorPracticeEntity.getPractice());
    }


    @Test
    public void testGetDoctor() throws Exception {
        DoctorEntity expected = new DoctorEntity();
        doctorPracticeEntity.setDoctor(expected);
        Assert.assertEquals(expected,doctorPracticeEntity.getDoctor());
    }

    @Test
    public void testSetDoctor() throws Exception {
        DoctorEntity expected = new DoctorEntity();
        doctorPracticeEntity.setDoctor(expected);
        Assert.assertEquals(expected,doctorPracticeEntity.getDoctor());
    }



}