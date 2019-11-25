package com.dormi.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Notice {

    private Integer noticeId;

    private String noticeFile;

    private String noticeTitle;

    private String noticeDesc;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date noticeDate;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeFile() {
        return noticeFile;
    }

    public void setNoticeFile(String noticeFile) {
        this.noticeFile = noticeFile == null ? null : noticeFile.trim();
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    public String getNoticeDesc() {
        return noticeDesc;
    }

    public void setNoticeDesc(String noticeDesc) {
        this.noticeDesc = noticeDesc == null ? null : noticeDesc.trim();
    }

    public String getNoticeDate() {
        SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
        String dateString=fmt.format(noticeDate);
        return dateString;
    }
//    public  Date getNoticeDate(){
//        return noticeDate;
//    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }
}