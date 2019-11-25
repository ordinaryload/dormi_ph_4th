package com.dormi.service;

import com.dormi.domain.Evaluation;
import org.springframework.stereotype.Service;

import java.util.List;


public interface WxRoomScoreService {
    List<Evaluation> selectEvaluation();
}
