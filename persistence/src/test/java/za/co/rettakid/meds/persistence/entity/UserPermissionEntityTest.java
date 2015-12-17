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
public class UserPermissionEntityTest {

    private UserPermissionEntity userPermissionEntity = new UserPermissionEntity();


    @Test
    public void testGetUserPermissionId() throws Exception {
        Long expected = 512L;
        userPermissionEntity.setUserPermissionId(expected);
        Assert.assertEquals(expected,userPermissionEntity.getUserPermissionId());
    }

    @Test
    public void testSetUserPermissionId() throws Exception {
        Long expected = 512L;
        userPermissionEntity.setUserPermissionId(expected);
        Assert.assertEquals(expected,userPermissionEntity.getUserPermissionId());
    }


    @Test
    public void testGetUser() throws Exception {
        UserEntity expected = new UserEntity();
        userPermissionEntity.setUser(expected);
        Assert.assertEquals(expected,userPermissionEntity.getUser());
    }

    @Test
    public void testSetUser() throws Exception {
        UserEntity expected = new UserEntity();
        userPermissionEntity.setUser(expected);
        Assert.assertEquals(expected,userPermissionEntity.getUser());
    }


    @Test
    public void testGetPermission() throws Exception {
        PermissionEntity expected = new PermissionEntity();
        userPermissionEntity.setPermission(expected);
        Assert.assertEquals(expected,userPermissionEntity.getPermission());
    }

    @Test
    public void testSetPermission() throws Exception {
        PermissionEntity expected = new PermissionEntity();
        userPermissionEntity.setPermission(expected);
        Assert.assertEquals(expected,userPermissionEntity.getPermission());
    }



}