package com.dormi.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.dormi.domain.Evaluation;
import com.dormi.domain.Notice;
import com.dormi.service.WxNoticeService;
import com.dormi.service.WxRoomScoreService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/wx")
public class WxNoticeController {

    @Autowired
    WxNoticeService wxNoticeService;

    @ResponseBody
    @RequestMapping("/notice")
    public JSONArray selectScore(){
        List<Notice> list = new ArrayList<Notice>();
        list = this.wxNoticeService.selectNotice();
        JSONArray array = JSONArray.parseArray(JSON.toJSONString(list));
        return array;
    }

}
