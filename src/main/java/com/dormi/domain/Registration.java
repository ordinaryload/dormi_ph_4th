package com.dormi.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Registration {

    private Integer registrationId;

    private String studentName;

    private String studentMajor;

    private String studentCard;

    private String registrationMarks;

    private String dormNumber;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date registrationDate;

    public Integer getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Integer registrationId) {
        this.registrationId = registrationId;
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

    public String getRegistrationMarks() {
        return registrationMarks;
    }

    public void setRegistrationMarks(String registrationMarks) {
        this.registrationMarks = registrationMarks == null ? null : registrationMarks.trim();
    }

    public String getDormNumber() {
        return dormNumber;
    }

    public void setDormNumber(String dormNumber) {
        this.dormNumber = dormNumber == null ? null : dormNumber.trim();
    }

//    public Date getRegistrationDate() {
//        return registrationDate;
//    }
//为方便list转json，将get方法重写，使返回的类型为string
    public String getRegistrationDate() {
        SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
        String dateString=fmt.format(registrationDate);
        return dateString;
}

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}