package com.dormi.service.impl;

import com.dormi.domain.Evaluation;
import com.dormi.mapper.EvaluationMapper;
import com.dormi.service.WxRoomScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WxRoomScoreServiceImpl implements WxRoomScoreService {

    @Autowired
    private EvaluationMapper evaluationMapper;

    @Override
    public List<Evaluation> selectEvaluation() {
        return evaluationMapper.selectEvaluation();
    }
}
