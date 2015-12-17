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
public class DataContentEntityTest {

    private DataContentEntity dataContentEntity = new DataContentEntity();


    @Test
    public void testGetDataContentId() throws Exception {
        Long expected = 512L;
        dataContentEntity.setDataContentId(expected);
        Assert.assertEquals(expected,dataContentEntity.getDataContentId());
    }

    @Test
    public void testSetDataContentId() throws Exception {
        Long expected = 512L;
        dataContentEntity.setDataContentId(expected);
        Assert.assertEquals(expected,dataContentEntity.getDataContentId());
    }


    @Test
    public void testGetData() throws Exception {
        String expected = "this should be a long string";
        dataContentEntity.setData(expected);
        Assert.assertEquals(expected,dataContentEntity.getData());
    }

    @Test
    public void testSetData() throws Exception {
        String expected = "this should be a long string";
        dataContentEntity.setData(expected);
        Assert.assertEquals(expected,dataContentEntity.getData());
    }



    @Test
    public void testGetPracticeBios() throws Exception {
        dataContentEntity.setPracticeBios(new ArrayList());
        Assert.assertEquals(new ArrayList(),dataContentEntity.getPracticeBios());
    }

    @Test
    public void testSetPracticeBios() throws Exception {
        dataContentEntity.setPracticeBios(new ArrayList());
        Assert.assertEquals(new ArrayList(),dataContentEntity.getPracticeBios());
    }


    @Test
    public void testGetDoctorBios() throws Exception {
        dataContentEntity.setDoctorBios(new ArrayList());
        Assert.assertEquals(new ArrayList(),dataContentEntity.getDoctorBios());
    }

    @Test
    public void testSetDoctorBios() throws Exception {
        dataContentEntity.setDoctorBios(new ArrayList());
        Assert.assertEquals(new ArrayList(),dataContentEntity.getDoctorBios());
    }


    @Test
    public void testGetAppointmentNotes() throws Exception {
        dataContentEntity.setAppointmentNotes(new ArrayList());
        Assert.assertEquals(new ArrayList(),dataContentEntity.getAppointmentNotes());
    }

    @Test
    public void testSetAppointmentNotes() throws Exception {
        dataContentEntity.setAppointmentNotes(new ArrayList());
        Assert.assertEquals(new ArrayList(),dataContentEntity.getAppointmentNotes());
    }


}