package com.dormi.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.dormi.domain.Evaluation;
import com.dormi.service.WxRoomScoreService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/wx")
public class WxRoomScoreController {
    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    WxRoomScoreService wxRoomScoreService;

    @ResponseBody
    @RequestMapping("/roomScore")
    public JSONArray selectScore(){
        List<Evaluation> list = new ArrayList<Evaluation>();
        list = this.wxRoomScoreService.selectEvaluation();
        com.alibaba.fastjson.JSONArray array = com.alibaba.fastjson.JSONArray.parseArray(JSON.toJSONString(list));
        return array;
    }

}
