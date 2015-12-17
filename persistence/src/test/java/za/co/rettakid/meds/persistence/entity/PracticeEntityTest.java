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
public class PracticeEntityTest {

    private PracticeEntity practiceEntity = new PracticeEntity();


    @Test
    public void testGetPracticeId() throws Exception {
        Long expected = 512L;
        practiceEntity.setPracticeId(expected);
        Assert.assertEquals(expected,practiceEntity.getPracticeId());
    }

    @Test
    public void testSetPracticeId() throws Exception {
        Long expected = 512L;
        practiceEntity.setPracticeId(expected);
        Assert.assertEquals(expected,practiceEntity.getPracticeId());
    }


    @Test
    public void testGetName() throws Exception {
        String expected = "One Thousand";
        practiceEntity.setName(expected);
        Assert.assertEquals(expected,practiceEntity.getName());
    }

    @Test
    public void testSetName() throws Exception {
        String expected = "One Thousand";
        practiceEntity.setName(expected);
        Assert.assertEquals(expected,practiceEntity.getName());
    }


    @Test
    public void testGetEmail() throws Exception {
        String expected = "One Thousand";
        practiceEntity.setEmail(expected);
        Assert.assertEquals(expected,practiceEntity.getEmail());
    }

    @Test
    public void testSetEmail() throws Exception {
        String expected = "One Thousand";
        practiceEntity.setEmail(expected);
        Assert.assertEquals(expected,practiceEntity.getEmail());
    }


    @Test
    public void testGetLongitude() throws Exception {
        Float expected = 2048f;
        practiceEntity.setLongitude(expected);
        Assert.assertEquals(expected,practiceEntity.getLongitude());
    }

    @Test
    public void testSetLongitude() throws Exception {
        Float expected = 2048f;
        practiceEntity.setLongitude(expected);
        Assert.assertEquals(expected,practiceEntity.getLongitude());
    }


    @Test
    public void testGetLatitude() throws Exception {
        Float expected = 2048f;
        practiceEntity.setLatitude(expected);
        Assert.assertEquals(expected,practiceEntity.getLatitude());
    }

    @Test
    public void testSetLatitude() throws Exception {
        Float expected = 2048f;
        practiceEntity.setLatitude(expected);
        Assert.assertEquals(expected,practiceEntity.getLatitude());
    }


    @Test
    public void testGetAddress() throws Exception {
        String expected = "One Thousand";
        practiceEntity.setAddress(expected);
        Assert.assertEquals(expected,practiceEntity.getAddress());
    }

    @Test
    public void testSetAddress() throws Exception {
        String expected = "One Thousand";
        practiceEntity.setAddress(expected);
        Assert.assertEquals(expected,practiceEntity.getAddress());
    }


    @Test
    public void testGetTradingDay() throws Exception {
        TradingDayEntity expected = new TradingDayEntity();
        practiceEntity.setTradingDay(expected);
        Assert.assertEquals(expected,practiceEntity.getTradingDay());
    }

    @Test
    public void testSetTradingDay() throws Exception {
        TradingDayEntity expected = new TradingDayEntity();
        practiceEntity.setTradingDay(expected);
        Assert.assertEquals(expected,practiceEntity.getTradingDay());
    }


    @Test
    public void testGetPhone() throws Exception {
        String expected = "One Thousand";
        practiceEntity.setPhone(expected);
        Assert.assertEquals(expected,practiceEntity.getPhone());
    }

    @Test
    public void testSetPhone() throws Exception {
        String expected = "One Thousand";
        practiceEntity.setPhone(expected);
        Assert.assertEquals(expected,practiceEntity.getPhone());
    }


    @Test
    public void testGetFee() throws Exception {
        Float expected = 2048f;
        practiceEntity.setFee(expected);
        Assert.assertEquals(expected,practiceEntity.getFee());
    }

