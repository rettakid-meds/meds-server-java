package za.co.rettakid.meds.persistence.dao;

import java.util.List;
import za.co.rettakid.meds.persistence.entity.*;

public interface PracticeUserDao extends BaseDao<PracticeUserEntity,Long>    {

    List<PracticeEntity> getPracticesForUser(UserEntity userEntity);
}