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
public class ReviewEntityTest {

    private ReviewEntity reviewEntity = new ReviewEntity();


    @Test
    public void testGetReviewId() throws Exception {
        Long expected = 512L;
        reviewEntity.setReviewId(expected);
        Assert.assertEquals(expected,reviewEntity.getReviewId());
    }

    @Test
    public void testSetReviewId() throws Exception {
        Long expected = 512L;
        reviewEntity.setReviewId(expected);
        Assert.assertEquals(expected,reviewEntity.getReviewId());
    }


    @Test
    public void testGetDoctor() throws Exception {
        DoctorEntity expected = new DoctorEntity();
        reviewEntity.setDoctor(expected);
        Assert.assertEquals(expected,reviewEntity.getDoctor());
    }

    @Test
    public void testSetDoctor() throws Exception {
        DoctorEntity expected = new DoctorEntity();
        reviewEntity.setDoctor(expected);
        Assert.assertEquals(expected,reviewEntity.getDoctor());
    }


    @Test
    public void testGetUser() throws Exception {
        UserEntity expected = new UserEntity();
        reviewEntity.setUser(expected);
        Assert.assertEquals(expected,reviewEntity.getUser());
    }

    @Test
    public void testSetUser() throws Exception {
        UserEntity expected = new UserEntity();
        reviewEntity.setUser(expected);
        Assert.assertEquals(expected,reviewEntity.getUser());
    }


    @Test
    public void testGetRating() throws Exception {
        Integer expected = 256;
        reviewEntity.setRating(expected);
        Assert.assertEquals(expected,reviewEntity.getRating());
    }

    @Test
    public void testSetRating() throws Exception {
        Integer expected = 256;
        reviewEntity.setRating(expected);
        Assert.assertEquals(expected,reviewEntity.getRating());
    }


    @Test
    public void testGetComment() throws Exception {
        String expected = "One Thousand";
        reviewEntity.setComment(expected);
        Assert.assertEquals(expected,reviewEntity.getComment());
    }

    @Test
    public void testSetComment() throws Exception {
        String expected = "One Thousand";
        reviewEntity.setComment(expected);
        Assert.assertEquals(expected,reviewEntity.getComment());
    }


    @Test
    public void testGetEffFrm() throws Exception {
        Date expected = new Date();
        reviewEntity.setEffFrm(expected);
        Assert.assertEquals(expected,reviewEntity.getEffFrm());
    }

    @Test
    public void testSetEffFrm() throws Exception {
        Date expected = new Date();
        reviewEntity.setEffFrm(expected);
        Assert.assertEquals(expected,reviewEntity.getEffFrm());
    }



}