package com.dormi.service.impl;

import com.dormi.domain.Evaluation;
import com.dormi.domain.EvaluationExample;
import com.dormi.mapper.EvaluationMapper;
import com.dormi.mapper.Mr.InsertEvaluationMapper;
import com.dormi.service.WebEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class WebEvaluationServiceImpl implements WebEvaluationService {

    @Autowired
    private EvaluationMapper evaluationMapper;

    @Autowired
    private InsertEvaluationMapper insertEvaluationMapper;

    @Override
    public List<Evaluation> findAllEvaluation() {
        EvaluationExample example = new EvaluationExample();
        example.setOrderByClause(" evaluation_date desc ");

        List<Evaluation> evaluations = evaluationMapper.selectByExample(example);
        if(evaluations.isEmpty()){
            return null;
        }else {
            return evaluations;
        }

    }

    @Override
    public int updateEvaluation(Evaluation evaluation) {
        EvaluationExample example = new EvaluationExample();
        EvaluationExample.Criteria criteria = example.createCriteria();

        if(!StringUtils.isEmpty(evaluation.getDormNumber())){
            criteria.andDormNumberEqualTo(evaluation.getDormNumber());
        }

        return evaluationMapper.updateByExampleSelective(evaluation, example);

    }

    @Override
    public int insertEvaluation(List<Evaluation> evaluations) {

       /* for (Evaluation evaluation : evaluations){
            int insert = evaluationMapper.insert(evaluation);
        }*/

        try {
            return insertEvaluationMapper.insertEvaluations(evaluations);
        } catch (Exception e) {

            e.printStackTrace();
            return -1;
        }

    }
}
