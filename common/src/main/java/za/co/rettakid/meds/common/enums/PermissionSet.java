package za.co.rettakid.meds.common.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Lwazi Prusent on 2015/10/31.
 */
public enum PermissionSet {
    NORMAL(PermissionEnum.PRACTICE_LIST_READ,
            PermissionEnum.PRACTICE_ITEM_READ),
    PRACTICE(PermissionEnum.PRACTICE_LIST_READ,
            PermissionEnum.PRACTICE_ITEM_READ,
            PermissionEnum.PRACTICE_ITEM_UPDATE),
    DOCTOR(PermissionEnum.PRACTICE_LIST_READ,
            PermissionEnum.PRACTICE_ITEM_READ),
    ADMIN(PermissionEnum.PRACTICE_LIST_READ,
            PermissionEnum.PRACTICE_ITEM_READ,
            PermissionEnum.PRACTICE_ITEM_ADD,
            PermissionEnum.PRACTICE_ITEM_DELETE,
            PermissionEnum.PRACTICE_ITEM_UPDATE);

    private List<PermissionEnum> permission;

    PermissionSet(PermissionEnum... permission) {
        this.permission = Arrays.asList(permission);
    }

    public List<PermissionEnum> getPermission() {
        return permission;
    }

    public void setPermission(List<PermissionEnum> permission) {
        this.permission = permission;
    }
}