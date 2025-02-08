package reporsitory;

import java.util.List;

public interface CrudDao <T,ID> extends SuperDao{
    boolean save(T entity);
    boolean update(ID id,T entity);
    boolean delete(ID id);
    T search(ID id);
    List<T> getAll();
}
