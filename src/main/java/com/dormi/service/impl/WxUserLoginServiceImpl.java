package com.dormi.service.impl;

import com.dormi.domain.AskLeave;
import com.dormi.domain.Student;
import com.dormi.mapper.AskLeaveMapper;
import com.dormi.mapper.StudentMapper;
import com.dormi.service.WxAskLeaveService;
import com.dormi.service.WxUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WxUserLoginServiceImpl implements WxUserLoginService{

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student loginCheck(Student student) {
       return studentMapper.loginCheck(student);
    }

    @Override
    public  int findUser(String studentCard)
    {
        return studentMapper.findUser(studentCard);
    }

}
