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
public class UserDeviceEntityTest {

    private UserDeviceEntity userDeviceEntity = new UserDeviceEntity();


    @Test
    public void testGetUserDevicesId() throws Exception {
        Long expected = 512L;
        userDeviceEntity.setUserDevicesId(expected);
        Assert.assertEquals(expected,userDeviceEntity.getUserDevicesId());
    }

    @Test
    public void testSetUserDevicesId() throws Exception {
        Long expected = 512L;
        userDeviceEntity.setUserDevicesId(expected);
        Assert.assertEquals(expected,userDeviceEntity.getUserDevicesId());
    }


    @Test
    public void testGetUser() throws Exception {
        UserEntity expected = new UserEntity();
        userDeviceEntity.setUser(expected);
        Assert.assertEquals(expected,userDeviceEntity.getUser());
    }

    @Test
    public void testSetUser() throws Exception {
        UserEntity expected = new UserEntity();
        userDeviceEntity.setUser(expected);
        Assert.assertEquals(expected,userDeviceEntity.getUser());
    }


    @Test
    public void testGetType() throws Exception {
        DevicesTypeEntity expected = new DevicesTypeEntity();
        userDeviceEntity.setType(expected);
        Assert.assertEquals(expected,userDeviceEntity.getType());
    }

    @Test
    public void testSetType() throws Exception {
        DevicesTypeEntity expected = new DevicesTypeEntity();
        userDeviceEntity.setType(expected);
        Assert.assertEquals(expected,userDeviceEntity.getType());
    }


    @Test
    public void testGetName() throws Exception {
        String expected = "One Thousand";
        userDeviceEntity.setName(expected);
        Assert.assertEquals(expected,userDeviceEntity.getName());
    }

    @Test
    public void testSetName() throws Exception {
        String expected = "One Thousand";
        userDeviceEntity.setName(expected);
        Assert.assertEquals(expected,userDeviceEntity.getName());
    }


    @Test
    public void testGetDevicePushId() throws Exception {
        String expected = "One Thousand";
        userDeviceEntity.setDevicePushId(expected);
        Assert.assertEquals(expected,userDeviceEntity.getDevicePushId());
    }

    @Test
    public void testSetDevicePushId() throws Exception {
        String expected = "One Thousand";
        userDeviceEntity.setDevicePushId(expected);
        Assert.assertEquals(expected,userDeviceEntity.getDevicePushId());
    }



}