package com.dormi.service.impl;

import com.dormi.domain.Notice;
import com.dormi.domain.NoticeExample;
import com.dormi.mapper.NoticeMapper;
import com.dormi.service.WebNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class WebNoticeServiceImpl implements WebNoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public Notice findOneNotice(Integer noticeId) {

        Notice notice = noticeMapper.selectByPrimaryKey(noticeId);
        if(notice == null){
            return null;
        }else {
            return notice;
        }
    }

    @Override
    public List<Notice> findAllNotice() {
        NoticeExample example = new NoticeExample();
        example.setOrderByClause(" notice_date desc ");

        List<Notice> notices = noticeMapper.selectByExample(example);
        if(notices.isEmpty()){
            return null;
        }else {
            return notices;
        }

    }


    /**
     * 发布一个公告
     * @param notice
     * @return
     */
    @Override
    public boolean publishNotice(Notice notice) {
        int flag = noticeMapper.insert(notice);
        if(0!=flag){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 更新一个公告
     * @param notice
     * @return "是否更改成功"
     */
    @Override
    public boolean updataNotice(Notice notice) {
        NoticeExample noticeExample = new NoticeExample();
        NoticeExample.Criteria criteria = noticeExample.createCriteria();
        if(!StringUtils.isEmpty(notice.getNoticeId())){
            criteria.andNoticeIdEqualTo(notice.getNoticeId());
        }
        int flag = noticeMapper.updateByExampleSelective(notice,noticeExample);
        if(0!=flag){
            return true;
        }else {
            return false;
        }
    }

}
