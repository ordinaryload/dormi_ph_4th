package com.dormi.controller;


import com.dormi.domain.Registration;
import com.dormi.service.WxGoodsService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/wx")
public class WxGoodsController {
    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private WxGoodsService wxGoodsService;

    @RequestMapping(value = "/goods",method = RequestMethod.POST)
    @ResponseBody
    public String addGoods(@RequestBody Registration registration){
        //Registration registration = JSON.parseObject(jsonStr,Registration.class);//将json字符串转换成json对象

        this.wxGoodsService.addGoods(registration);
        return "success";
    }
}
