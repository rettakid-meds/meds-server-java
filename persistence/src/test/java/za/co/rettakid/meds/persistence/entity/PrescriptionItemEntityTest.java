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
public class PrescriptionItemEntityTest {

    private PrescriptionItemEntity prescriptionItemEntity = new PrescriptionItemEntity();


    @Test
    public void testGetPrescriptionItemId() throws Exception {
        Long expected = 512L;
        prescriptionItemEntity.setPrescriptionItemId(expected);
        Assert.assertEquals(expected,prescriptionItemEntity.getPrescriptionItemId());
    }

    @Test
    public void testSetPrescriptionItemId() throws Exception {
        Long expected = 512L;
        prescriptionItemEntity.setPrescriptionItemId(expected);
        Assert.assertEquals(expected,prescriptionItemEntity.getPrescriptionItemId());
    }


    @Test
    public void testGetPrescription() throws Exception {
        PrescriptionEntity expected = new PrescriptionEntity();
        prescriptionItemEntity.setPrescription(expected);
        Assert.assertEquals(expected,prescriptionItemEntity.getPrescription());
    }

    @Test
    public void testSetPrescription() throws Exception {
        PrescriptionEntity expected = new PrescriptionEntity();
        prescriptionItemEntity.setPrescription(expected);
        Assert.assertEquals(expected,prescriptionItemEntity.getPrescription());
    }


    @Test
    public void testGetName() throws Exception {
        String expected = "One Thousand";
        prescriptionItemEntity.setName(expected);
        Assert.assertEquals(expected,prescriptionItemEntity.getName());
    }

    @Test
    public void testSetName() throws Exception {
        String expected = "One Thousand";
        prescriptionItemEntity.setName(expected);
        Assert.assertEquals(expected,prescriptionItemEntity.getName());
    }



}