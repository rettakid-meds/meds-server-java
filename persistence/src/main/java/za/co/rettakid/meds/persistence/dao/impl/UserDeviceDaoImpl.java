package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.UserDeviceDao;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class UserDeviceDaoImpl extends BaseDaoImpl<UserDeviceEntity,Long> implements UserDeviceDao   {

    public Class getEntityClass() {
        return UserDeviceEntity.class;
    }

}