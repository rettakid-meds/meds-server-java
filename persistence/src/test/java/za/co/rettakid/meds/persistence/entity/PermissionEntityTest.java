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
public class PermissionEntityTest {

    private PermissionEntity permissionEntity = new PermissionEntity();


    @Test
    public void testGetPermissionId() throws Exception {
        Long expected = 512L;
        permissionEntity.setPermissionId(expected);
        Assert.assertEquals(expected,permissionEntity.getPermissionId());
    }

    @Test
    public void testSetPermissionId() throws Exception {
        Long expected = 512L;
        permissionEntity.setPermissionId(expected);
        Assert.assertEquals(expected,permissionEntity.getPermissionId());
    }


    @Test
    public void testGetPermissionName() throws Exception {
        String expected = "One Thousand";
        permissionEntity.setPermissionName(expected);
        Assert.assertEquals(expected,permissionEntity.getPermissionName());
    }

    @Test
    public void testSetPermissionName() throws Exception {
        String expected = "One Thousand";
        permissionEntity.setPermissionName(expected);
        Assert.assertEquals(expected,permissionEntity.getPermissionName());
    }



    @Test
    public void testGetUserPermissionPermissions() throws Exception {
        permissionEntity.setUserPermissionPermissions(new ArrayList());
        Assert.assertEquals(new ArrayList(),permissionEntity.getUserPermissionPermissions());
    }

    @Test
    public void testSetUserPermissionPermissions() throws Exception {
        permissionEntity.setUserPermissionPermissions(new ArrayList());
        Assert.assertEquals(new ArrayList(),permissionEntity.getUserPermissionPermissions());
    }


}