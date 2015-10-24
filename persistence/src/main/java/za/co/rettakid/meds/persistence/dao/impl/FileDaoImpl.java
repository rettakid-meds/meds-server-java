package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import za.co.rettakid.meds.persistence.dao.FileDao;
import za.co.rettakid.meds.persistence.entity.*;
import java.util.Date;

@Service
public class FileDaoImpl extends BaseDaoImpl<FileEntity,Long> implements FileDao   {

    public Class getEntityClass() {
        return FileEntity.class;
    }

}