package com.dormi.service.impl;

import com.dormi.domain.Registration;
import com.dormi.mapper.RegistrationMapper;
import com.dormi.mapper.StudentMapper;
import com.dormi.service.WxGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WxGoodsServiceImpl implements WxGoodsService {
    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private RegistrationMapper registrationMapper;

    @Override
    public void addGoods(Registration registration) {
        registrationMapper.addGoods(registration);
    }
}
