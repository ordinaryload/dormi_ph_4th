package com.dormi.service.impl;

import com.dormi.domain.AskLeave;
import com.dormi.domain.Registration;
import com.dormi.domain.Student;
import com.dormi.mapper.AskLeaveMapper;
import com.dormi.mapper.RegistrationMapper;
import com.dormi.mapper.StudentMapper;
import com.dormi.service.WxGoodsService;
import com.dormi.service.WxRecordViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WxRecordViewServiceImpl implements WxRecordViewService {

    @Autowired
    private AskLeaveMapper askLeaveMapper;
    @Autowired
    private RegistrationMapper registrationMapper;


//查看学生自己的请假记录
    @Override
    public List<AskLeave> leaveRecord(Student student)
    {
        return askLeaveMapper.leaveRecord(student);
    }

    //查看学生自己的出寝记录
    @Override
    public List<Registration> goodsRecord(Student student)
    {
        return registrationMapper.goodsRecord(student);
    }
}
