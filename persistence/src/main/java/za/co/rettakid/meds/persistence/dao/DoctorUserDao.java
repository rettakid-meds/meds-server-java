package za.co.rettakid.meds.persistence.dao;

import java.util.List;
import za.co.rettakid.meds.persistence.entity.*;

public interface DoctorUserDao extends BaseDao<DoctorUserEntity,Long>    {

    List<DoctorEntity> getDoctors(UserEntity userEntity);
}