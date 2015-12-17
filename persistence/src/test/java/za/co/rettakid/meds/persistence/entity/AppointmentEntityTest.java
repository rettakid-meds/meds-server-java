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
public class AppointmentEntityTest {

    private AppointmentEntity appointmentEntity = new AppointmentEntity();


    @Test
    public void testGetAppointmentId() throws Exception {
        Long expected = 512L;
        appointmentEntity.setAppointmentId(expected);
        Assert.assertEquals(expected,appointmentEntity.getAppointmentId());
    }

    @Test
    public void testSetAppointmentId() throws Exception {
        Long expected = 512L;
        appointmentEntity.setAppointmentId(expected);
        Assert.assertEquals(expected,appointmentEntity.getAppointmentId());
    }


    @Test
    public void testGetDoctor() throws Exception {
        DoctorEntity expected = new DoctorEntity();
        appointmentEntity.setDoctor(expected);
        Assert.assertEquals(expected,appointmentEntity.getDoctor());
    }

    @Test
    public void testSetDoctor() throws Exception {
        DoctorEntity expected = new DoctorEntity();
        appointmentEntity.setDoctor(expected);
        Assert.assertEquals(expected,appointmentEntity.getDoctor());
    }


    @Test
    public void testGetUser() throws Exception {
        UserEntity expected = new UserEntity();
        appointmentEntity.setUser(expected);
        Assert.assertEquals(expected,appointmentEntity.getUser());
    }

    @Test
    public void testSetUser() throws Exception {
        UserEntity expected = new UserEntity();
        appointmentEntity.setUser(expected);
        Assert.assertEquals(expected,appointmentEntity.getUser());
    }


    @Test
    public void testGetNote() throws Exception {
        DataContentEntity expected = new DataContentEntity();
        appointmentEntity.setNote(expected);
        Assert.assertEquals(expected,appointmentEntity.getNote());
    }

    @Test
    public void testSetNote() throws Exception {
        DataContentEntity expected = new DataContentEntity();
        appointmentEntity.setNote(expected);
        Assert.assertEquals(expected,appointmentEntity.getNote());
    }


    @Test
    public void testGetExpectedFrm() throws Exception {
        Date expected = new Date();
        appointmentEntity.setExpectedFrm(expected);
        Assert.assertEquals(expected,appointmentEntity.getExpectedFrm());
    }

    @Test
    public void testSetExpectedFrm() throws Exception {
        Date expected = new Date();
        appointmentEntity.setExpectedFrm(expected);
        Assert.assertEquals(expected,appointmentEntity.getExpectedFrm());
    }


    @Test
    public void testGetExpectedTo() throws Exception {
        Date expected = new Date();
        appointmentEntity.setExpectedTo(expected);
        Assert.assertEquals(expected,appointmentEntity.getExpectedTo());
    }

    @Test
    public void testSetExpectedTo() throws Exception {
        Date expected = new Date();
        appointmentEntity.setExpectedTo(expected);
        Assert.assertEquals(expected,appointmentEntity.getExpectedTo());
    }


    @Test
    public void testGetActualFrm() throws Exception {
        Date expected = new Date();
        appointmentEntity.setActualFrm(expected);
        Assert.assertEquals(expected,appointmentEntity.getActualFrm());
    }

    @Test
    public void testSetActualFrm() throws Exception {
        Date expected = new Date();
        appointmentEntity.setActualFrm(expected);
        Assert.assertEquals(expected,appointmentEntity.getActualFrm());
    }


    @Test
    public void testGetActualTo() throws Exception {
        Date expected = new Date();
        appointmentEntity.setActualTo(expected);
        Assert.assertEquals(expected,appointmentEntity.getActualTo());
    }

    @Test
    public void testSetActualTo() throws Exception {
        Date expected = new Date();
        appointmentEntity.setActualTo(expected);
        Assert.assertEquals(expected,appointmentEntity.getActualTo());
    }



    @Test
    public void testGetPrescriptionAppointments() throws Exception {
        appointmentEntity.setPrescriptionAppointments(new ArrayList());
        Assert.assertEquals(new ArrayList(),appointmentEntity.getPrescriptionAppointments());
    }

    @Test
    public void testSetPrescriptionAppointments() throws Exception {
        appointmentEntity.setPrescriptionAppointments(new ArrayList());
        Assert.assertEquals(new ArrayList(),appointmentEntity.getPrescriptionAppointments());
    }


}