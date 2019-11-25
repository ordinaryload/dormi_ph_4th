package com.dormi.service;

import com.dormi.domain.Evaluation;

import java.util.List;

public interface WebEvaluationService {

    /**
     * 查询所有评分记录
     * @return
     */
    List<Evaluation> findAllEvaluation();


    /**
     * 修改评分
     * @param evaluation
     * @return
     */
    int updateEvaluation(Evaluation evaluation);


    /**
     * 登记上传评分
     * @param evaluations
     * @return
     */
    int insertEvaluation(List<Evaluation> evaluations);
}
