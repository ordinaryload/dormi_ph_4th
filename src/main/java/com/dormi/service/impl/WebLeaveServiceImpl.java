package com.dormi.service.impl;

import com.dormi.domain.AskLeave;
import com.dormi.domain.AskLeaveExample;
import com.dormi.mapper.AskLeaveMapper;
import com.dormi.service.WebLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebLeaveServiceImpl implements WebLeaveService {

    @Autowired
    private AskLeaveMapper leaveMapper;

    @Override
    public List<AskLeave> findAllLeaveMessage() {

        AskLeaveExample example = new AskLeaveExample();
        example.setOrderByClause(" leave_date desc");

        List<AskLeave> leaves = leaveMapper.selectByExample(example);

        if(leaves.isEmpty()){
            return null;
        }else {
            return leaves;
        }
    }
}
