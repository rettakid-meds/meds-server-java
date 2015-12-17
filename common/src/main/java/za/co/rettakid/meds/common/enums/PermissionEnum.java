package za.co.rettakid.meds.common.enums;

/**
 * Created by Lwazi Prusent on 2015/10/31.
 */
public enum PermissionEnum {

    PRACTICE_LIST_READ(1l,PermissionEnumType.PRACTICE),
    PRACTICE_ITEM_READ(2l,PermissionEnumType.PRACTICE),
    PRACTICE_ITEM_ADD(3l,PermissionEnumType.PRACTICE),
    PRACTICE_ITEM_DELETE(4l,PermissionEnumType.PRACTICE),
    PRACTICE_ITEM_UPDATE(5l,PermissionEnumType.PRACTICE),
    PRACTICE_OVERRIDE(6l,PermissionEnumType.PRACTICE),

    DOCTOR_LIST_READ(7l,PermissionEnumType.DOCTOR),
    DOCTOR_ITEM_READ(8l,PermissionEnumType.DOCTOR),
    DOCTOR_ITEM_ADD(9l,PermissionEnumType.DOCTOR),
    DOCTOR_ITEM_DELETE(10l,PermissionEnumType.DOCTOR),
    DOCTOR_ITEM_UPDATE(11l,PermissionEnumType.DOCTOR),
    DOCTOR_OVERRIDE(12l,PermissionEnumType.PRACTICE);

    private Long id;
    private PermissionEnumType type;

    PermissionEnum(Long id,PermissionEnumType type) {
        this.id = id;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public PermissionEnumType getType() {
        return type;
    }

    public static PermissionEnum get(String permissionEnumString)    {
        for (PermissionEnum permissionEnum : values()) {
            if (permissionEnum.name().equals(permissionEnumString)) {
                return permissionEnum;
            }
        }
        return null;
    }

    public String getCustomPermission(Long id) {
        return name() + "_" + id;
    }

}
