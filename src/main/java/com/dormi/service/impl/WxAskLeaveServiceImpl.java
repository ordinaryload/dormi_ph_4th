package com.dormi.service.impl;

import com.dormi.domain.AskLeave;
import com.dormi.domain.Registration;
import com.dormi.mapper.AskLeaveMapper;
import com.dormi.mapper.RegistrationMapper;
import com.dormi.mapper.StudentMapper;
import com.dormi.service.WxAskLeaveService;
import com.dormi.service.WxGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WxAskLeaveServiceImpl implements WxAskLeaveService {

    @Autowired
    private AskLeaveMapper askLeaveMapper;

    @Override
    public void addAskLeave(AskLeave askLeave) {
        askLeaveMapper.addAskLeave(askLeave);
    }
}
