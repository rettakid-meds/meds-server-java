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
public class PrescriptionEntityTest {

    private PrescriptionEntity prescriptionEntity = new PrescriptionEntity();


    @Test
    public void testGetPrescriptionId() throws Exception {
        Long expected = 512L;
        prescriptionEntity.setPrescriptionId(expected);
        Assert.assertEquals(expected,prescriptionEntity.getPrescriptionId());
    }

    @Test
    public void testSetPrescriptionId() throws Exception {
        Long expected = 512L;
        prescriptionEntity.setPrescriptionId(expected);
        Assert.assertEquals(expected,prescriptionEntity.getPrescriptionId());
    }


    @Test
    public void testGetAppointment() throws Exception {
        AppointmentEntity expected = new AppointmentEntity();
        prescriptionEntity.setAppointment(expected);
        Assert.assertEquals(expected,prescriptionEntity.getAppointment());
    }

    @Test
    public void testSetAppointment() throws Exception {
        AppointmentEntity expected = new AppointmentEntity();
        prescriptionEntity.setAppointment(expected);
        Assert.assertEquals(expected,prescriptionEntity.getAppointment());
    }


    @Test
    public void testGetDoctor() throws Exception {
        DoctorEntity expected = new DoctorEntity();
        prescriptionEntity.setDoctor(expected);
        Assert.assertEquals(expected,prescriptionEntity.getDoctor());
    }

    @Test
    public void testSetDoctor() throws Exception {
        DoctorEntity expected = new DoctorEntity();
        prescriptionEntity.setDoctor(expected);
        Assert.assertEquals(expected,prescriptionEntity.getDoctor());
    }


    @Test
    public void testGetUser() throws Exception {
        UserEntity expected = new UserEntity();
        prescriptionEntity.setUser(expected);
        Assert.assertEquals(expected,prescriptionEntity.getUser());
    }

    @Test
    public void testSetUser() throws Exception {
        UserEntity expected = new UserEntity();
        prescriptionEntity.setUser(expected);
        Assert.assertEquals(expected,prescriptionEntity.getUser());
    }


    @Test
    public void testGetFile() throws Exception {
        FileEntity expected = new FileEntity();
        prescriptionEntity.setFile(expected);
        Assert.assertEquals(expected,prescriptionEntity.getFile());
    }

    @Test
    public void testSetFile() throws Exception {
        FileEntity expected = new FileEntity();
        prescriptionEntity.setFile(expected);
        Assert.assertEquals(expected,prescriptionEntity.getFile());
    }


    @Test
    public void testGetEffFrm() throws Exception {
        Date expected = new Date();
        prescriptionEntity.setEffFrm(expected);
        Assert.assertEquals(expected,prescriptionEntity.getEffFrm());
    }

    @Test
    public void testSetEffFrm() throws Exception {
        Date expected = new Date();
        prescriptionEntity.setEffFrm(expected);
        Assert.assertEquals(expected,prescriptionEntity.getEffFrm());
    }


    @Test
    public void testGetEffTo() throws Exception {
        Date expected = new Date();
        prescriptionEntity.setEffTo(expected);
        Assert.assertEquals(expected,prescriptionEntity.getEffTo());
    }

    @Test
    public void testSetEffTo() throws Exception {
        Date expected = new Date();
        prescriptionEntity.setEffTo(expected);
        Assert.assertEquals(expected,prescriptionEntity.getEffTo());
    }



    @Test
    public void testGetPrescriptionItemPrescriptions() throws Exception {
        prescriptionEntity.setPrescriptionItemPrescriptions(new ArrayList());
        Assert.assertEquals(new ArrayList(),prescriptionEntity.getPrescriptionItemPrescriptions());
    }

    @Test
    public void testSetPrescriptionItemPrescriptions() throws Exception {
        prescriptionEntity.setPrescriptionItemPrescriptions(new ArrayList());
        Assert.assertEquals(new ArrayList(),prescriptionEntity.getPrescriptionItemPrescriptions());
    }


}