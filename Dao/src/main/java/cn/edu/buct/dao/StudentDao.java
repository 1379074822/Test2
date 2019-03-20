package cn.edu.buct.dao;

import org.springframework.stereotype.Repository;

@Repository("studentdao")
public interface StudentDao {
    Integer insert(String sid);
}
