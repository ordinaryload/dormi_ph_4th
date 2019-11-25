package com.dormi.controller;

import com.dormi.constant.DormiConstants;
import com.dormi.domain.Evaluation;
import com.dormi.service.WebEvaluationService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/webEvaluation")
public class WebEvaluationController {

    @Autowired
    private WebEvaluationService webEvaluationService;

    @Autowired
    private ObjectMapper objectMapper;

    /**
     * 查询所有评分结果
     * @return
     * @throws JsonProcessingException
     */
    @RequestMapping(value = "/findAllEvaluation",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String findAllEvaluation() throws JsonProcessingException {
        List<Evaluation> allEvaluation = webEvaluationService.findAllEvaluation();
        Map<String,Object> returnMap = new HashMap<>();
        if(allEvaluation != null){
            returnMap.put("allEvaluation",allEvaluation);
            returnMap.put("state", DormiConstants.SUCCESS);
        }else {
            returnMap.put("state", DormiConstants.fail);
        }
        return objectMapper.writeValueAsString(returnMap);
    }

    /**
     * 修改评分
     * @param evaluation
     * @return
     * @throws JsonProcessingException
     */
    @RequestMapping(value = "/updateEvaluation",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String updateEvaluation(@RequestBody Evaluation evaluation) throws JsonProcessingException {
        int index = webEvaluationService.updateEvaluation(evaluation);
        Map<String,Object> returnMap = new HashMap<>();
        if(index == 1){
            returnMap.put("state", DormiConstants.SUCCESS);
        }else {
            returnMap.put("state", DormiConstants.fail);
        }

        return objectMapper.writeValueAsString(returnMap);
    }


    @RequestMapping(value = "/insertEvaluation",method = RequestMethod.PUT,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String insertEvaluation(@RequestBody List<Evaluation> evaluations) throws JsonProcessingException {
        for (Evaluation evaluation:evaluations){
            evaluation.setEvaluationDate(new Date());
        }
        int result = webEvaluationService.insertEvaluation(evaluations);
        Map<String,Object> returnMap = new HashMap<>();
        if(result > 0){
            returnMap.put("state", DormiConstants.SUCCESS);
        }else {
            returnMap.put("state", DormiConstants.fail);
        }


        return objectMapper.writeValueAsString(returnMap);
    }

}
