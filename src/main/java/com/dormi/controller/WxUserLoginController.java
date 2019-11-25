package com.dormi.controller;


import com.dormi.domain.AskLeave;
import com.dormi.domain.Student;
import com.dormi.service.WxAskLeaveService;
import com.dormi.service.WxUserLoginService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/wx")
public class WxUserLoginController {
    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private WxUserLoginService wxUserLoginService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String userLogin(@RequestBody Student student) throws JsonProcessingException {
        //Registration registration = JSON.parseObject(jsonStr,Registration.class);//将json字符串转换成json对象

        Map<String,Object> returnMap = new HashMap<>();


        if(checkCard(student.getStudentCard())==true&&chechPsw(student.getStudentPassword()))
        {

            student=this.wxUserLoginService.loginCheck(student);

            if(student!=null){
                returnMap.put("state",1);
                returnMap.put("wxUser",student);

                return objectMapper.writeValueAsString(returnMap);
            }
            else {
                return "用户名或密码错误";
            }

        }
        else{
            return "用户名或密码不合法";
        }


    }
    //判断学号是否全为数字
    public static boolean checkCard(String studentCard)
    {
        if(studentCard!=null && !"".equals(studentCard.trim()))
        {
            return studentCard.matches("^[0-9]*$");
        }
        else
            return false;
    }
    //判断密码是否合法
    public static boolean chechPsw(String studentPassword)
    {
        String regExp = "^[\\w_]{3,20}$";
        if(studentPassword.matches(regExp)) {
            return true;
        }
        return false;
    }
}
