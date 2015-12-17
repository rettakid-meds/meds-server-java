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
public class DevicesTypeEntityTest {

    private DevicesTypeEntity devicesTypeEntity = new DevicesTypeEntity();


    @Test
    public void testGetDevicesTypeId() throws Exception {
        Long expected = 512L;
        devicesTypeEntity.setDevicesTypeId(expected);
        Assert.assertEquals(expected,devicesTypeEntity.getDevicesTypeId());
    }

    @Test
    public void testSetDevicesTypeId() throws Exception {
        Long expected = 512L;
        devicesTypeEntity.setDevicesTypeId(expected);
        Assert.assertEquals(expected,devicesTypeEntity.getDevicesTypeId());
    }


    @Test
    public void testGetTypeName() throws Exception {
        String expected = "One Thousand";
        devicesTypeEntity.setTypeName(expected);
        Assert.assertEquals(expected,devicesTypeEntity.getTypeName());
    }

    @Test
    public void testSetTypeName() throws Exception {
        String expected = "One Thousand";
        devicesTypeEntity.setTypeName(expected);
        Assert.assertEquals(expected,devicesTypeEntity.getTypeName());
    }


    @Test
    public void testGetCanPush() throws Exception {
        Boolean expected = false;
        devicesTypeEntity.setCanPush(expected);
        Assert.assertEquals(expected,devicesTypeEntity.getCanPush());
    }

    @Test
    public void testSetCanPush() throws Exception {
        Boolean expected = false;
        devicesTypeEntity.setCanPush(expected);
        Assert.assertEquals(expected,devicesTypeEntity.getCanPush());
    }



    @Test
    public void testGetUserDeviceTypes() throws Exception {
        devicesTypeEntity.setUserDeviceTypes(new ArrayList());
        Assert.assertEquals(new ArrayList(),devicesTypeEntity.getUserDeviceTypes());
    }

    @Test
    public void testSetUserDeviceTypes() throws Exception {
        devicesTypeEntity.setUserDeviceTypes(new ArrayList());
        Assert.assertEquals(new ArrayList(),devicesTypeEntity.getUserDeviceTypes());
    }


}