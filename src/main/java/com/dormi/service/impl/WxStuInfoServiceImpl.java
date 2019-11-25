package com.dormi.service.impl;

import com.dormi.domain.Notice;
import com.dormi.domain.Student;
import com.dormi.mapper.NoticeMapper;
import com.dormi.mapper.StudentMapper;
import com.dormi.service.WxNoticeService;
import com.dormi.service.WxStuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WxStuInfoServiceImpl implements WxStuInfoService{

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectStuInfo(String studentCard){
        return studentMapper.selectStuInfo(studentCard);
    }
}
