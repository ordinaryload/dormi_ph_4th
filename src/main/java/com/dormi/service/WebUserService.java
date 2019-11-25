package com.dormi.service;

import com.dormi.domain.Administrators;


public interface WebUserService {
    /**
     * 用户注册
     * @param administrators
     * @return
     */
    boolean regist(Administrators administrators);


    /**
     * 用户登录
     * @param administrators
     * @return
     */
    Administrators login(Administrators administrators);


    Administrators findOne(int loginId);

}
