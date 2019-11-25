package com.dormi.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.dormi.domain.Notice;
import com.dormi.domain.Student;
import com.dormi.service.WxNoticeService;
import com.dormi.service.WxStuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/wx")
public class WxStuInfoController {

    @Autowired
    WxStuInfoService wxStuInfoService;

    @RequestMapping(value="/stuInfo",method = RequestMethod.POST)
    @ResponseBody
    public JSONArray selectScore(@RequestParam("studentCard") String studentCard){
        List<Student> list = new ArrayList<Student>();
        list = this.wxStuInfoService.selectStuInfo(studentCard);
        JSONArray array = JSONArray.parseArray(JSON.toJSONString(list));
        return array;
    }

}