    @Test
    public void testSetFee() throws Exception {
        Float expected = 2048f;
        practiceEntity.setFee(expected);
        Assert.assertEquals(expected,practiceEntity.getFee());
    }


    @Test
    public void testGetImage() throws Exception {
        ImageEntity expected = new ImageEntity();
        practiceEntity.setImage(expected);
        Assert.assertEquals(expected,practiceEntity.getImage());
    }

    @Test
    public void testSetImage() throws Exception {
        ImageEntity expected = new ImageEntity();
        practiceEntity.setImage(expected);
        Assert.assertEquals(expected,practiceEntity.getImage());
    }


    @Test
    public void testGetBio() throws Exception {
        DataContentEntity expected = new DataContentEntity();
        practiceEntity.setBio(expected);
        Assert.assertEquals(expected,practiceEntity.getBio());
    }

    @Test
    public void testSetBio() throws Exception {
        DataContentEntity expected = new DataContentEntity();
        practiceEntity.setBio(expected);
        Assert.assertEquals(expected,practiceEntity.getBio());
    }


    @Test
    public void testGetEffFrm() throws Exception {
        Date expected = new Date();
        practiceEntity.setEffFrm(expected);
        Assert.assertEquals(expected,practiceEntity.getEffFrm());
    }

    @Test
    public void testSetEffFrm() throws Exception {
        Date expected = new Date();
        practiceEntity.setEffFrm(expected);
        Assert.assertEquals(expected,practiceEntity.getEffFrm());
    }


    @Test
    public void testGetEffTo() throws Exception {
        Date expected = new Date();
        practiceEntity.setEffTo(expected);
        Assert.assertEquals(expected,practiceEntity.getEffTo());
    }

    @Test
    public void testSetEffTo() throws Exception {
        Date expected = new Date();
        practiceEntity.setEffTo(expected);
        Assert.assertEquals(expected,practiceEntity.getEffTo());
    }



    @Test
    public void testGetPracticeUserPractices() throws Exception {
        practiceEntity.setPracticeUserPractices(new ArrayList());
        Assert.assertEquals(new ArrayList(),practiceEntity.getPracticeUserPractices());
    }

    @Test
    public void testSetPracticeUserPractices() throws Exception {
        practiceEntity.setPracticeUserPractices(new ArrayList());
        Assert.assertEquals(new ArrayList(),practiceEntity.getPracticeUserPractices());
    }


    @Test
    public void testGetPracticeFieldPractices() throws Exception {
        practiceEntity.setPracticeFieldPractices(new ArrayList());
        Assert.assertEquals(new ArrayList(),practiceEntity.getPracticeFieldPractices());
    }

    @Test
    public void testSetPracticeFieldPractices() throws Exception {
        practiceEntity.setPracticeFieldPractices(new ArrayList());
        Assert.assertEquals(new ArrayList(),practiceEntity.getPracticeFieldPractices());
    }


    @Test
    public void testGetPracticeMedicalAidPractices() throws Exception {
        practiceEntity.setPracticeMedicalAidPractices(new ArrayList());
        Assert.assertEquals(new ArrayList(),practiceEntity.getPracticeMedicalAidPractices());
    }

    @Test
    public void testSetPracticeMedicalAidPractices() throws Exception {
        practiceEntity.setPracticeMedicalAidPractices(new ArrayList());
        Assert.assertEquals(new ArrayList(),practiceEntity.getPracticeMedicalAidPractices());
    }


    @Test
    public void testGetDoctorPracticePractices() throws Exception {
        practiceEntity.setDoctorPracticePractices(new ArrayList());
        Assert.assertEquals(new ArrayList(),practiceEntity.getDoctorPracticePractices());
    }

    @Test
    public void testSetDoctorPracticePractices() throws Exception {
        practiceEntity.setDoctorPracticePractices(new ArrayList());
        Assert.assertEquals(new ArrayList(),practiceEntity.getDoctorPracticePractices());
    }


}