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
public class ImageEntityTest {

    private ImageEntity imageEntity = new ImageEntity();


    @Test
    public void testGetImageId() throws Exception {
        Long expected = 512L;
        imageEntity.setImageId(expected);
        Assert.assertEquals(expected,imageEntity.getImageId());
    }

    @Test
    public void testSetImageId() throws Exception {
        Long expected = 512L;
        imageEntity.setImageId(expected);
        Assert.assertEquals(expected,imageEntity.getImageId());
    }


    @Test
    public void testGetFile() throws Exception {
        FileEntity expected = new FileEntity();
        imageEntity.setFile(expected);
        Assert.assertEquals(expected,imageEntity.getFile());
    }

    @Test
    public void testSetFile() throws Exception {
        FileEntity expected = new FileEntity();
        imageEntity.setFile(expected);
        Assert.assertEquals(expected,imageEntity.getFile());
    }


    @Test
    public void testGetWidth() throws Exception {
        Integer expected = 256;
        imageEntity.setWidth(expected);
        Assert.assertEquals(expected,imageEntity.getWidth());
    }

    @Test
    public void testSetWidth() throws Exception {
        Integer expected = 256;
        imageEntity.setWidth(expected);
        Assert.assertEquals(expected,imageEntity.getWidth());
    }


    @Test
    public void testGetHeight() throws Exception {
        Integer expected = 256;
        imageEntity.setHeight(expected);
        Assert.assertEquals(expected,imageEntity.getHeight());
    }

    @Test
    public void testSetHeight() throws Exception {
        Integer expected = 256;
        imageEntity.setHeight(expected);
        Assert.assertEquals(expected,imageEntity.getHeight());
    }



    @Test
    public void testGetPracticeImages() throws Exception {
        imageEntity.setPracticeImages(new ArrayList());
        Assert.assertEquals(new ArrayList(),imageEntity.getPracticeImages());
    }

    @Test
    public void testSetPracticeImages() throws Exception {
        imageEntity.setPracticeImages(new ArrayList());
        Assert.assertEquals(new ArrayList(),imageEntity.getPracticeImages());
    }


    @Test
    public void testGetDoctorImages() throws Exception {
        imageEntity.setDoctorImages(new ArrayList());
        Assert.assertEquals(new ArrayList(),imageEntity.getDoctorImages());
    }

    @Test
    public void testSetDoctorImages() throws Exception {
        imageEntity.setDoctorImages(new ArrayList());
        Assert.assertEquals(new ArrayList(),imageEntity.getDoctorImages());
    }


    @Test
    public void testGetDoctorIcons() throws Exception {
        imageEntity.setDoctorIcons(new ArrayList());
        Assert.assertEquals(new ArrayList(),imageEntity.getDoctorIcons());
    }

    @Test
    public void testSetDoctorIcons() throws Exception {
        imageEntity.setDoctorIcons(new ArrayList());
        Assert.assertEquals(new ArrayList(),imageEntity.getDoctorIcons());
    }


}