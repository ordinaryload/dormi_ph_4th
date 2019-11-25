package com.dormi.service.impl;

import com.dormi.domain.Notice;
import com.dormi.mapper.NoticeMapper;
import com.dormi.service.WxNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WxNoticeServiceImpl implements WxNoticeService{

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> selectNotice(){
        return noticeMapper.selectNotice();
    }
}
