package com.dormi.service.impl;

import com.dormi.domain.Administrators;
import com.dormi.domain.AdministratorsExample;
import com.dormi.mapper.AdministratorsMapper;
import com.dormi.service.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebUserServiceImpl implements WebUserService {

    @Autowired
    private AdministratorsMapper administratorsMapper;





    @Override
    public boolean regist(Administrators administrator) {

        AdministratorsExample example = new AdministratorsExample();
        AdministratorsExample.Criteria criteria = example.createCriteria();
        criteria.andAdminCardEqualTo(administrator.getAdminCard());
        List<Administrators> administrators = administratorsMapper.selectByExample(example);
        if(administrators.isEmpty()){
            administratorsMapper.insertSelective(administrator);
            return true;
        }else {
            return false;
        }

    }

    @Override
    public Administrators login(Administrators administrator) {
        AdministratorsExample example = new AdministratorsExample();
        AdministratorsExample.Criteria criteria = example.createCriteria();
        criteria.andAdminCardEqualTo(administrator.getAdminCard()).andAdminPasswordEqualTo(administrator.getAdminPassword());
        List<Administrators> administrators = administratorsMapper.selectByExample(example);

        if(administrators.isEmpty()){
            return null;
        }else {
            return administrators.get(0);
        }

    }

    @Override
    public Administrators findOne(int loginId) {
        Administrators administrators = administratorsMapper.selectByPrimaryKey(loginId);

        return administrators;
    }

}
