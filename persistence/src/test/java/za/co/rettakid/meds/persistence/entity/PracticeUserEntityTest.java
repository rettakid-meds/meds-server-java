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
public class PracticeUserEntityTest {

    private PracticeUserEntity practiceUserEntity = new PracticeUserEntity();


    @Test
    public void testGetPracticeUserId() throws Exception {
        Long expected = 512L;
        practiceUserEntity.setPracticeUserId(expected);
        Assert.assertEquals(expected,practiceUserEntity.getPracticeUserId());
    }

    @Test
    public void testSetPracticeUserId() throws Exception {
        Long expected = 512L;
        practiceUserEntity.setPracticeUserId(expected);
        Assert.assertEquals(expected,practiceUserEntity.getPracticeUserId());
    }


    @Test
    public void testGetUser() throws Exception {
        UserEntity expected = new UserEntity();
        practiceUserEntity.setUser(expected);
        Assert.assertEquals(expected,practiceUserEntity.getUser());
    }

    @Test
    public void testSetUser() throws Exception {
        UserEntity expected = new UserEntity();
        practiceUserEntity.setUser(expected);
        Assert.assertEquals(expected,practiceUserEntity.getUser());
    }


    @Test
    public void testGetPractice() throws Exception {
        PracticeEntity expected = new PracticeEntity();
        practiceUserEntity.setPractice(expected);
        Assert.assertEquals(expected,practiceUserEntity.getPractice());
    }

    @Test
    public void testSetPractice() throws Exception {
        PracticeEntity expected = new PracticeEntity();
        practiceUserEntity.setPractice(expected);
        Assert.assertEquals(expected,practiceUserEntity.getPractice());
    }



}