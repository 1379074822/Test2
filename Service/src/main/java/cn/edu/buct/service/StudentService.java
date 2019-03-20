package cn.edu.buct.service;

import cn.edu.buct.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentservice")
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    public boolean add(String addStudentID){
        int i=studentDao.insert(addStudentID);
        return i>0;
    }
}
