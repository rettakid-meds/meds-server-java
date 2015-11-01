package za.co.rettakid.meds.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lwazi Prusent on 2015/10/31.
 */
public enum PermissionEnum {

    PRACTICE_LIST_READ(1l),
    PRACTICE_ITEM_READ(2l),
    PRACTICE_ITEM_ADD(3l),
    PRACTICE_ITEM_DELETE(4l),
    PRACTICE_ITEM_UPDATE(5l);

    private Long id;

    PermissionEnum(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
