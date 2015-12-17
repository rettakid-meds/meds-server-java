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
public class PracticeFieldEntityTest {

    private PracticeFieldEntity practiceFieldEntity = new PracticeFieldEntity();


    @Test
    public void testGetPracticeFieldId() throws Exception {
        Long expected = 512L;
        practiceFieldEntity.setPracticeFieldId(expected);
        Assert.assertEquals(expected,practiceFieldEntity.getPracticeFieldId());
    }

    @Test
    public void testSetPracticeFieldId() throws Exception {
        Long expected = 512L;
        practiceFieldEntity.setPracticeFieldId(expected);
        Assert.assertEquals(expected,practiceFieldEntity.getPracticeFieldId());
    }


    @Test
    public void testGetField() throws Exception {
        FieldEntity expected = new FieldEntity();
        practiceFieldEntity.setField(expected);
        Assert.assertEquals(expected,practiceFieldEntity.getField());
    }

    @Test
    public void testSetField() throws Exception {
        FieldEntity expected = new FieldEntity();
        practiceFieldEntity.setField(expected);
        Assert.assertEquals(expected,practiceFieldEntity.getField());
    }


    @Test
    public void testGetPractice() throws Exception {
        PracticeEntity expected = new PracticeEntity();
        practiceFieldEntity.setPractice(expected);
        Assert.assertEquals(expected,practiceFieldEntity.getPractice());
    }

    @Test
    public void testSetPractice() throws Exception {
        PracticeEntity expected = new PracticeEntity();
        practiceFieldEntity.setPractice(expected);
        Assert.assertEquals(expected,practiceFieldEntity.getPractice());
    }



}