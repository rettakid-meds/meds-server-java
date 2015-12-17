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
public class FieldEntityTest {

    private FieldEntity fieldEntity = new FieldEntity();


    @Test
    public void testGetFieldId() throws Exception {
        Long expected = 512L;
        fieldEntity.setFieldId(expected);
        Assert.assertEquals(expected,fieldEntity.getFieldId());
    }

    @Test
    public void testSetFieldId() throws Exception {
        Long expected = 512L;
        fieldEntity.setFieldId(expected);
        Assert.assertEquals(expected,fieldEntity.getFieldId());
    }


    @Test
    public void testGetName() throws Exception {
        String expected = "One Thousand";
        fieldEntity.setName(expected);
        Assert.assertEquals(expected,fieldEntity.getName());
    }

    @Test
    public void testSetName() throws Exception {
        String expected = "One Thousand";
        fieldEntity.setName(expected);
        Assert.assertEquals(expected,fieldEntity.getName());
    }


    @Test
    public void testGetMapColor() throws Exception {
        String expected = "One Thousand";
        fieldEntity.setMapColor(expected);
        Assert.assertEquals(expected,fieldEntity.getMapColor());
    }

    @Test
    public void testSetMapColor() throws Exception {
        String expected = "One Thousand";
        fieldEntity.setMapColor(expected);
        Assert.assertEquals(expected,fieldEntity.getMapColor());
    }



    @Test
    public void testGetPracticeFieldFields() throws Exception {
        fieldEntity.setPracticeFieldFields(new ArrayList());
        Assert.assertEquals(new ArrayList(),fieldEntity.getPracticeFieldFields());
    }

    @Test
    public void testSetPracticeFieldFields() throws Exception {
        fieldEntity.setPracticeFieldFields(new ArrayList());
        Assert.assertEquals(new ArrayList(),fieldEntity.getPracticeFieldFields());
    }


    @Test
    public void testGetDoctorFieldFields() throws Exception {
        fieldEntity.setDoctorFieldFields(new ArrayList());
        Assert.assertEquals(new ArrayList(),fieldEntity.getDoctorFieldFields());
    }

    @Test
    public void testSetDoctorFieldFields() throws Exception {
        fieldEntity.setDoctorFieldFields(new ArrayList());
        Assert.assertEquals(new ArrayList(),fieldEntity.getDoctorFieldFields());
    }


}