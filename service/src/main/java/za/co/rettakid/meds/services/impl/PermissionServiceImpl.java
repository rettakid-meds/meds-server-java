package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.rettakid.meds.services.binding.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;

@Service
public class PermissionServiceImpl implements PermissionService   {

    @Autowired
    private PermissionDao permissionDao;

    @Override
    public PermissionListDto getPermissions()  {
        PermissionListDto permissionListDto = new PermissionListDto();
        permissionListDto.addPermissionList(BindPermission.bindPermissionEntityList(permissionDao.read()));
        return permissionListDto;
    }

    @Override
    public PermissionDto getPermissions(Long permissionId)  {
        return BindPermission.bindPermission(permissionDao.read(permissionId));
    }
    
    @Override
    public void postPermissions(PermissionDto permissionDto)  {
        permissionDao.createOrUpdate(BindPermission.bindPermission(permissionDto));
    }

    @Override
    public void putPermissions(PermissionDto permissionDto)  {
        permissionDao.createOrUpdate(BindPermission.bindPermission(permissionDto));
    }

    @Override
    public void deletePermissions(Long permissionId)  {
        permissionDao.delete(permissionDao.read(permissionId));
}

}