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
public class DoctorFieldEntityTest {

    private DoctorFieldEntity doctorFieldEntity = new DoctorFieldEntity();


    @Test
    public void testGetDoctorFieldId() throws Exception {
        Long expected = 512L;
        doctorFieldEntity.setDoctorFieldId(expected);
        Assert.assertEquals(expected,doctorFieldEntity.getDoctorFieldId());
    }

    @Test
    public void testSetDoctorFieldId() throws Exception {
        Long expected = 512L;
        doctorFieldEntity.setDoctorFieldId(expected);
        Assert.assertEquals(expected,doctorFieldEntity.getDoctorFieldId());
    }


    @Test
    public void testGetField() throws Exception {
        FieldEntity expected = new FieldEntity();
        doctorFieldEntity.setField(expected);
        Assert.assertEquals(expected,doctorFieldEntity.getField());
    }

    @Test
    public void testSetField() throws Exception {
        FieldEntity expected = new FieldEntity();
        doctorFieldEntity.setField(expected);
        Assert.assertEquals(expected,doctorFieldEntity.getField());
    }


    @Test
    public void testGetDoctor() throws Exception {
        DoctorEntity expected = new DoctorEntity();
        doctorFieldEntity.setDoctor(expected);
        Assert.assertEquals(expected,doctorFieldEntity.getDoctor());
    }

    @Test
    public void testSetDoctor() throws Exception {
        DoctorEntity expected = new DoctorEntity();
        doctorFieldEntity.setDoctor(expected);
        Assert.assertEquals(expected,doctorFieldEntity.getDoctor());
    }



}