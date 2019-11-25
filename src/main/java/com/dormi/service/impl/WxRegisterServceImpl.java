package com.dormi.service.impl;

import com.dormi.domain.Student;
import com.dormi.mapper.StudentMapper;
import com.dormi.service.WxRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WxRegisterServceImpl implements WxRegisterService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void regist(Student student) {
        studentMapper.regist(student);
    }

//    @Override
//    public Student login(Student student) {
//        return studentMapper.login(student);
//    }
}
