package com.dormi.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AskLeave {

    private Integer leaveId;

    private String studentName;

    private String studentMajor;

    private String studentCard;

    private String leaveFile;

    private String leaveReason;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date leaveDate;

    private String dormNumber;

    public Integer getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor == null ? null : studentMajor.trim();
    }

    public String getStudentCard() {
        return studentCard;
    }

    public void setStudentCard(String studentCard) {
        this.studentCard = studentCard == null ? null : studentCard.trim();
    }

    public String getLeaveFile() {
        return leaveFile;
    }

    public void setLeaveFile(String leaveFile) {
        this.leaveFile = leaveFile == null ? null : leaveFile.trim();
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason == null ? null : leaveReason.trim();
    }

//    public Date getLeaveDate() {
//        return leaveDate;
//    }
    //为方便list转json，将get方法重写，使返回的类型为string
    public String getLeaveDate() {
        SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
        String dateString=fmt.format(leaveDate);
        return dateString;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getDormNumber() {
        return dormNumber;
    }

    public void setDormNumber(String dormNumber) {
        this.dormNumber = dormNumber == null ? null : dormNumber.trim();
    }
}