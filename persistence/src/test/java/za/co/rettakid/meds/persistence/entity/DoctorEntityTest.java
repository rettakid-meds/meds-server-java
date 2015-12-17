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
public class DoctorEntityTest {

    private DoctorEntity doctorEntity = new DoctorEntity();


    @Test
    public void testGetDoctorId() throws Exception {
        Long expected = 512L;
        doctorEntity.setDoctorId(expected);
        Assert.assertEquals(expected,doctorEntity.getDoctorId());
    }

    @Test
    public void testSetDoctorId() throws Exception {
        Long expected = 512L;
        doctorEntity.setDoctorId(expected);
        Assert.assertEquals(expected,doctorEntity.getDoctorId());
    }


    @Test
    public void testGetUser() throws Exception {
        UserEntity expected = new UserEntity();
        doctorEntity.setUser(expected);
        Assert.assertEquals(expected,doctorEntity.getUser());
    }

    @Test
    public void testSetUser() throws Exception {
        UserEntity expected = new UserEntity();
        doctorEntity.setUser(expected);
        Assert.assertEquals(expected,doctorEntity.getUser());
    }


    @Test
    public void testGetIcon() throws Exception {
        ImageEntity expected = new ImageEntity();
        doctorEntity.setIcon(expected);
        Assert.assertEquals(expected,doctorEntity.getIcon());
    }

    @Test
    public void testSetIcon() throws Exception {
        ImageEntity expected = new ImageEntity();
        doctorEntity.setIcon(expected);
        Assert.assertEquals(expected,doctorEntity.getIcon());
    }


    @Test
    public void testGetImage() throws Exception {
        ImageEntity expected = new ImageEntity();
        doctorEntity.setImage(expected);
        Assert.assertEquals(expected,doctorEntity.getImage());
    }

    @Test
    public void testSetImage() throws Exception {
        ImageEntity expected = new ImageEntity();
        doctorEntity.setImage(expected);
        Assert.assertEquals(expected,doctorEntity.getImage());
    }


    @Test
    public void testGetTradingDay() throws Exception {
        TradingDayEntity expected = new TradingDayEntity();
        doctorEntity.setTradingDay(expected);
        Assert.assertEquals(expected,doctorEntity.getTradingDay());
    }

    @Test
    public void testSetTradingDay() throws Exception {
        TradingDayEntity expected = new TradingDayEntity();
        doctorEntity.setTradingDay(expected);
        Assert.assertEquals(expected,doctorEntity.getTradingDay());
    }


    @Test
    public void testGetBio() throws Exception {
        DataContentEntity expected = new DataContentEntity();
        doctorEntity.setBio(expected);
        Assert.assertEquals(expected,doctorEntity.getBio());
    }

    @Test
    public void testSetBio() throws Exception {
        DataContentEntity expected = new DataContentEntity();
        doctorEntity.setBio(expected);
        Assert.assertEquals(expected,doctorEntity.getBio());
    }


    @Test
    public void testGetEffFrm() throws Exception {
        Date expected = new Date();
        doctorEntity.setEffFrm(expected);
        Assert.assertEquals(expected,doctorEntity.getEffFrm());
    }

    @Test
    public void testSetEffFrm() throws Exception {
        Date expected = new Date();
        doctorEntity.setEffFrm(expected);
        Assert.assertEquals(expected,doctorEntity.getEffFrm());
    }


    @Test
    public void testGetEffTo() throws Exception {
        Date expected = new Date();
        doctorEntity.setEffTo(expected);
        Assert.assertEquals(expected,doctorEntity.getEffTo());
    }

    @Test
    public void testSetEffTo() throws Exception {
        Date expected = new Date();
        doctorEntity.setEffTo(expected);
        Assert.assertEquals(expected,doctorEntity.getEffTo());
    }



    @Test
    public void testGetDoctorUserDoctors() throws Exception {
        doctorEntity.setDoctorUserDoctors(new ArrayList());
        Assert.assertEquals(new ArrayList(),doctorEntity.getDoctorUserDoctors());
    }

    @Test
    public void testSetDoctorUserDoctors() throws Exception {
        doctorEntity.setDoctorUserDoctors(new ArrayList());
        Assert.assertEquals(new ArrayList(),doctorEntity.getDoctorUserDoctors());
    }


    @Test
    public void testGetDoctorFieldDoctors() throws Exception {
        doctorEntity.setDoctorFieldDoctors(new ArrayList());
        Assert.assertEquals(new ArrayList(),doctorEntity.getDoctorFieldDoctors());
    }

    @Test
    public void testSetDoctorFieldDoctors() throws Exception {
        doctorEntity.setDoctorFieldDoctors(new ArrayList());
        Assert.assertEquals(new ArrayList(),doctorEntity.getDoctorFieldDoctors());
    }


    @Test
    public void testGetDoctorPracticeDoctors() throws Exception {
        doctorEntity.setDoctorPracticeDoctors(new ArrayList());
        Assert.assertEquals(new ArrayList(),doctorEntity.getDoctorPracticeDoctors());
    }

    @Test
    public void testSetDoctorPracticeDoctors() throws Exception {
        doctorEntity.setDoctorPracticeDoctors(new ArrayList());
        Assert.assertEquals(new ArrayList(),doctorEntity.getDoctorPracticeDoctors());
    }


    @Test
    public void testGetReviewDoctors() throws Exception {
        doctorEntity.setReviewDoctors(new ArrayList());
        Assert.assertEquals(new ArrayList(),doctorEntity.getReviewDoctors());
    }

    @Test
    public void testSetReviewDoctors() throws Exception {
        doctorEntity.setReviewDoctors(new ArrayList());
        Assert.assertEquals(new ArrayList(),doctorEntity.getReviewDoctors());
    }


    @Test
    public void testGetAppointmentDoctors() throws Exception {
        doctorEntity.setAppointmentDoctors(new ArrayList());
        Assert.assertEquals(new ArrayList(),doctorEntity.getAppointmentDoctors());
    }

    @Test
    public void testSetAppointmentDoctors() throws Exception {
        doctorEntity.setAppointmentDoctors(new ArrayList());
        Assert.assertEquals(new ArrayList(),doctorEntity.getAppointmentDoctors());
    }


    @Test
    public void testGetPrescriptionDoctors() throws Exception {
        doctorEntity.setPrescriptionDoctors(new ArrayList());
        Assert.assertEquals(new ArrayList(),doctorEntity.getPrescriptionDoctors());
    }

    @Test
    public void testSetPrescriptionDoctors() throws Exception {
        doctorEntity.setPrescriptionDoctors(new ArrayList());
        Assert.assertEquals(new ArrayList(),doctorEntity.getPrescriptionDoctors());
    }


}