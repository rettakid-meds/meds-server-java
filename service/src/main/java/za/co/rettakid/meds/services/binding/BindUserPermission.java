package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindUserPermission {

    public static UserPermissionEntity bindUserPermission(UserPermissionDto userPermissionDto) {
        UserPermissionEntity userPermissionEntity = null;
        if (userPermissionDto != null)    {
            userPermissionEntity = new UserPermissionEntity();
            userPermissionEntity.setUserPermissionId(userPermissionDto.getUserPermissionId());
            userPermissionEntity.setUser(BindUser.bindUser(userPermissionDto.getUser()));
            userPermissionEntity.setPermission(BindPermission.bindPermission(userPermissionDto.getPermission()));
        }
        return userPermissionEntity;
    }

    public static List<UserPermissionEntity> bindUserPermissionDtoList(List<UserPermissionDto> userPermissionDtos) {
    List<UserPermissionEntity> userPermissionEntities = new ArrayList<UserPermissionEntity>();
        for (UserPermissionDto userPermissionDto : userPermissionDtos) {
            userPermissionEntities.add(bindUserPermission(userPermissionDto));
        }
        return userPermissionEntities;
    }

    public static UserPermissionDto bindUserPermission(UserPermissionEntity userPermissionEntity) {
        UserPermissionDto userPermissionDto = null;
        if (userPermissionEntity != null)    {
            userPermissionDto = new UserPermissionDto();
            userPermissionDto.setUserPermissionId(userPermissionEntity.getUserPermissionId());
            userPermissionDto.setUser(BindUser.bindUser(userPermissionEntity.getUser()));
            userPermissionDto.setPermission(BindPermission.bindPermission(userPermissionEntity.getPermission()));
        }
        return userPermissionDto;
    }

    public static List<UserPermissionDto> bindUserPermissionEntityList(List<UserPermissionEntity> userPermissionEntitys) {
        List<UserPermissionDto> userPermissionDtos = new ArrayList<UserPermissionDto>();
        for (UserPermissionEntity userPermissionEntity : userPermissionEntitys) {
            userPermissionDtos.add(bindUserPermission(userPermissionEntity));
        }
        return userPermissionDtos;
    }

}
