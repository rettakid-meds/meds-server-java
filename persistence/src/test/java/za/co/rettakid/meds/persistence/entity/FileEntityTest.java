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
public class FileEntityTest {

    private FileEntity fileEntity = new FileEntity();


    @Test
    public void testGetFileId() throws Exception {
        Long expected = 512L;
        fileEntity.setFileId(expected);
        Assert.assertEquals(expected,fileEntity.getFileId());
    }

    @Test
    public void testSetFileId() throws Exception {
        Long expected = 512L;
        fileEntity.setFileId(expected);
        Assert.assertEquals(expected,fileEntity.getFileId());
    }


    @Test
    public void testGetGuid() throws Exception {
        String expected = "One Thousand";
        fileEntity.setGuid(expected);
        Assert.assertEquals(expected,fileEntity.getGuid());
    }

    @Test
    public void testSetGuid() throws Exception {
        String expected = "One Thousand";
        fileEntity.setGuid(expected);
        Assert.assertEquals(expected,fileEntity.getGuid());
    }


    @Test
    public void testGetName() throws Exception {
        String expected = "One Thousand";
        fileEntity.setName(expected);
        Assert.assertEquals(expected,fileEntity.getName());
    }

    @Test
    public void testSetName() throws Exception {
        String expected = "One Thousand";
        fileEntity.setName(expected);
        Assert.assertEquals(expected,fileEntity.getName());
    }


    @Test
    public void testGetEffFrm() throws Exception {
        Date expected = new Date();
        fileEntity.setEffFrm(expected);
        Assert.assertEquals(expected,fileEntity.getEffFrm());
    }

    @Test
    public void testSetEffFrm() throws Exception {
        Date expected = new Date();
        fileEntity.setEffFrm(expected);
        Assert.assertEquals(expected,fileEntity.getEffFrm());
    }



    @Test
    public void testGetImageFiles() throws Exception {
        fileEntity.setImageFiles(new ArrayList());
        Assert.assertEquals(new ArrayList(),fileEntity.getImageFiles());
    }

    @Test
    public void testSetImageFiles() throws Exception {
        fileEntity.setImageFiles(new ArrayList());
        Assert.assertEquals(new ArrayList(),fileEntity.getImageFiles());
    }


    @Test
    public void testGetPrescriptionFiles() throws Exception {
        fileEntity.setPrescriptionFiles(new ArrayList());
        Assert.assertEquals(new ArrayList(),fileEntity.getPrescriptionFiles());
    }

    @Test
    public void testSetPrescriptionFiles() throws Exception {
        fileEntity.setPrescriptionFiles(new ArrayList());
        Assert.assertEquals(new ArrayList(),fileEntity.getPrescriptionFiles());
    }


}