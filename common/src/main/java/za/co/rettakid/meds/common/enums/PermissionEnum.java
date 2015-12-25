package za.co.rettakid.meds.common.enums;

/**
 * Created by Lwazi Prusent on 2015/10/31.
 */
public enum PermissionEnum {

    PRACTICE_LIST_READ(1L,PermissionEnumType.PRACTICE),
    PRACTICE_ITEM_READ(2L,PermissionEnumType.PRACTICE),
    PRACTICE_ITEM_ADD(3L,PermissionEnumType.PRACTICE),
    PRACTICE_ITEM_DELETE(4L,PermissionEnumType.PRACTICE),
    PRACTICE_ITEM_UPDATE(5L,PermissionEnumType.PRACTICE),
    PRACTICE_OVERRIDE(6L,PermissionEnumType.PRACTICE),

    DOCTOR_LIST_READ(7L,PermissionEnumType.DOCTOR),
    DOCTOR_ITEM_READ(8L,PermissionEnumType.DOCTOR),
    DOCTOR_ITEM_ADD(9L,PermissionEnumType.DOCTOR),
    DOCTOR_ITEM_DELETE(10L,PermissionEnumType.DOCTOR),
    DOCTOR_ITEM_UPDATE(11L,PermissionEnumType.DOCTOR),
    DOCTOR_OVERRIDE(12L,PermissionEnumType.PRACTICE),

    DOCTOR_SCHEDULE_LIST_READ(13L,PermissionEnumType.DOCTOR_SCHEDULE),
    DOCTOR_SCHEDULE_ITEM_READ(14L,PermissionEnumType.DOCTOR_SCHEDULE),
    DOCTOR_SCHEDULE_ITEM_ADD(15L,PermissionEnumType.DOCTOR_SCHEDULE),
    DOCTOR_SCHEDULE_ITEM_DELETE(16L,PermissionEnumType.DOCTOR_SCHEDULE),
    DOCTOR_SCHEDULE_ITEM_UPDATE(17L,PermissionEnumType.DOCTOR_SCHEDULE),
    DOCTOR_SCHEDULE_OVERRIDE(18L,PermissionEnumType.DOCTOR_SCHEDULE),

    FIELD_LIST_READ(19L,PermissionEnumType.FIELD),
    FIELD_ITEM_READ(20L,PermissionEnumType.FIELD),
    FIELD_ITEM_ADD(21L,PermissionEnumType.FIELD),
    FIELD_ITEM_DELETE(22L,PermissionEnumType.FIELD),
    FIELD_ITEM_UPDATE(23L,PermissionEnumType.FIELD),
    FIELD_OVERRIDE(24L,PermissionEnumType.FIELD);

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
