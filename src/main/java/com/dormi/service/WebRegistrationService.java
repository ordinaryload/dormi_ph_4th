package com.dormi.service;

import com.dormi.domain.Registration;

import java.util.List;

public interface WebRegistrationService {

    /**
     * 查询所有登记信息接口
     * @return
     */
    List<Registration> findAllRegistration();
}
