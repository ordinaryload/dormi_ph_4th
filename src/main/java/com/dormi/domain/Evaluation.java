package com.dormi.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Evaluation {

    private Integer evaluationId;

    private Double evaluationScore;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date evaluationDate;

    private String dormNumber;

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public Double getEvaluationScore() {
        return evaluationScore;
    }

    public void setEvaluationScore(Double evaluationScore) {
        this.evaluationScore = evaluationScore;
    }

//    public Date getEvaluationDate() {
//        return evaluationDate;
//    }
    //为方便list转json，将get方法重写，使返回的类型为string
    public String getEvaluationDate() {
        SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
        String dateString=fmt.format(evaluationDate);
        return dateString;
    }

    public void setEvaluationDate(Date evaluationDate) {
        this.evaluationDate = evaluationDate;
    }

    public String getDormNumber() {
        return dormNumber;
    }

    public void setDormNumber(String dormNumber) {
        this.dormNumber = dormNumber == null ? null : dormNumber.trim();
    }
}