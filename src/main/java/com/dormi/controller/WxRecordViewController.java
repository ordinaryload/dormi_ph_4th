package com.dormi.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.dormi.domain.AskLeave;
import com.dormi.domain.Notice;
import com.dormi.domain.Registration;
import com.dormi.domain.Student;
import com.dormi.service.WxGoodsService;
import com.dormi.service.WxRecordViewService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


//用于查看学生自己提交的各项记录
@Controller
@RequestMapping("/wx")
public class WxRecordViewController {
    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private WxRecordViewService wxRecordViewService;

    @RequestMapping(value = "/leaveRecord",method = RequestMethod.POST)
    @ResponseBody
    public JSONArray leaveRecord(@RequestBody Student student){
        //Registration registration = JSON.parseObject(jsonStr,Registration.class);//将json字符串转换成json对象
        List<AskLeave> list = new ArrayList<AskLeave>();
        list = this.wxRecordViewService.leaveRecord(student);
        JSONArray array = JSONArray.parseArray(JSON.toJSONString(list));
        return array;
    }

    @RequestMapping(value = "/goodsRecord",method = RequestMethod.POST)
    @ResponseBody
    public JSONArray goodsRecord(@RequestBody Student student){
        //Registration registration = JSON.parseObject(jsonStr,Registration.class);//将json字符串转换成json对象
        List<Registration> list = new ArrayList<Registration>();
        list = this.wxRecordViewService.goodsRecord(student);
        JSONArray array = JSONArray.parseArray(JSON.toJSONString(list));
        return array;
    }

}
