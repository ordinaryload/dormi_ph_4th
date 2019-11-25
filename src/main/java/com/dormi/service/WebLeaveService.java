package com.dormi.service;

import com.dormi.domain.AskLeave;

import java.util.List;

public interface WebLeaveService {

    /**
     * 查询所有请假信息接口
     * @return
     */
    List<AskLeave> findAllLeaveMessage();
}
