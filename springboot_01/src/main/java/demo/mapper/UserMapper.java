package demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper<T> {

    public void insert(T t);

    public void delete(int id);

    public void update(T t);

    public T get(int id);

    public List<T> findAll();

    public int getCountById(int id);

    public List<T> getyName(String name);

}
