package za.co.rettakid.meds.persistence.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Lwazi Prusent on 2015/09/25.
 */
public interface BaseDao<T,P extends Serializable> {

    public T read(P pk);
    public List<T> read();
    public void delete(T entity);
    public void createOrUpdate(T entity);
    public Class getEntityClass();
    public void flush();

}
