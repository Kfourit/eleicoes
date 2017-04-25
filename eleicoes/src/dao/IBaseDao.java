package dao;

import java.util.List;

public interface IBaseDao<T> {

	public void saveOrUpdate(T objs);
	public void delete(Integer id);
	public T retrieve(Integer id);
	public List<T> retrieveAll();
}
