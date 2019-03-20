package cn.edu.buct.controller;


import cn.edu.buct.service.StudentService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller("studentcontroller")
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/add")
    @ResponseBody
    public Map add(String addStudentID){
        Map map = new HashMap();
        map.put("success",1);
        studentService.add(addStudentID);
        return map;
    }
}
