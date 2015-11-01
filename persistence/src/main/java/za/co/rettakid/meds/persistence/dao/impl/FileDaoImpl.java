package za.co.rettakid.meds.persistence.dao.impl;

import org.springframework.stereotype.Service;
import java.util.Date;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
public class FileDaoImpl extends BaseDaoImpl<FileEntity,Long> implements FileDao   {

    public Class getEntityClass() {
        return FileEntity.class;
    }

}