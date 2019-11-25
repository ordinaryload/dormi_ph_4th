package com.dormi.service;

import com.dormi.domain.Notice;

import java.util.List;

public interface WebNoticeService {

    Notice findOneNotice(Integer noticeId);

    /**
     * 查询公告
     * @return
     */
    List<Notice> findAllNotice();

    /**
     * 发布公告
     * @return
     */
    boolean publishNotice(Notice notice);

    /**
     * 修改公告
     * @return
     */
    boolean updataNotice(Notice notice);

}
