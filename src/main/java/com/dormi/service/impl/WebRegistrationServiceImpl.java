package com.dormi.service.impl;

import com.dormi.domain.Registration;
import com.dormi.domain.RegistrationExample;
import com.dormi.mapper.RegistrationMapper;
import com.dormi.service.WebRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebRegistrationServiceImpl implements WebRegistrationService {

    @Autowired
    private RegistrationMapper registrationMapper;

    @Override
    public List<Registration> findAllRegistration() {

        RegistrationExample example = new RegistrationExample();
        example.setOrderByClause(" registration_date desc ");

        List<Registration> registrations = registrationMapper.selectByExample(example);
        if(registrations.isEmpty()){
            return null;
        }else {
            return registrations;
        }

    }
}
