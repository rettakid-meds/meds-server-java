package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class ImageDaoImpl extends BaseDaoImpl<ImageEntity,Long> implements ImageDao   {

    public Class getEntityClass() {
        return ImageEntity.class;
    }

}