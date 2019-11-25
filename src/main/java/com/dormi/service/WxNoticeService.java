package com.dormi.service;

import com.dormi.domain.Notice;


import java.util.List;


public interface WxNoticeService {
    List<Notice> selectNotice();
}
